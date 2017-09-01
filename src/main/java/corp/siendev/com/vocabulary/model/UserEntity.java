package corp.siendev.com.vocabulary.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Users which may use vocabulary application
 * Build new personal vocabulary, add new words, delete, update and search words
 *
 * @author Golubnichenko Yuriy
 */
@Data
@Entity
@Table(name = "user")
public class UserEntity implements Serializable
{
    private static final long serialVersionUID = -5054991725759496635L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private ProfileEntity userProfile;

    @ManyToOne
    @JoinColumn(name = "word_id")
    private WordEntity wordEntity;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;
}
