package com.jhipster.persona.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Libro.
 */
@Entity
@Table(name = "libro")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private Integer fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private Integer paginas;

    @Column(name = "titulo")
    private String titulo;

    @ManyToMany
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JoinTable(name = "libro_autores",
               joinColumns = @JoinColumn(name = "libro_id", referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "autores_id", referencedColumnName = "id"))
    private Set<Autor> autores = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFecha() {
        return fecha;
    }

    public Libro fecha(Integer fecha) {
        this.fecha = fecha;
        return this;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public Libro genero(String genero) {
        this.genero = genero;
        return this;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public Libro paginas(Integer paginas) {
        this.paginas = paginas;
        return this;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public Libro titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public Libro autores(Set<Autor> autors) {
        this.autores = autors;
        return this;
    }
/*
    public Libro addAutores(Autor autor) {
        this.autores.add(autor);
        autor.getLibros().add(this);
        return this;
    }

    public Libro removeAutores(Autor autor) {
        this.autores.remove(autor);
        autor.getLibros().remove(this);
        return this;
    }
*/
    public void setAutores(Set<Autor> autors) {
        this.autores = autors;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Libro)) {
            return false;
        }
        return id != null && id.equals(((Libro) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Libro{" +
            "id=" + getId() +
            ", fecha=" + getFecha() +
            ", genero='" + getGenero() + "'" +
            ", paginas=" + getPaginas() +
            ", titulo='" + getTitulo() + "'" +
            "}";
    }
}
