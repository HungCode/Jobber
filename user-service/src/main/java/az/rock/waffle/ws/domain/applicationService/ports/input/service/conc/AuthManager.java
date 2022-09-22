package az.rock.waffle.ws.domain.applicationService.ports.input.service.conc;

import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserCommand;
import az.rock.waffle.ws.domain.applicationService.dto.auth.AuthUserResponse;
import az.rock.waffle.ws.domain.applicationService.exception.security.GUserDetailsService;
import az.rock.waffle.ws.domain.applicationService.exception.security.UserNotFoundSecurityException;
import az.rock.waffle.ws.domain.applicationService.mapper.AuthDataMapper;
import az.rock.waffle.ws.domain.applicationService.ports.input.service.abst.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@RequiredArgsConstructor
public class AuthManager implements AuthService {
    private final GUserDetailsService gUserDetailsService;
    private final AuthDataMapper authDataMapper;



}
