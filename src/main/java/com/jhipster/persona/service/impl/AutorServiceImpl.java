package com.jhipster.persona.service.impl;

import com.jhipster.persona.service.AutorService;
import com.jhipster.persona.domain.Autor;
import com.jhipster.persona.repository.AutorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link Autor}.
 */
@Service
@Transactional
public class AutorServiceImpl implements AutorService {

    private final Logger log = LoggerFactory.getLogger(AutorServiceImpl.class);

    private final AutorRepository autorRepository;

    public AutorServiceImpl(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @Override
    public Autor save(Autor autor) {
        log.debug("Request to save Autor : {}", autor);
        return autorRepository.save(autor);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Autor> findAll() {
        log.debug("Request to get all Autors");
        return autorRepository.findAll();
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Autor> findOne(Long id) {
        log.debug("Request to get Autor : {}", id);
        return autorRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Autor : {}", id);
        autorRepository.deleteById(id);
    }
}
