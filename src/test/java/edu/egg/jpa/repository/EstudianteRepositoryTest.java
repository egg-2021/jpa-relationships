package edu.egg.jpa.repository;

import edu.egg.jpa.JpaApplication;
import edu.egg.jpa.entity.Estudiante;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = JpaApplication.class)
class EstudianteRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Test
    @Transactional
    void buscarEstudiantePorId() {
        Estudiante estudiante = estudianteRepository.findById(20001).orElse(null);
        logger.info("ESTUDIANTE -> {}", estudiante);

        Estudiante estudiante1 = estudianteRepository.findById(20001).orElse(null);
        logger.info("ESTUDIANTE 1 -> {}", estudiante1);
    }

    @Test
    @Transactional
    void obtenerEstudianteYLibreta() {
        Estudiante estudiante = estudianteRepository.findById(20001).orElse(null);
        logger.info("ESTUDIANTE -> {}", estudiante);
        logger.info("LIBRETA -> {}", estudiante.getLibreta());
    }

    @Test
    @Transactional
    void obtenerEstudianteYCursos() {
        Estudiante estudiante = estudianteRepository.findById(20002).orElse(null);
        logger.info("ESTUDIANTE -> {}", estudiante);
        logger.info("CURSOS -> {}", estudiante.getCursos());
    }
}
