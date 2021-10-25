package edu.egg.jpa.repository;

import edu.egg.jpa.JpaApplication;
import edu.egg.jpa.entity.Curso;
import edu.egg.jpa.entity.Estudiante;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = JpaApplication.class)
class CursoRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CursoRepository cursoRepository;

    @Test
    @Transactional
    void buscarCursoPorId() {
        Curso curso = cursoRepository.findById(10001).orElse(null);
        logger.info("CURSO -> {}", curso);
    }

    @Test
    @Transactional
    void obtenerCursoYComentarios() {
        Curso curso = cursoRepository.findById(10001).orElse(null);
        logger.info("CURSO -> {}", curso);
        logger.info("COMENTARIOS -> {}", curso.getComentarios());
    }

    @Test
    @Transactional
    void obtenerCursoYEstudiantes() {
        Curso curso = cursoRepository.findById(10001).orElse(null);
        logger.info("CURSO -> {}", curso);
        logger.info("ESTUDIANTES -> {}", curso.getEstudiantes());
    }
}
