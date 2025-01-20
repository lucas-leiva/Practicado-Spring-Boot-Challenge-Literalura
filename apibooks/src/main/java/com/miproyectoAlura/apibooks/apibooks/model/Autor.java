package com.miproyectoAlura.apibooks.apibooks.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "autores")
    public class Autor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private Integer nacimiento;
    private Integer fallecimiento;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Libro> libros;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Integer getNacimiento() {
            return nacimiento;
        }

        public void setNacimiento(Integer nacimiento) {
            this.nacimiento = nacimiento;
        }

        public Integer getFallecimiento() {
            return fallecimiento;
        }

        public void setFallecimiento(Integer fallecimiento) {
            this.fallecimiento = fallecimiento;
        }

        public List<Libro> getLibros() {
            return libros;
        }

        public void setLibros(List<Libro> libros) {
            this.libros = libros;
        }

        @Override
        public String toString() {
            return "Autor{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", nacimiento=" + nacimiento +
                    ", fallecimiento=" + fallecimiento +
                    ", libros=" + libros +
                    '}';
        }
    }
