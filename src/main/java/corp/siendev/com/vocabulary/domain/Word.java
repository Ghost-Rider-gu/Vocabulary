/*
 * Copyright (c) 2018. SienDev, Inc. and Golubnichenko Yurii.  All Rights Reserved.
 */

package corp.siendev.com.vocabulary.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import corp.siendev.com.vocabulary.domain.utils.AuditModel;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * Word entity. Add new words.
 *
 * @author Golubnichenko Yurii
 */
@Data
@Entity
@Table(name = "word")
public class Word extends AuditModel implements Serializable {

    private static final long serialVersionUID = 3132167399148271724L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "word")
    private String word;

    @NotNull
    @Column(name = "month")
    private String month;

    @NotNull
    @Column(name = "year")
    private int year;

    @ManyToOne
    @JsonIgnore
    private Vocabulary vocabulary;

    @ManyToOne
    @JsonIgnore
    private Category category;

    @ManyToMany(mappedBy = "words")
    @JsonIgnore
    private Set<Translate> translates;

}
