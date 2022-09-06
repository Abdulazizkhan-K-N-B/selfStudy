package com.example.springdatajpa.student;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(
        name = ("student"),
        uniqueConstraints = @UniqueConstraint(
                name = ("emailid_unique"),
                columnNames = ("email_address")
        )
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long studentId;

    @Column(name = ("firstname"))
    private String firstname;

    @Column(name = ("lastname"))
    private String lastname;

    @Column(
            name = ("email_address"),
            nullable = false
    )
    private String emailId;

    @Column(name = ("guardian_name"))
    private String guardianName;

    @Column(name = ("guardian_email"))
    private String guardianEmail;

    @Column(name = ("guardian_mobile"))
    private String guardianMobile;
}

