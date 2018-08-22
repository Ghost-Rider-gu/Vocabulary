/*
 * Copyright (c) 2018. SienDev, Inc. and Golubnichenko Yuriy.  All Rights Reserved.
 */

package corp.siendev.com.vocabulary.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.FetchType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Users which may use vocabulary application.
 * Build new personal vocabulary, add new words, delete, update and search words.
 *
 * @author Golubnichenko Yuriy
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = -5054991725759496635L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Vocabulary> vocabularyList;

}
