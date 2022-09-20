package az.rock.waffle.ws.container.aspect.conc;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.Duration;
import java.time.Instant;

@Aspect
@Component
@Slf4j
public class JLoggerAspect {
    @Around("@annotation(az.rock.waffle.ws.container.aspect.anno.JLogger)")
    public Object jLogger(ProceedingJoinPoint joinPoint) throws Throwable {
        Instant start = Instant.now();
        Object proceed =  joinPoint.proceed();
        Instant end = Instant.now();
        log.info("Method on IP : {} executing time : {}ms",this.getIpAddress(), Duration.between(start,end).toMillis());
        return proceed;
    }

    private  String getIpAddress(){
        HttpServletRequest httpServletRequest =  ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
                .getRequest();
        return httpServletRequest.getRemoteAddr();
    }
}
