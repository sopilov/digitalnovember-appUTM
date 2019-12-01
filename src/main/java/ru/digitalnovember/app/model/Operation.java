package ru.digitalnovember.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String operationName;

    @Column(nullable = false)
    private String elements;

    @Column(nullable = false)
    private String season;

    @Column(nullable = false)
    private String workingMethod;

    @Column(nullable = false)
    private String cleaningMethod;

    @Column(nullable = false)
    private String conditions;

    @Column(nullable = false)
    private Integer operationsCountPerDay;

    @Column(nullable = false)
    private String checkType;

    @Column(nullable = false)
    private String objects;

    @ManyToMany
    @Column(nullable = false)
    private Set<Vehicle> vehicles;
}
