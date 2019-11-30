package ru.digitalnovember.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.digitalnovember.app.model.TestModel;

import java.util.List;

@Repository
public interface TestDao extends JpaRepository <TestModel, Long> {

    List<TestModel> findAll();
}
