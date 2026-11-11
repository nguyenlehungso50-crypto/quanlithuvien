package BTTUAN7;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Yêu cầu 3: tạo đối tượng từ lớp Sach
        Sach s1 = new Sach("S001", "Lập trình Java", "Nguyễn Văn A", 2020, 10);
        System.out.println("=== Thông tin một cuốn sách ===");
        s1.hienThiThongTin();

        // Yêu cầu 4: quản lý danh sách sách bằng ArrayList
        ArrayList<Sach> danhSach = new ArrayList<>();
        danhSach.add(s1);
        danhSach.add(new Sach("S002", "Cấu trúc dữ liệu", "Trần Thị B", 2019, 5));
        danhSach.add(new Sach("S003", "Cơ sở dữ liệu", "Lê Văn C", 2021, 8));

        System.out.println("=== Danh sách sách trong thư viện ===");
        for (Sach s : danhSach) {
            s.hienThiThongTin();
        }
        System.out.println("Tổng số đầu sách: " + danhSach.size());
    }
}