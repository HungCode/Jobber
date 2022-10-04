package az.rock.jobber.ws.spec.employee.api.privates;

import az.rock.jobber.ws.messenger.transfer.request.GRequestDataTransfer;
import az.rock.jobber.ws.messenger.transfer.response.success.SuccessGDataTransfer;
import az.rock.jobber.ws.spec.annotation.*;


@ApiSpec(uri = "/employee/private/api")
public interface EmployeePrivateSpec {
    @GGet(api = "/myResume",desc = "Private olaraq isdifadecinin  Resumeni tam getirecek")
    SuccessGDataTransfer<?> getMyResume(GRequestDataTransfer<?> requestDataTransfer);

    @GGet(api = "/myOffers",desc = "Private olaraq isdifadecinin  Resumeni tam getirecek")
    SuccessGDataTransfer<?> getOffers(GRequestDataTransfer<?> requestDataTransfer);

    @GGet(api = "/viewers",desc = "Private olaraq isdifadecinin  Resumeni a baxanlari gosterir. Ve SimpleCompanyList qaytarir")
    SuccessGDataTransfer<?> getViewers(GRequestDataTransfer<?> requestDataTransfer);

    @GGet(api = "/frozen",desc = "Private olaraq isdifadecinin  profilini dondurmaq ucundu")
    SuccessGDataTransfer<?> frozenAccount(GRequestDataTransfer<?> requestDataTransfer);

    @GDelete(api = "/clearViewers",desc = "Private olaraq isdifadecinin  profiline baxanlarin tarixcesini temizlemek ucundur")
    SuccessGDataTransfer<?> clearViewers(GRequestDataTransfer<?> requestDataTransfer);

    @GDelete(api = "/clearOffers",desc = "Private olaraq isdifadeciye teklif verenlerin tarixcesini temizlemek ucundur")
    SuccessGDataTransfer<?> clearOffers(GRequestDataTransfer<?> requestDataTransfer);

    @GPut(api = "/updateSettings",desc = "Private olaraq isdifadeciye settings ayarlayir")
    SuccessGDataTransfer<?> updateSettings(GRequestDataTransfer<?> requestDataTransfer);

    @GPost(api = "/createAddress",desc = "")
    SuccessGDataTransfer<?> createAddress(GRequestDataTransfer<?> requestDataTransfer);

    @GPut(api = "/updateAddress",desc = "")
    SuccessGDataTransfer<?> updateAddress(GRequestDataTransfer<?> requestDataTransfer);
}
