package tech.itpark.avito.controller;

import org.springframework.web.bind.annotation.*;
import tech.itpark.avito.domain.Flat;
import tech.itpark.avito.manager.FlatManager;

import java.util.ArrayList;

@RestController
public class FlatController {
    FlatManager manager = new FlatManager();

    @PostMapping("/flats")
    public void add(@RequestBody Flat flat){
        manager.add(flat);
    }

    @GetMapping("/flats/filter")
    public ArrayList<Flat> filterByPrice(@RequestParam int min_price, @RequestParam int max_price){
        return manager.filter(min_price, max_price);
    }

    @GetMapping("/flats")
    public ArrayList<Flat> getAll(){return manager.getAll();}




}
