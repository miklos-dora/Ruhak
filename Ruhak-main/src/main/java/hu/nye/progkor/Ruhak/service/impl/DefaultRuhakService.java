package hu.nye.progkor.Ruhak.service.impl;

import hu.nye.progkor.Ruhak.data.model.Ruhak;
import hu.nye.progkor.Ruhak.data.repository.Repository;
import hu.nye.progkor.Ruhak.service.RuhakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //delegál tovább a repositorynak
public class DefaultRuhakService implements RuhakService {
    private final Repository<Ruhak, Long> ruhakRepository;
@Autowired
    public DefaultRuhakService(Repository<Ruhak, Long> ruhakRepository) {

        this.ruhakRepository = ruhakRepository;
    }

    @Override
    public Ruhak createRuhak(Ruhak ruhak) {

    return ruhakRepository.save(ruhak);
    }

    @Override
    public Ruhak retrieveRuhakById(Long id) {
    return ruhakRepository.getById(id);
    }

    @Override
    public List<Ruhak> retrieveAllRuhak() {

    return ruhakRepository.getAll();
    }

    @Override
    public Ruhak updateRuhak(Ruhak ruhak) {

    return ruhakRepository.update(ruhak);
    }

    @Override
    public void deleteRuhakById(Long id) {
    ruhakRepository.deleteById(id);

    }
}
