package ru.digitalnovember.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String groupName;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String shortName;

    @Column(nullable = false)
    private Integer taskTime;

    @Column(nullable = false)
    private Integer width;

    @Column(nullable = false)
    private Integer speed;

    @ManyToMany
    @Column(nullable = false)
    private Set<Company> companies;
}
