package com.jhipster.persona.service;

import com.jhipster.persona.domain.Localidad;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Localidad}.
 */
public interface LocalidadService {

    /**
     * Save a localidad.
     *
     * @param localidad the entity to save.
     * @return the persisted entity.
     */
    Localidad save(Localidad localidad);

    /**
     * Get all the localidads.
     *
     * @return the list of entities.
     */
    List<Localidad> findAll();


    /**
     * Get the "id" localidad.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Localidad> findOne(Long id);

    /**
     * Delete the "id" localidad.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
