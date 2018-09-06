/*
 * Copyright (c) 2018. SienDev, Inc. and Golubnichenko Yuriy.  All Rights Reserved.
 */

package corp.siendev.com.vocabulary.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import corp.siendev.com.vocabulary.model.util.AuditModel;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Word entity. Add new words.
 *
 * @author Golubnichenko Yuriy
 */
@Data
@Entity
@Table(name = "words")
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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vocabulary_id", nullable = false)
    @JsonIgnore
    private Vocabulary vocabulary;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    @JsonIgnore
    private Category category;

}
