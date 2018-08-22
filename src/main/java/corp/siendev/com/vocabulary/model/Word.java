/*
 * Copyright (c) 2018. SienDev, Inc. and Golubnichenko Yuriy.  All Rights Reserved.
 */

package corp.siendev.com.vocabulary.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Word entity. Add new words.
 *
 * @author Golubnichenko Yuriy
 */
@Data
@Entity
@Table(name = "word")
public class Word implements Serializable {

    private static final long serialVersionUID = 3132167399148271724L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "word")
    private String word;

    @Column(name = "translate")
    private String translate;

    @Column(name = "month")
    private String month;

    @Column(name = "year")
    private int year;

    @Column(name = "full_date")
    private Timestamp date;

}
