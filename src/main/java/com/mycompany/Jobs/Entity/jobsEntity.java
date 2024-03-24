package com.mycompany.Jobs.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "AVAILABLE_JOBS")
public class jobsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "JOB_NAME")
    private String name;
    private String description;
    private  Double salary;
    private String location;
    private String qualification;
}
