package com.food.ordering.system.domain.valueobject;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public abstract class BaseId<T> {
    private final T id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var baseId = (BaseId<?>) o;
        return id.equals(baseId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
