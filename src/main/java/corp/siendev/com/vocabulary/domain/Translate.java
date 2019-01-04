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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * Word's translate.
 *
 * @author Golubnichenko Yurii
 */
@Data
@Entity
@Table(name = "translate")
public class Translate implements Serializable {

    private static final long serialVersionUID = 8379980542072028602L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "translate")
    private String translate;

    @ManyToMany
    @JoinTable(
            name = "word_translate",
            joinColumns = @JoinColumn(name = "translate_id"),
            inverseJoinColumns = @JoinColumn(name = "word_id"))
    @JsonIgnore
    private Set<Word> words;

}
