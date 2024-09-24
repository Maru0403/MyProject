package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`qltkb`")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class thoikhoabieu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tkb_id")
    private Integer tkbId;
    @Column(name = "ngay")
    private String ngay;
    @Column(name = "Tenmon")
    private String Tenmon;
    @Column(name = "Tiethoc")
    private String Tiethoc;
    @Column(name = "Phonghoc")
    private Integer Phonghoc;
    @Column(name = "Malop")
    private Integer Malop;
}
