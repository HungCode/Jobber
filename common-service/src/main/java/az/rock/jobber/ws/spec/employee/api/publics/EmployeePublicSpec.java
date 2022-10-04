package az.rock.jobber.ws.spec.employee.api.publics;

import az.rock.jobber.ws.messenger.transfer.request.GRequestDataTransfer;
import az.rock.jobber.ws.messenger.transfer.response.success.SuccessGDataTransfer;
import az.rock.jobber.ws.spec.annotation.ApiSpec;
import az.rock.jobber.ws.spec.annotation.GGet;
import az.rock.jobber.ws.valueObject.GFilter;
import az.rock.jobber.ws.valueObject.GPageable;

import java.util.UUID;

@ApiSpec(uri = "/employee/public/api")
public interface EmployeePublicSpec {

    @GGet(api = "/resume",desc = "Public olaraq umumi Resumeni getirecek,User uuid Company uuidsi olur")
    SuccessGDataTransfer<?> getResume(GRequestDataTransfer<UUID> requestDataTransfer);

    @GGet(api = "/pageableSimpleResumes",desc = "Simple formada resume list return edir.User UUID gonderilirse onu recommende vururuq")
    SuccessGDataTransfer<?> getPageableSimpleResumes(GRequestDataTransfer<GPageable<?>> requestDataTransfer);

    @GGet(api = "/simpleResumesAsFilter",
            desc = "Simple formada resume list return edir.User UUID gonderilirse onu recommende vururuq. Burada request Filter olaraq gelir")
    SuccessGDataTransfer<?> getSimpleResumesAsFilter(GRequestDataTransfer<GFilter<?>> requestDataTransfer);

    @GGet(api = "/offer",
            desc = "Company teklif gonderir. Mail ve Elaqe vasiteleri gorsenir")
    SuccessGDataTransfer<?> offerMeeting(GRequestDataTransfer<?> requestDataTransfer);

    @GGet(api = "/report",
            desc = "Company yalnis isdifadeni ve firildaxciliq elyhine sikayet edir")
    SuccessGDataTransfer<?> report(GRequestDataTransfer<?> requestDataTransfer);

    @GGet(api = "/showContact",
            desc = "Company contacta baxa bilir")
    SuccessGDataTransfer<?> showContact(GRequestDataTransfer<?> requestDataTransfer);

}
