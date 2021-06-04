package com.milo.ms.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by jt on 2019-01-26.
 */
@Getter
@Setter
@Entity
public class BeerInventory extends BaseEntity{

    private UUID beerId;
    private String upc;
    private Integer quantityOnHand = 0;

    public BeerInventory(){

    }

    @Builder
    public BeerInventory(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, UUID beerId,
                         String upc, Integer quantityOnHand) {
        super(id, version, createdDate, lastModifiedDate);
        this.beerId = beerId;
        this.upc = upc;
        this.quantityOnHand = quantityOnHand;
    }
}