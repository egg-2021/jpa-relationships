package edu.egg.jpa.entity;

import javax.persistence.*;

@Entity
public class Libreta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String registro;
    @OneToOne(mappedBy = "libreta", fetch = FetchType.LAZY)
    private Estudiante estudiante;

    public Libreta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return String.format("LIBRETA (id: %s, registro: %s)", id, registro);
    }
}
