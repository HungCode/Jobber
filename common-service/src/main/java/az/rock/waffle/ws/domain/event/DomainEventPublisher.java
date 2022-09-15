package az.rock.waffle.ws.domain.event;

public interface DomainEventPublisher<T extends DomainEvent<?>> {

    void publish(T domainEvent);
}