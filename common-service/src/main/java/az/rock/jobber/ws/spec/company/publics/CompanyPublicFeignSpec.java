package az.rock.jobber.ws.spec.company.publics;

import az.rock.jobber.ws.messenger.response.GDataResponse;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/company/public/feign")
public interface CompanyPublicFeignSpec {
    GDataResponse<String> health();
}
