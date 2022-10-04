package az.rock.jobber.ws.spec.company.feign.publics;

import az.rock.jobber.ws.messenger.transfer.GDataTransfer;
import az.rock.jobber.ws.spec.annotation.ApiSpec;

@ApiSpec(uri = "/company/public/feign")
public interface CompanyPublicFeignSpec {
    GDataTransfer<String> health();
}
