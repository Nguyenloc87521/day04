import java.util.Scanner;
public class baitap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên : ");
        String name = sc.nextLine();
        System.out.println(name);
        char[] charArray = name.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
      name = String.valueOf(charArray);
        System.out.println( name);
    }
}
