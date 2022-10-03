package az.rock.jobber.ws.spec.company.privates;

import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/company/private/feign")
public interface CompanyPrivateFeignSpec {
    GDataTransfer<String> health();
}
