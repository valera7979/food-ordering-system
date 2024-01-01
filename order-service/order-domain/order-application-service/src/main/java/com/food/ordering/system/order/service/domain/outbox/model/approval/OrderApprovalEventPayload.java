package com.food.ordering.system.order.service.domain.outbox.model.approval;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class OrderApprovalEventPayload {
    @JsonProperty
    private final String orderId;
    @JsonProperty
    private final String restaurantId;
    @JsonProperty
    private final BigDecimal price;
    @JsonProperty
    private final ZonedDateTime createdAt;
    @JsonProperty
    private final String restaurantOrderStatus;
    @JsonProperty
    private final List<OrderApprovalEventProduct> products;
}
