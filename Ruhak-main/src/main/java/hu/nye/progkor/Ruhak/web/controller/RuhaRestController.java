package hu.nye.progkor.Ruhak.web.controller;

import hu.nye.progkor.Ruhak.data.model.Ruhak;
import hu.nye.progkor.Ruhak.service.RuhakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ruhak")
public class RuhaRestController {
    private final RuhakService ruhakService;

    @Autowired

    public RuhaRestController(RuhakService ruhakService) {

        this.ruhakService = ruhakService;
    }

    @GetMapping("/{id}")
    public Ruhak getRuhakById(@PathVariable Long id) {

        return ruhakService.retrieveRuhakById(id);
    }
@GetMapping
public List<Ruhak> getAllRuhak() {

        return ruhakService.retrieveAllRuhak();
}
    @PostMapping
    public Ruhak createRuhak(@RequestBody Ruhak ruhak) {
        return ruhakService.createRuhak(ruhak);
    }
    //meglévőt módosítunk
    @PutMapping
    public Ruhak updateRuhak(@RequestBody Ruhak ruhak) {

        return ruhakService.updateRuhak(ruhak);
    }

    @DeleteMapping("/{id}")
    public void deleteRuhakById(@PathVariable Long id) {
        ruhakService.deleteRuhakById(id);
    }

}
