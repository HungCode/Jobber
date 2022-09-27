package az.rock.waffle.ws.dataAccess.entity;
import az.rock.waffle.ws.domain.applicationService.validator.anno.JNullable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
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
    @Column(name = "id", nullable = false,updatable = false,unique = true)
    private UUID id;

    @Column(name = "USERNAME",unique = true,updatable = false,nullable = false)
    @Size(min = 6,max = 25)  @NotEmpty
    private String username;

    @Column(name = "FIRST_NAME",nullable = false)
    @Size(min = 2,max = 100)  @NotEmpty
    private String firstName;

    @Column(name = "LAST_NAME",nullable = false)
    @Size(min = 2,max = 100)  @NotEmpty
    private String lastName;

    @Email @NotEmpty
    @Size(min = 6,max = 200)
    private String email;

    @Column(name = "PASSWORD",nullable = false)
    @Size(min = 6)  @NotEmpty
    private String password;
}