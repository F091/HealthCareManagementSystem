package model;

public class Facility {

    private final String id;
    private String name;
    private String type;
    private String address;
    private String postcode;
    private String phone;
    private String email;
    private String openingHours;
    private String managerName;
    private int capacity;
    private String specialities;

    public Facility(String id,
                    String name,
                    String type,
                    String address,
                    String postcode,
                    String phone,
                    String email,
                    String openingHours,
                    String managerName,
                    int capacity,
                    String specialities) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.email = email;
        this.openingHours = openingHours;
        this.managerName = managerName;
        this.capacity = capacity;
        this.specialities = specialities;
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

    public String getPostcode() {
        return postcode;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public String getManagerName() {
        return managerName;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSpecialities() {
        return specialities;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}
