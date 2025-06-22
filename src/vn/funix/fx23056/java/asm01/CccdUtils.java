package vn.funix.fx23056.java.asm01;

public class CccdUtils {
    public static boolean isValidCccd(String cccd){

     // Kiểm tra null và trả về chính xác 12 ký tự số
        return cccd != null && cccd.matches("\\d{12}");
    }

//    phương thức trả về ten tỉnh thành
    public static String getProvinceName(String cccd){
        if (cccd == null || cccd.length() < 3) {
            return "Khong xac dinh";
        }
        // Lấy ra 3 ký tự đầu tiên trong dãy số
        String code = cccd.substring(0, 3);
        return ProvinceUtils.getProvince(code); // Sửa từ cccd thành code
    }

//    phuong thuc trả về giới tính và năm sinh tu cccd
    public static String getGenderAndBirth(String cccd){
        if (cccd == null || cccd.length() < 6) {
            return "Khong xac dinh";
        }

        int genderCode = Character.getNumericValue(cccd.charAt(3));
        int year = Integer.parseInt(cccd.substring(4,6));
        String gender = (genderCode % 2 == 0) ? "Nam" : "Nu";

        int century = switch (genderCode){
            case 0, 1 -> 1900; //gioi tinh nam: 0, nu: 1
            case 2, 3 -> 2000; //gioi tinh nam: 2, nu: 3
            case 4, 5 -> 2100; //gioi tinh nam: 4, nu: 5
            case 6, 7 -> 2200; //gioi tinh nam: 6, nu: 7
            case 8, 9 -> 2300; //gioi tinh nam: 8, nu: 9
            default -> 0;
        };
        return gender + " | " + (century + year);
    }

// Phương thức trả về số ngẫu nhiên từ cccd
    public static String getRandomNumber(String cccd){
//        kiem tra dau vao co hop le khong
        if (cccd == null || cccd.length() < 12) {
            return "Khong xac dinh";
        }
//        trả về 6 số ngẫu nhiên
        return cccd.substring(6);
    }
}