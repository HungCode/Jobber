package az.rock.jobber.ws.application.api.privates;

import az.rock.jobber.ws.messenger.transfer.request.GRequestDataTransfer;
import az.rock.jobber.ws.messenger.transfer.response.success.SuccessGDataTransfer;
import az.rock.jobber.ws.spec.employee.api.privates.EmployeePrivateSpec;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/employee/private/api")
@RequiredArgsConstructor
public class EmployeePrivateController implements EmployeePrivateSpec {

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/myResume")
    public SuccessGDataTransfer<?> getMyResume(GRequestDataTransfer<?> requestDataTransfer) {
        return null;
    }

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/myOffers")
    public SuccessGDataTransfer<?> getOffers(GRequestDataTransfer<?> requestDataTransfer) {
        return null;
    }

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/viewers")
    public SuccessGDataTransfer<?> getViewers(GRequestDataTransfer<?> requestDataTransfer) {
        return null;
    }

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/frozen")
    public SuccessGDataTransfer<?> frozenAccount(GRequestDataTransfer<?> requestDataTransfer) {
        return null;
    }

    @Override
    @RequestMapping(method = RequestMethod.DELETE, value = "/clearViewers")
    public SuccessGDataTransfer<?> clearViewers(GRequestDataTransfer<?> requestDataTransfer) {
        return null;
    }

    @Override
    @RequestMapping(method = RequestMethod.DELETE, value = "/clearOffers")
    public SuccessGDataTransfer<?> clearOffers(GRequestDataTransfer<?> requestDataTransfer) {
        return null;
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT, value = "/updateSettings")
    public SuccessGDataTransfer<?> updateSettings(GRequestDataTransfer<?> requestDataTransfer) {
        return null;
    }

    @Override
    @RequestMapping(method = RequestMethod.POST, value = "/createAddress")
    public SuccessGDataTransfer<?> createAddress(GRequestDataTransfer<?> requestDataTransfer) {
        return null;
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT, value = "/updateAddress")
    public SuccessGDataTransfer<?> updateAddress(GRequestDataTransfer<?> requestDataTransfer) {
        return null;
    }

}
