package com.miproyectoAlura.apibooks.apibooks.repository;

import com.miproyectoAlura.apibooks.apibooks.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long>{
    Optional<Libro> findByTituloIgnoreCase(String titulo);

    @Query("SELECT l FROM Libro l WHERE l.idiomas = :idiomas")
    List<Libro> findByIdiomas(@Param("idiomas") String idiomas);
}
