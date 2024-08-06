package es.cic.curso.ejercicio04.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.cic.curso.ejercicio04.entity.Pelicula;

@Service
public class PeliculaService {

    private final List<Pelicula> peliculas = new ArrayList<>();

    public List<Pelicula> getAllPeliculas() {
        return peliculas;
    }

    public Pelicula crearPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        return pelicula;
    }

    public Pelicula actualizarPelicula(Long id, Pelicula pelicula) {
        // Update logic
        return pelicula;
    }

    public void borrarPelicula(Long id) {
        // Delete logic
    }
}