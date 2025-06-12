package com.application.rest.SpringBootRest.repository;

import com.application.rest.SpringBootRest.entities.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakerRepository extends CrudRepository<Maker, Long> {
}
