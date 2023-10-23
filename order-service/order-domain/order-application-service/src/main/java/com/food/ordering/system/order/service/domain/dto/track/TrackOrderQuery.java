package com.food.ordering.system.order.service.domain.dto.track;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

/**
 * The client will use this class to check order state.
 */
@Getter
@Builder
@AllArgsConstructor
public class TrackOrderQuery {
    @NotNull
    private final UUID order;

}
