package corp.siendev.com.vocabulary.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Category for our words
 *
 * @author Golubnichenko Yuriy
 */
@Data
@Entity
@Table(name = "word_category")
public class WordCategoryEntity implements Serializable {

    private static final long serialVersionUID = 4756297119140949108L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "category")
    private String category;

    @OneToOne(mappedBy = "wordCategory")
    private WordEntity wordCategory;
}
