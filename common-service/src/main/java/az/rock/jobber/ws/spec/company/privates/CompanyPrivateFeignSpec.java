package az.rock.jobber.ws.spec.company.privates;

import az.rock.jobber.ws.messenger.response.GDataResponse;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/company/private/feign")
public interface CompanyPrivateFeignSpec {
    GDataResponse<String> health();
}
