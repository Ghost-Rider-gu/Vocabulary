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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

/**
 * Word's category.
 *
 * @author Golubnichenko Yurii
 */
@Data
@Entity
@Table(name = "category")
public class Category implements Serializable {

    private static final long serialVersionUID = 7621023647889325665L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 40)
    @Column(name = "name")
    private String categoryName;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private Set<Word> words;

}
