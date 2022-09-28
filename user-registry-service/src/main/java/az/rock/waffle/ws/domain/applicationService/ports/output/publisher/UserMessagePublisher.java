package az.rock.waffle.ws.domain.applicationService.ports.output.publisher;

import az.rock.waffle.ws.domain.core.event.UserCreatedEvent;

public interface UserMessagePublisher {
    void publish(UserCreatedEvent userCreatedEvent);
}
