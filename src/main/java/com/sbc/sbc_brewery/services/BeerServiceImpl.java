package com.sbc.sbc_brewery.services;

import com.sbc.sbc_brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Brka")
                .beerStyle("IPA")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        //todo add real saving of new beer
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
    //todo add real impl for beer update
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting beer with id {}", beerId);
    }


}
