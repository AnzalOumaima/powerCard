package com.elastic.powercard.rest;

import com.elastic.powercard.beans.PowerCard;
import com.elastic.powercard.dao.PowerCardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hps/powercard")
public class PowerCardRest {

    @Autowired
    private PowerCardDao powerCardDao;

    @GetMapping("/authorizationID/{authorizationID}")
    public PowerCard findByAuthorizationID(@PathVariable String authorizationID) {
        return powerCardDao.findByAuthorizationID(authorizationID);
    }

    @PostMapping("/")
    public Iterable<PowerCard> saveAll(@RequestBody Iterable<PowerCard> iterable) {
        return powerCardDao.saveAll(iterable);
    }

    @GetMapping("/")
    public Iterable<PowerCard> findAll() {
        return powerCardDao.findAll();
    }

    @DeleteMapping("/")
    public void delete(@RequestBody PowerCard powerCard) {
        powerCardDao.delete(powerCard);
    }
}
