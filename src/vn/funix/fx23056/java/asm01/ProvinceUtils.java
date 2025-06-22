package vn.funix.fx23056.java.asm01;

import java.util.HashMap;

public class ProvinceUtils {
//    khởi tạo hàm HashMap chứa cặp key - value kiểu string có tên provinces
    private static final HashMap<String, String> provinces = new HashMap<>();
//  khởi tạo hàm HashMap với mã tỉnh và tên tỉnh tương ứng
    static {
        provinces.put("001", "Hà Nội");
        provinces.put("002", "Hà Giang");
        provinces.put("004", "Cao Bằng");
        provinces.put("006", "Bắc Kạn");
        provinces.put("008", "Tuyên Quang");
        provinces.put("010", "Lào Cai");
        provinces.put("011", "Điện Biên");
        provinces.put("012", "Lai Châu");
        provinces.put("014", "Sơn La");
        provinces.put("015", "Yên Bái");
        provinces.put("017", "Hòa Bình");
        provinces.put("019", "Thái Nguyên");
        provinces.put("020", "Lạng Sơn");
        provinces.put("022", "Quảng Ninh");
        provinces.put("024", "Bắc Giang");
        provinces.put("025", "Phú Thọ");
        provinces.put("026", "Vĩnh Phúc");
        provinces.put("027", "Bắc Ninh");
        provinces.put("030", "Hải Dương");
        provinces.put("031", "Hải Phòng");
        provinces.put("033", "Hưng Yên");
        provinces.put("034", "Thái Bình");
        provinces.put("035", "Hà Nam");
        provinces.put("036", "Nam Định");
        provinces.put("037", "Ninh Bình");
        provinces.put("038", "Thanh Hóa");
        provinces.put("040", "Nghệ An");
        provinces.put("042", "Hà Tĩnh");
        provinces.put("044", "Quảng Bình");
        provinces.put("045", "Quảng Trị");
        provinces.put("046", "Thừa Thiên Huế");
        provinces.put("048", "Đà Nẵng");
        provinces.put("049", "Quảng Nam");
        provinces.put("051", "Quảng Ngãi");
        provinces.put("052", "Bình Định");
        provinces.put("054", "Phú Yên");
        provinces.put("056", "Khánh Hòa");
        provinces.put("058", "Ninh Thuận");
        provinces.put("060", "Bình Thuận");
        provinces.put("062", "Kon Tum");
        provinces.put("064", "Gia Lai");
        provinces.put("066", "Đắk Lắk");
        provinces.put("067", "Đắk Nông");
        provinces.put("068", "Lâm Đồng");
        provinces.put("070", "Bình Phước");
        provinces.put("072", "Tây Ninh");
        provinces.put("074", "Bình Dương");
        provinces.put("075", "Đồng Nai");
        provinces.put("077", "Bà Rịa - Vũng Tàu");
        provinces.put("079", "Hồ Chí Minh");
        provinces.put("080", "Long An");
        provinces.put("082", "Tiền Giang");
        provinces.put("083", "Bến Tre");
        provinces.put("084", "Trà Vinh");
        provinces.put("086", "Vĩnh Long");
        provinces.put("087", "Đồng Tháp");
        provinces.put("089", "An Giang");
        provinces.put("091", "Kiên Giang");
        provinces.put("092", "Cần Thơ");
        provinces.put("093", "Hậu Giang");
        provinces.put("094", "Sóc Trăng");
        provinces.put("095", "Bạc Liêu");
        provinces.put("096", "Cà Mau");

    }

//  phương thức trả về tỉnh thành tương đương với mã tỉnh
    public static String getProvince(String code){
        if(code == null){
            return "Không xác định";
        }
//     sử dụng phương thức getOrDefault để lấy tên tỉnh thành từ hashMap. Nếu không tồn tại trong hashMap thì trả về 'khong xac dinh'
        return provinces.getOrDefault(code, "Không xác định");
    }
}
