package es.cic.curso.ejercicio04.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cic.curso.ejercicio04.entity.Director;

public interface DirectorRepository extends JpaRepository<Director, Long> {
}