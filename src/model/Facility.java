package model;

public class Facility {

    private final String id;      // unique facility ID
    private String name;          // facility name
    private String type;          // e.g. "GP", "Hospital"
    private String address;       // full address
    private String phone;         // contact phone number
    private int capacity;         // optional: number of patients/beds

    public Facility(String id,
                    String name,
                    String type,
                    String address,
                    String phone,
                    int capacity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.phone = phone;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Facility[id=" + id + ", name=" + name +
                ", type=" + type + ", capacity=" + capacity + "]";
    }
}
