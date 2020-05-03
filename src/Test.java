import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter file link raw: ");
        Scanner scan = new Scanner(System.in);
        String linkRaw = scan.nextLine();
        System.out.println("Enter file copy to: ");
        String linkCopy = scan.nextLine();

        Copy_File copy_file = new Copy_File();
        copy_file.copyFile(linkRaw, linkCopy);
    }
}
