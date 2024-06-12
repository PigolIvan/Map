
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class MapMain {
    public static void main(String[] args){
        HashMap<Integer, Customer> map = new HashMap<>();
        CustomerWithId c1 = new CustomerWithId("Іван", "Піголь", 123);
        CustomerWithId c2 = new CustomerWithId("Максим", "Коломієць", 256);
        CustomerWithId c3 = new CustomerWithId("Євген", "Бондарев", 609);
        CustomerWithId c4 = new CustomerWithId("Антон", "Криворучко", 867);
        CustomerWithId c5 = new CustomerWithId("Роман", "Василенко", 563);
        List<CustomerWithId> list = List.of(c1, c2, c3, c4, c5);
        List<Customer> customerList = list.stream()
                .map(customer -> new Customer(customer.getName(), customer.getSurname()))
                .collect(Collectors.toList());
        for(int i = 0; i < customerList.size(); i++){
            map.put(list.get(i).getId(), customerList.get(i));
        }
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
}
