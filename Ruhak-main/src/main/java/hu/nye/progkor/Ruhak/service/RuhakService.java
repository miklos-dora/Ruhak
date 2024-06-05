package hu.nye.progkor.Ruhak.service;

import hu.nye.progkor.Ruhak.data.model.Ruhak;

import java.util.List;

/**
 * TODO.
 */
public interface RuhakService {

    /**
     * TODO.
     * @param ruhak TODO.
     * @return TODO.
     */

    Ruhak createRuhak(Ruhak ruhak);

    Ruhak retrieveRuhakById(Long id);

    List<Ruhak> retrieveAllRuhak();

    Ruhak updateRuhak(Ruhak ruhak);

    void deleteRuhakById(Long id);



}
