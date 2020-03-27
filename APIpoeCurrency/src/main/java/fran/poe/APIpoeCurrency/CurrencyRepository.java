package fran.poe.APIpoeCurrency;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurrencyRepository extends MongoRepository<Currency, String> {

    
}