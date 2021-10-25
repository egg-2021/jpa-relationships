package edu.egg.jpa.repository;

import edu.egg.jpa.entity.Libreta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibretaRepository extends JpaRepository<Libreta, Integer> {
}
