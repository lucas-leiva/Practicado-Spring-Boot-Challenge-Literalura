package com.miproyectoAlura.apibooks.apibooks.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibros(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DatosAutores> datosAutores,
        @JsonAlias("languages") List<String> idioma,
        @JsonAlias("download_count") int numeroDescargas
){
}
