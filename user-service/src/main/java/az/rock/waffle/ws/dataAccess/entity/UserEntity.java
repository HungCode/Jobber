package az.rock.waffle.ws.dataAccess.entity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Entity
public class UserEntity {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    private String username;
    private String firstName;
    private String lastName;
}