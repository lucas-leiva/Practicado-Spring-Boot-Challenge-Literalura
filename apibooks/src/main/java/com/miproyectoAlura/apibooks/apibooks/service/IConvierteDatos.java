package com.miproyectoAlura.apibooks.apibooks.service;

public interface IConvierteDatos {
    public <T> T obtenerDatos(String json, Class<T> clase);
}
