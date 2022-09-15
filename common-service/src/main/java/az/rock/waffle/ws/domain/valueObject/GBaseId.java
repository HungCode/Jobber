package az.rock.waffle.ws.domain.valueObject;

import java.util.Objects;

public abstract class GBaseId<T> {
    private final T value;

    protected GBaseId(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GBaseId<?> baseId = (GBaseId<?>) o;
        return value.equals(baseId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}