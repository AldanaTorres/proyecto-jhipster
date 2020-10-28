package com.jhipster.persona.service;

import com.jhipster.persona.domain.Autor;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Autor}.
 */
public interface AutorService {

    /**
     * Save a autor.
     *
     * @param autor the entity to save.
     * @return the persisted entity.
     */
    Autor save(Autor autor);

    /**
     * Get all the autors.
     *
     * @return the list of entities.
     */
    List<Autor> findAll();


    /**
     * Get the "id" autor.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Autor> findOne(Long id);

    /**
     * Delete the "id" autor.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
