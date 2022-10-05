package az.rock.jobber.ws.domain.application.ports.output.publisher;

import az.rock.jobber.ws.domain.core.event.UserCreatedEvent;

public interface UserMessagePublisher {
    void publish(UserCreatedEvent userCreatedEvent);
}
