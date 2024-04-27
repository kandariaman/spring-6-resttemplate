package guru.springframework.spring6resttemplate.client;

import org.springframework.data.domain.Page;

public interface BeerClient {

    Page<BeerClient> listBeers();
}
