package corp.siendev.com.vocabulary.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Profiles for users
 * Additional information about users (photo, name, mail etc.)
 *
 * @author Golubnichenko Yuriy
 */
@Data
@Entity
@Table(name = "profile")
public class ProfileEntity implements Serializable {

    private static final long serialVersionUID = 1351350720168320374L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_mail")
    private String userMail;

    @Column(name = "user_avatar")
    private String userAvatar;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_describe")
    private String userDescribe;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
