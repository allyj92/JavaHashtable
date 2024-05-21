//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 아이디와 비밀번호를 저장할 Hashtable을 생성합니다.
        Hashtable<String,String> map = new Hashtable<>();
        // 아이디와 비밀번호를 Hashtable에 추가합니다.
        map.put("Spring", "345");
        map.put("Summer","678");
        map.put("Fall","91011");
        map.put("Winter","1212");

        // Hashtable에 저장된 내용을 출력합니다.
        System.out.println(map);

        // 사용자 입력을 받기 위해 Scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        while (true){
            // 사용자로부터 아이디와 비밀번호를 입력 받습니다.
            System.out.println("아이디와 비밃번호를 입력해 주세요");
            System.out.println("아이디");
            String id = scanner.nextLine();

            System.out.println("비밀번호");
            String password = scanner.nextLine();
            // 입력된 아이디가 Hashtable에 존재하는지 확인합니다.
            if(map.containsKey(id)){
                // 입력된 비밀번호가 해당 아이디의 비밀번호와 일치하는지 확인합니다.
                if (map.get(id).equals(password)){
                    System.out.println("로그인 되었습니다.");
                    break;
                }
                else System.out.println("비밀번호가 일치하지 않습니다. ");

            }
            else System.out.println("입력하신 아이디가 존재하지 않습니다.");
        }
    }
}