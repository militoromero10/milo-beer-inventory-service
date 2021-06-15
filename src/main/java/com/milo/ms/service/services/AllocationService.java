package com.milo.ms.service.services;

import com.milo.brewery.model.BeerOrderDto;

public interface  AllocationService {
    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
