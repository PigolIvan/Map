public class CustomerWithId {
    String name;
    String surname;
    int id;
    public CustomerWithId(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public int getId() {
        return id;
    }


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

}
