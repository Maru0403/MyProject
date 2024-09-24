package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="`qlsinhvien`")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class sinhvien {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sinhvien_id")
    private Integer sinhvienId;
    @Column(name = "Mssv")
    private Integer Mssv;
    @Column(name = "Hoten")
    private String Hoten;
    @Column(name = "Gioitinh")
    private String Gioitinh;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Ngaysinh")
    private String Ngaysinh;

    @Column(name = "Noio")
    private String Noio;
    @Column(name = "CCCD")
    private Integer CCCD;
    @Column(name = "Malop")
    private Integer Malop;
    @Column(name = "Mamon")
    private Integer Mamon;
    @Column(name = "password")
    private String password;


}
