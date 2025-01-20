package com.miproyectoAlura.apibooks.apibooks.repository;

import com.miproyectoAlura.apibooks.apibooks.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombre(String nombre);

    @Query("SELECT a FROM Autor a LEFT JOIN FETCH a.libros WHERE(a.fallecimiento IS NULL OR a.fallecimiento >:ano) AND a.nacimiento <= :ano")
    List<Autor> findAutoresVivosEnAnoConLibros(@Param("ano")int ano);

    @Query("SELECT a FROM Autor a LEFT JOIN FETCH a.libros")
    List<Autor> findAllConLibros();



}
