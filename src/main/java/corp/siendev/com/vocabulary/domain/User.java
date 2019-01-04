/*
 * Copyright (c) 2018. SienDev, Inc. and Golubnichenko Yurii.  All Rights Reserved.
 */

package corp.siendev.com.vocabulary.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import corp.siendev.com.vocabulary.domain.utils.AuditModel;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.io.Serializable;
import java.util.List;

/**
 * Users which may use vocabulary application.
 * Build new personal vocabulary, add new words, delete, update and search words.
 *
 * @author Golubnichenko Yurii
 */
@Data
@Entity
@Table(name = "user")
public class User extends AuditModel implements Serializable {

    private static final long serialVersionUID = -5054991725759496635L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(max = 35)
    @Column(name = "login", unique = true)
    private String login;

    @NotNull
    @Column(name = "password")
    private String password;

    @ManyToMany
    @JoinTable(
            name = "user_vocabulary",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "vocabulary_id"))
    @JsonIgnore
    private List<Vocabulary> vocabularies;

}
