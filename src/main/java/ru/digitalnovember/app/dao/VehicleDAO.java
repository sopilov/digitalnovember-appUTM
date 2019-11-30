package ru.digitalnovember.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.digitalnovember.app.model.Vehicle;

@Repository
public interface VehicleDAO extends JpaRepository<Vehicle, Long> {
}
