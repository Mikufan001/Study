import java.util.Scanner;
public class LoginForm {
    private void init(){
    }

    private void display(){
    }

    private void validate(){
    }

    public boolean flag = true;
    public void menu(){
        display();
        System.out.println("请输入用户名：");
        Scanner in = new Scanner (System.in);
        int userName = in.nextInt();
        System.out.println("请输入密码：");
        int userPassword = in.nextInt();
        init();

    }
}
