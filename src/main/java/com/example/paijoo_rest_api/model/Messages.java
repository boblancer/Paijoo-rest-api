package com.example.paijoo_rest_api.model;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Calendar;

@Data
@Entity(name="messages")
public class Messages {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "author_id")
    private int author_id;
    @Column(name = "recipient_id")
    private int recipient_id;
    @Column(name = "content_type")
    private int content_type;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "content_id")
    private TextContent content;

    @Column(name = "seen")
    private Boolean seen;
    @Column(name = "received")
    private Boolean received;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "yyyy-MM-dd HHH:mm:ss")
    private Calendar created_at;

    @Column(name = "conversation_id")
    private int conversation_id;
}
