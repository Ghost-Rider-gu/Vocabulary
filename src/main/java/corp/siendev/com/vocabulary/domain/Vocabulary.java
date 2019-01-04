/*
 * Copyright (c) 2018. SienDev, Inc. and Golubnichenko Yurii.  All Rights Reserved.
 */

package corp.siendev.com.vocabulary.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * User's vocabulary.
 *
 * @author Golubnichenko Yurii
 */
@Data
@Entity
@Table(name = "vocabulary")
public class Vocabulary implements Serializable {

    private static final long serialVersionUID = 9111865057025931113L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(max = 30)
    @Column(name = "name")
    private String vocabularyName;

    @OneToMany(mappedBy = "vocabulary")
    @JsonIgnore
    private Set<Word> words;

    @ManyToMany(mappedBy = "vocabularies")
    @JsonIgnore
    private List<User> users;

}
