package es.cic.curso.ejercicio04.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import es.cic.curso.ejercicio04.entity.Director;

@Service
public class DirectorService {
    private final List<Director> directores = new ArrayList<>();
    private Long nextId = 1L;

    public List<Director> getAllDirectores() {
        return directores;
    }

    public Director crearDirector(Director director) {
        director.setId(nextId++);
        directores.add(director);
        return director;
    }

    public Director actualizarDirector(Long id, Director director) {
        Optional<Director> existingDirector = directores.stream().filter(d -> d.getId().equals(id)).findFirst();
        if (existingDirector.isPresent()) {
            directores.remove(existingDirector.get());
            director.setId(id);
            directores.add(director);
            return director;
        }
        return null;
    }

    public void borrarDirector(Long id) {
        directores.removeIf(d -> d.getId().equals(id));
    }
}