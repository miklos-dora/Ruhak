package hu.nye.progkor.Ruhak.data.repository.impl;

import hu.nye.progkor.Ruhak.data.model.Ruhak;
import hu.nye.progkor.Ruhak.data.repository.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository


public class InMemoryRuhakRepository implements Repository<Ruhak, Long> {

    private static final Map<Long, Ruhak> STORAGE = new HashMap<Long, Ruhak>();

    @Override
    public Ruhak save(Ruhak ruhak) {
        Long id= STORAGE.size() + 1L;
        ruhak.setId(id);
        STORAGE.put(id, ruhak);
        return STORAGE.get(id);
    }

    @Override
    public Ruhak getById(Long id) {
        return STORAGE.get(id) ;
    }

    @Override
    public List<Ruhak> getAll() {
        return STORAGE.values().stream().toList();
    }

    @Override
    public Ruhak update(Ruhak ruhak) {
        Long id = ruhak.getId();
        STORAGE.put(id, ruhak);
        return STORAGE.get(id);
    }

    @Override
    public void deleteById(Long id) {
        STORAGE.remove(id);

    }
}
