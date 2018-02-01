package crud.rest.microservice.repository;

import crud.rest.microservice.entity.EstateOffer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstateOfferRepository extends CrudRepository<EstateOffer, Long> {
}
