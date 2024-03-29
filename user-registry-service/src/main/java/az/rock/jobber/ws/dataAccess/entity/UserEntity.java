package az.rock.jobber.ws.dataAccess.entity;
import az.rock.jobber.ws.dataAccess.aspect.anno.JUniqueEmail;
import az.rock.jobber.ws.dataAccess.aspect.anno.JUniqueUserName;
import az.rock.jobber.ws.valueObject.UserType;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
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

    @Column(name = "finIdentify", nullable = false,updatable = false,unique = true)
    private UUID finIdentify;

    @Column(name = "USERNAME",updatable = false)
    @JUniqueUserName
    private String username;

    @Column(name = "FIRST_NAME",nullable = false)
    @Size(min = 2,max = 100)  @NotEmpty
    private String firstName;

    @Column(name = "LAST_NAME",nullable = false)
    @Size(min = 2,max = 100)  @NotEmpty
    private String lastName;

    @JUniqueEmail
    @Column(name = "EMAIL",nullable = false,unique = true)
    private String email;

    @Column(name = "PASSWORD",nullable = false)
    @Size(min = 6)  @NotEmpty
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "USER_TYPE", nullable = false,updatable = false)
    private UserType userType;
}