package com.food.ordering.system.order.service.domain.dto.create;

import com.food.ordering.system.domain.valueobject.OrderStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class CreateOrderResponse {
    @NotNull
    private final UUID orderTrackingId;
    @NotNull
    private final OrderStatus orderStatus;
    @NotNull
    private final String message;

    public static CreateOrderResponseBuilder builder() {
        return new CreateOrderResponseBuilder();
    }

    public static class CreateOrderResponseBuilder {
        private @NotNull UUID orderTrackingId;
        private @NotNull OrderStatus orderStatus;
        private @NotNull String message;

        CreateOrderResponseBuilder() {
        }

        public CreateOrderResponseBuilder orderTrackingId(@NotNull UUID orderTrackingId) {
            this.orderTrackingId = orderTrackingId;
            return this;
        }

        public CreateOrderResponseBuilder orderStatus(@NotNull OrderStatus orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        public CreateOrderResponseBuilder message(@NotNull String message) {
            this.message = message;
            return this;
        }

        public CreateOrderResponse build() {
            return new CreateOrderResponse(orderTrackingId, orderStatus, message);
        }

        public String toString() {
            return "CreateOrderResponse.CreateOrderResponseBuilder(orderTrackingId=" + this.orderTrackingId + ", orderStatus=" + this.orderStatus + ", message=" + this.message + ")";
        }
    }
}
