package guru.springframework.spring6resttemplate.client;

import guru.springframework.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface BeerClient {

    Page<BeerDTO> getBeerById(UUID id);
    Page<BeerDTO> listBeers();

    Page<BeerDTO> listBeers(String beer);
}
