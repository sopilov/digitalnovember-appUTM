package ru.digitalnovember.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.digitalnovember.app.model.Company;

@Repository
public interface CompanyDAO extends JpaRepository<Company, Long> {

}
