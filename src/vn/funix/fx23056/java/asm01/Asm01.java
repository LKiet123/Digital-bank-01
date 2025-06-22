package vn.funix.fx23056.java.asm01;

import java.util.Scanner;

public class Asm01 {
    //Tạo biến hằng dùng để hiển thị thông tin ở menu
    public static final String STUDENT_ID = "FX23056";
    public static void main(String[] args) {

//      Tao doi tuong scanner de doc du lieu nhap tu nguoi dung
        Scanner sc = new Scanner(System.in);

//      Bien luu tru lua chon cua nguoi dung
        int option;

//        vong lap chinh chay cho den khi nguoi dung thoat ctrinh
        do{
            showMainMenu(); //hien thi menu chinh
            option = readInt(sc, "Chon chuc nang: ");

//            xu ly lua chon nguoi dung
            switch (option){

//                nguoi dung nhap CCCD
                case 1:
                    xuLyCccd(sc);
                    break;

//              nguoi dung chon thoat chuong trinh
                case 0:
                    System.out.println("Tam biet");
                    break;

//              xu ly truong hop nhap khong hop le
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
//        Tiep tuc vong lap neu nguoi dung chua chon thoat
        while (option != 0);

    }
//ham hien thi bang menu chinh
    private static void showMainMenu(){
        System.out.println("+---------+----------------------+---------+");
        System.out.println("|    NGAN HANG SO | " + STUDENT_ID + " @v1.0.0        |");
        System.out.println("+------+------------------------+----------+");
        System.out.println("| 1. Nhap CCCD                             |");
        System.out.println("| 0. Thoat                                 |");
        System.out.println("+-------+------------------------+---------+");
    }
    private static void xuLyCccd(Scanner sc){
//        chon phuong thuc xac nhan bao mat
//        EASY xac thuc 3 ky tu
//        HARD xac thuc 6 ky tu
        System.out.println("Chọn mức độ xác thực");
        System.out.println("0. EASY");
        System.out.println("1. HARD");
//      Doc lua chon muc do bao mat nguoi dung
        int securityOption = readInt(sc, "Chon muc do bao mat");

        String level = null;
        if(securityOption == 1){
            level = "HARD";
        }

//        Tao ma xac thuc dua tren muc do bao mat nguoi dung chon
        String code = SecurityCode.generate(level);
        System.out.println("Ma xac thuc: " + code);

//      Vong lap yeu cau nguoi dung nhap chinh xac ma xac thuc
        while(true){
            System.out.println("Nhap ma xac thuc: ");
            String input = sc.nextLine();
//            neu nhap dung vong lap thi thoat khoi vong lap
            if(input.equals(code))
                break;
            System.out.println("Ma xac thuc khong dung. Vui long thu lai!");
        }

//        vong lap yeu cau nguoi dung nhap so cccd hop le
        while(true){
            System.out.println("Nhap so CCCD hoac 'No' de thoat. ");
            String cccd = sc.nextLine();

//            kiem tra neu nguoi dung muon thoat
            if(cccd.equalsIgnoreCase("No"))
                return;
//           kiem tra tinh hop le cua cccd gom 12 so
            if(CccdUtils.isValidCccd(cccd)){
                int choice;
                do{
//                   hien thi menu cac chuc nang trich xuat tu cccd
                    System.out.println("1. Kiem tra noi sinh");
                    System.out.println("2. Kiem tra nam sinh, gioi tinh");
                    System.out.println("3. Kiem tra so ngau nhien.");
                    System.out.println("0. Thoat");
                    choice = readInt(sc, "Chon chuc nang:");

//                  doc lua chon chuc nang nguoi dung
                    switch (choice){
                        case 1:
                            System.out.println("Noi sinh: " + CccdUtils.getProvinceName(cccd));
                            break;
                        case 2:
                            System.out.println("Gioi tinh & Nam sinh: " + CccdUtils.getGenderAndBirth(cccd));
                            break;
                        case 3:
                            System.out.println("So ngau nhien: " + CccdUtils.getRandomNumber(cccd));
                            break;
                        case 0:
                             break;
                        default:
                            System.out.print("Lua chon khong hop le");
                    }
                }
                    while (choice != 0);
                    return;
            }else {
                System.out.println("So cccd khong hop le. Vui long nhap lai hoac 'No' de thoat");
            }
        }
    }

//  Phuong thuc readInt dung de yeu cau nguoi dung nhap vao 1 so nguyen va tra ve gia tri do
//  Neu nguoi dung nhap khong phai so nguyen, thong bao loi va yeu cau nhap lai
    private static int readInt(Scanner sc, String message){
        while (true){
            try{
                System.out.println(message);
                return Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Vui long nhap so nguyen");
            }
        }
    }
}