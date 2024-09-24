package Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "`ql_lop`")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "SET delete = 1")
public class lop extends BaseEntity {

    private Long lopId;
    @Column(name = "Malop")
    private Long Malop;
    @Column(name = "TenGV")
    private String TenGV;
}
