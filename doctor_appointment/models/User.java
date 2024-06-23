package models;

public class User {
    private String name;
    private String Id;

    public String getId() {
        return Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        Id = id;
    }
}
