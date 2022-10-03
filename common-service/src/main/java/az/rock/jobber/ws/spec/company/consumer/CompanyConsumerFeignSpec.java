package az.rock.jobber.ws.spec.company.consumer;

import az.rock.jobber.ws.messenger.response.GDataTransfer;
import az.rock.jobber.ws.spec.ApiSpec;

@ApiSpec(uri = "/company/consumer/feign")
public interface CompanyConsumerFeignSpec {
    GDataTransfer<String> health();
}
