package de.mhaeusser.sms;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnergyConsumptionController {

    @GetMapping("/energy")
    public EnergyConsumption getEnergy(@RequestParam(value = "id") long id) {
        // Java 8-Zeiten!
        return new EnergyConsumption(id, new Date(), new Date());
    }
}