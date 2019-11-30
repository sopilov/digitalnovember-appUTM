package ru.digitalnovember.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double totalSquare;

    @Column(nullable = false)
    private Double cleaningSquare;

    @Column(nullable = false)
    private Double snowCleaningSquare;

    @Column(nullable = false)
    private Double mechanizedCleaningSquare;

    @Column(nullable = false)
    private Double traysLength;

    @Column(nullable = false)
    private Double carriagewaySquare;

    @Column(nullable = false)
    private Double carriagewayLength;

    @Column(nullable = false)
    private Double marginArea;

    @Column(nullable = false)
    private Double mechanizedCleaningCarriagewayLength;
}
