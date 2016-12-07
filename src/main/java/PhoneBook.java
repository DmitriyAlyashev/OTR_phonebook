import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {

    public void addContact(String key, String[] values){

        List<String> phoneNumber = new ArrayList<String>();

        for(String item : values)
        {
            phoneNumber.add(item);
        }

        hashMap.put(key, phoneNumber);
    }

    public String getContactInfo(String key){

        StringBuffer stringBuffer = new StringBuffer();

        List<String> contact = hashMap.get(key);

        if(contact == null)
        {
            stringBuffer.append("Такого ФИО нет в БД \n");
        }else for(String item : contact)
        {
            stringBuffer.append(item + "\n");
        }

        return stringBuffer.toString();
    }

    Map<String, List<String>> hashMap = new HashMap<String, List<String>>();
}
