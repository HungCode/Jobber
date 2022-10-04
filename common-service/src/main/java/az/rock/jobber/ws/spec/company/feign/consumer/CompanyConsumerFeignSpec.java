package az.rock.jobber.ws.spec.company.feign.consumer;

import az.rock.jobber.ws.messenger.transfer.GDataTransfer;
import az.rock.jobber.ws.spec.annotation.ApiSpec;

@ApiSpec(uri = "/company/consumer/feign")
public interface CompanyConsumerFeignSpec {
    GDataTransfer<String> health();
}
