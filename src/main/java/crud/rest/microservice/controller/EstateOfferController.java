package crud.rest.microservice.controller;

import crud.rest.microservice.entity.EstateOffer;
import crud.rest.microservice.service.EstateOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController()
@RequestMapping("estate-offer-service/api/estate-offer")
public class EstateOfferController {

    @Autowired
    EstateOfferService estateOfferService;

    @RequestMapping(value = "/{id}", method = GET)
    public Optional<EstateOffer> getParkingLotById(@PathVariable(name = "id") Long id) {
        return estateOfferService.findById(id);
    }

    @RequestMapping(method = GET)
    public Iterable<EstateOffer> getParkingLots() {
        return estateOfferService.findAll();
    }
}
