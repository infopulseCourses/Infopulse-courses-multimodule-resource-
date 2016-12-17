package entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mtarasenko on 17.12.16.
 */
@Entity(name="black_list")
public class BlackList {

    @Id
    @GeneratedValue
    private Long id;

    private String comment;

    @Temporal(value = TemporalType.TIMESTAMP)//maps java.util.DateTime to sql native type
    private Date timeAdded;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="sender_id")
    private User sender;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="receiver_id")
    private User receiver;
}
