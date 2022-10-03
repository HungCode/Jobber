package az.rock.jobber.ws.spec.company.publics;

import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/company/public/feign")
public interface CompanyPublicFeignSpec {
    GDataTransfer<String> health();
}
