package corp.siendev.com.vocabulary.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Word entity. Add new words
 *
 * @author Golubnichenko Yuriy
 */
@Data
@Entity
@Table(name = "word")
public class WordEntity implements Serializable
{
    private static final long serialVersionUID = 3132167399148271724L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    @OneToMany(mappedBy = "word", cascade = CascadeType.ALL, orphanRemoval = true)
    private UserEntity userEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private WordCategoryEntity categoryWord;
}
