import java.util.Scanner;
import java.util.regex.*;

//Viết chương trình nhập mật khẩu, yêu cầu mật khẩu phải có từ 10 ký tự trở lên trong đó
//có ít nhất 1 ký tự in hoa, 1 ký tự số, 1 ký tự đặc biệt như . - _ …
//- Nếu mật khẩu ít hơn 10 ký tự thông báo 'mật khẩu yếu'
//- Nếu thiếu một trong các ký tự đặc biệt thì thông báo 'mật khẩu chưa đủ mạnh'

public class App {
    public static void main(String[] args){
        Pattern pattern;
        Matcher matcher;
        String password;
        Scanner sc = new Scanner(System.in);
        do {
            String passwordPattern = "[^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@$!%*?&])[A-Za-z\\\\d@$!%*?&]]";
            pattern = Pattern.compile(passwordPattern);
            System.out.print("Nhập mật khẩu của bạn:\n");
            password = sc.nextLine();
            Matcher m =  pattern.matcher(password);
            if (password.length() < 10) {
                System.out.println("Mật khẩu yếu");
            } else if (m.matches()) {
                System.out.println("Mật khẩu mạnh");
            } else {
                System.out.println("Mật khẩu chưa đủ mạnh");
            }
        }
        while (!Pattern.matches(String.valueOf(pattern), password));
    }
}
