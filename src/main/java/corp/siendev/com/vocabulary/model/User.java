/*
 * Copyright (c) 2018. SienDev, Inc. and Golubnichenko Yuriy.  All Rights Reserved.
 */

package corp.siendev.com.vocabulary.model;

import corp.siendev.com.vocabulary.model.util.AuditModel;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.io.Serializable;

/**
 * Users which may use vocabulary application.
 * Build new personal vocabulary, add new words, delete, update and search words.
 *
 * @author Golubnichenko Yuriy
 */
@Data
@Entity
@Table(name = "users")
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

}
