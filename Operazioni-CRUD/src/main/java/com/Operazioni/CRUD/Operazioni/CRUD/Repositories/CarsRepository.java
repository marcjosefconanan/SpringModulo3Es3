package com.Operazioni.CRUD.Operazioni.CRUD.Repositories;

import com.Operazioni.CRUD.Operazioni.CRUD.Entities.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository<Cars,Long> {
}
