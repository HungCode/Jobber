package az.rock.jobber.ws.dataAccess.entity.meta;

import az.rock.jobber.ws.valueObject.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SettingEntity {

    @Id
    @GeneratedValue
    private UUID uuid;

    private UUID ownerUUID;

    @Enumerated(EnumType.STRING)
    private ThemeType theme = ThemeType.LIGHT;

    @Enumerated(EnumType.STRING)
    private MarkedCompanyNotification markedCompanyNotification = MarkedCompanyNotification.ON;

    @Enumerated(EnumType.STRING)
    private MarkedVacancySubscribeNotification markedVacancySubscribeNotification = MarkedVacancySubscribeNotification.ON;

    @Enumerated(EnumType.STRING)
    private MessageNotification messageNotification = MessageNotification.ON;

    @Enumerated(EnumType.STRING)
    private JobPostingNotification jobPostingNotification = JobPostingNotification.ON;

    @Enumerated(EnumType.STRING)
    private AccessPrivateData accessPrivateData = AccessPrivateData.ON;

    @Enumerated(EnumType.STRING)
    private Language language = Language.AZ;


}
