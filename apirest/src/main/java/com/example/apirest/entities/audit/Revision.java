package com.example.apirest.entities.audit;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="REVISION_INFO")
@RevisionEntity
@Data

public class Revision implements Serializable {
    private static final Long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="revision_seq")
    @SequenceGenerator(
            name="sequence_seq",
            sequenceName = "rbac.seq_revision_id"
    )
    @RevisionNumber
    private int id;
    @Column(name="REVISION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;
}
