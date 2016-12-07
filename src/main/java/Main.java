import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin.kz.alyashev on 07.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иванов И.И.", new String[]{"+8 800 2000 500", "+8 800 200 600"});
        phoneBook.addContact("Петров П.П.", new String[]{"+8 800 2000 700"});
        phoneBook.addContact("Сидоров С.С.", new String[]{"+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 900"});

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean run = true;

        while (run) {
            System.out.print("Введите ФИО: ");
            try {
                String input = reader.readLine();
                switch (input) {
                    case "Exit":
                        run = false;
                        break;
                    default:
                        System.out.print(phoneBook.getContactInfo(input));
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
