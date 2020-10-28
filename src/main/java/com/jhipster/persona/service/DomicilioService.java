package com.jhipster.persona.service;

import com.jhipster.persona.domain.Domicilio;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Domicilio}.
 */
public interface DomicilioService {

    /**
     * Save a domicilio.
     *
     * @param domicilio the entity to save.
     * @return the persisted entity.
     */
    Domicilio save(Domicilio domicilio);

    /**
     * Get all the domicilios.
     *
     * @return the list of entities.
     */
    List<Domicilio> findAll();


    /**
     * Get the "id" domicilio.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Domicilio> findOne(Long id);

    /**
     * Delete the "id" domicilio.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
