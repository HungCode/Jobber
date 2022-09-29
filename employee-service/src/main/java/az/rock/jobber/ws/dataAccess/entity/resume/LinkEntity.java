package az.rock.jobber.ws.dataAccess.entity.resume;

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
public class LinkEntity {
    @Id
    @GeneratedValue
    private UUID uuid;

    @ManyToOne
    private ResumeEntity resume;

    private String linkName;

    private String link;
}
