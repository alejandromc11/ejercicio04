package es.cic.curso.ejercicio04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.curso.ejercicio04.entity.Director;
import es.cic.curso.ejercicio04.repository.DirectorRepository;

@RestController
@RequestMapping("/directores")
public class DirectorController {

    @Autowired
    private DirectorRepository directorRepository;

    @GetMapping
    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Director getDirectorById(@PathVariable Long id) {
        return directorRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Director createDirector(@RequestBody Director director) {
        return directorRepository.save(director);
    }

    @PutMapping("/{id}")
    public Director updateDirector(@PathVariable Long id, @RequestBody Director director) {
        director.setId(id);
        return directorRepository.save(director);
    }

    @DeleteMapping("/{id}")
    public void deleteDirector(@PathVariable Long id) {
        directorRepository.deleteById(id);
    }
}