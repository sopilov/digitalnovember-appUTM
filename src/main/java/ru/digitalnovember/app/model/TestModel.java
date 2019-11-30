package ru.digitalnovember.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "testModels")
@Data
@NoArgsConstructor
public class TestModel {

    public TestModel(String testField) {
        this.testField = testField;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "testString", nullable = false)
    private String testField;
}
