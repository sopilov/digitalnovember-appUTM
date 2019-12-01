package ru.digitalnovember.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.digitalnovember.app.model.Operation;

@Repository
public interface OperationDAO extends JpaRepository<Operation, Long> {
}
