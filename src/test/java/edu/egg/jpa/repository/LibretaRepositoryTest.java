package edu.egg.jpa.repository;

import edu.egg.jpa.JpaApplication;
import edu.egg.jpa.entity.Libreta;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = JpaApplication.class)
class LibretaRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LibretaRepository libretaRepository;

    @Test
    @Transactional
    void buscarLibretaPorId() {
        Libreta libreta = libretaRepository.findById(30001).orElse(null);
        logger.info("LIBRETA -> {}", libreta);
    }

    @Test
    @Transactional
    void obtenerLibretaYEstudiante() {
        Libreta libreta = libretaRepository.findById(30001).orElse(null);
        logger.info("LIBRETA -> {}", libreta);
        logger.info("ESTUDIANTE -> {}", libreta.getEstudiante());
    }
}
