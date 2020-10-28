package com.jhipster.persona.service;

import com.jhipster.persona.domain.Libro;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Libro}.
 */
public interface LibroService {

    /**
     * Save a libro.
     *
     * @param libro the entity to save.
     * @return the persisted entity.
     */
    Libro save(Libro libro);

    /**
     * Get all the libros.
     *
     * @return the list of entities.
     */
    List<Libro> findAll();

    /**
     * Get all the libros with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    Page<Libro> findAllWithEagerRelationships(Pageable pageable);


    /**
     * Get the "id" libro.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Libro> findOne(Long id);

    /**
     * Delete the "id" libro.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
