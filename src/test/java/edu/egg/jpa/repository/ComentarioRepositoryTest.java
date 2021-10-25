package edu.egg.jpa.repository;

import edu.egg.jpa.JpaApplication;
import edu.egg.jpa.entity.Comentario;
import edu.egg.jpa.entity.Curso;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = JpaApplication.class)
class ComentarioRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Test
    @Transactional
    void buscarComentarioPorId() {
        Comentario comentario = comentarioRepository.findById(10001).orElse(null);
        logger.info("COMENTARIO -> {}", comentario);
    }

    @Test
    @Transactional
    void obtenerComentarioYCurso() {
        Comentario comentario = comentarioRepository.findById(40001).orElse(null);
        logger.info("COMENTARIO -> {}", comentario);
        logger.info("CURSO -> {}", comentario.getCurso());
    }
}
