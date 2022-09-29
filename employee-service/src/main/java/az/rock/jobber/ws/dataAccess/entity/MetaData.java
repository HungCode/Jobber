package az.rock.jobber.ws.dataAccess.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MetaData {
    @CreatedDate
    private LocalDate createdDate;
    @LastModifiedDate
    private LocalDate modificationDate;
}
