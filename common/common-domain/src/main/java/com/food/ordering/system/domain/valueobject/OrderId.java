package com.food.ordering.system.domain.valueobject;

import java.math.BigDecimal;
import java.util.UUID;

public class OrderId extends BaseId<UUID> {

    public OrderId(UUID id) {
        super(id);
    }
}
