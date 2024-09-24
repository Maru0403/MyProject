package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`qlbangdiem`")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class bangdiem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bangdiem_id")
    private Integer bangdiemId;
    @Column(name = "Mamon")
    private String Mamon;
    @Column(name = "Tenmon")
    private String Tenmon;
    @Column(name = "Mssv")
    private Integer Mssv;
    @Column(name = "TC")
    private Integer TC;
    @Column(name = "Diemhe10")
    private Integer Diemhe10;
    @Column(name = "Diemhe4")
    private Integer Diemhe4;
    @Column(name = "Diemhechu")
    private String Diemchu;
    
}
