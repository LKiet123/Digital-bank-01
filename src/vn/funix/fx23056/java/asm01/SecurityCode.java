package vn.funix.fx23056.java.asm01;

import java.util.Random;

public class SecurityCode {
    public static String generate(String level){

        // Khởi tạo đối tượng để tạo số ngẫu nhiên
        Random rand = new Random();

        // Kiểm tra nếu mức độ là "HARD"
        if(level != null && level.equalsIgnoreCase("HARD")) {

            // Định nghĩa tập hợp các ký tự có thể sử dụng
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            // Sử dụng StringBuilder để xây dựng chuỗi hiệu quả
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i <= 6; i++){

                // Chọn một ký tự ngẫu nhiên từ tập hợp và thêm vào chuỗi kết quả
                sb.append(chars.charAt(rand.nextInt(chars.length())));
            }
            // Trả về mã 6 ký tự đã tạo
            return sb.toString();
        }else {

            return String.valueOf(rand.nextInt(900) + 100); //random từ 100-999
        }
    }
}
