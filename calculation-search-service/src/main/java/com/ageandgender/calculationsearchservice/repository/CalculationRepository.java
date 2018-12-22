package com.ageandgender.calculationsearchservice.repository;

import com.ageandgender.calculationsearchservice.model.entities.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculationRepository extends JpaRepository<Calculation, Long> {
}
