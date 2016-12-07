import org.junit.Test;
/**
 * Created by admin.kz.alyashev on 07.12.2016.
 */
public class PhoneBookTest {
    @Test
    public void getContactInfo() throws Exception {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Alyashev", new String[]{"+795203000000"});
        org.junit.Assert.assertEquals("+795203000000\n", phoneBook.getContactInfo("Alyashev"));
        org.junit.Assert.assertEquals("Такого ФИО нет в БД \n", phoneBook.getContactInfo("Petr"));


    }

}