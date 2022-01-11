/*
 * Copyright (c) 2021. SienDev, Inc. and Golubnichenko Iurii.  All Rights Reserved.
 */

package corp.siendev.com.verbarium.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
@ApiModel(value = "User entity description")
public class User implements Serializable {
    private static final long serialVersionUID = 5054991725759496635L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(
            value = "unique id of user",
            name = "id",
            dataType = "Long",
            example = "12",
            required = true)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "name", unique = true)
    @ApiModelProperty(
            value = "name or nickname of user",
            name = "name",
            dataType = "String",
            example = "Peter / Peter_The_Almighty",
            required = true)
    private String name;

    @NotNull
    @Size(min = 8, max = 25)
    @Column(name = "password")
    @ApiModelProperty(
            value = "user's password",
            name = "password",
            dataType = "String",
            example = "super_secured_password",
            required = true)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    @ApiModelProperty(
            value = "user's profile id",
            name = "userProfile",
            dataType = "UserProfile",
            example = "14",
            required = true)
    private UserProfile userProfile;

    @ManyToMany
    @JoinTable(name = "user_word",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "word_id"))
    @ApiModelProperty(
            value = "user's words list",
            name = "words",
            dataType = "Set<Word>",
            example = "['tree', 'docker', 'family']",
            required = true)
    private Set<Word> words = new HashSet<>();
}
