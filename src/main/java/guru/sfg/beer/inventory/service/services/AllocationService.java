package guru.sfg.beer.inventory.service.services;

import guru.sfg.brewery.model.BeerOrderDto;

public interface AllocationService {

    Boolean allcationOrder(BeerOrderDto beerOrderDto);

    void deallocateOrder(BeerOrderDto beerOrderDto);
}
