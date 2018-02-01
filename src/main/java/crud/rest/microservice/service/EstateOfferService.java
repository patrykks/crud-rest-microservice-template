package crud.rest.microservice.service;

import crud.rest.microservice.entity.EstateOffer;
import crud.rest.microservice.repository.EstateOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstateOfferService {

    @Autowired
    EstateOfferRepository estateOfferRepository;

    public Iterable<EstateOffer> findAll() {
        return estateOfferRepository.findAll();
    }

    public Optional<EstateOffer> findById(Long id) {
        return estateOfferRepository.findById(id);
    }

}