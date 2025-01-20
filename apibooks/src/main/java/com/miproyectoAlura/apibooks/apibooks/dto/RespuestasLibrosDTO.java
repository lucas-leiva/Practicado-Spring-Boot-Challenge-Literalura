package com.miproyectoAlura.apibooks.apibooks.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RespuestasLibrosDTO {

    @JsonProperty("results")
    private List<LibroDTO> libros;

    public List<LibroDTO> getLibros(){
        return libros;
    }

    public void setLibros(List<LibroDTO> libros){
        this.libros = libros;
    }
}
