package guru.springframework.spring6resttemplate.client;

import guru.springframework.spring6resttemplate.model.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BeerClientImplTest {

    @Autowired
    BeerClientImpl beerClient;

    @Test
    void getBeerById() {
        Page<BeerDTO> beerDTO = beerClient.listBeers();
        BeerDTO dto = beerDTO.getContent().get(0);
        BeerDTO byId = beerClient.getBeerById(dto.getId());
    }

    @Test
    void listBeer(){
        beerClient.listBeers("ALE");
    }
}