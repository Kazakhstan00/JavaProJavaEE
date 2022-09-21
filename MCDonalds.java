package HomeWork.JavaEE1.task1;

public class MCDonalds {

    private Long id;
    private String name;
    private String surname;
    private String food;

    public MCDonalds(){

    }

    public MCDonalds(Long id, String name, String surname, String food) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.food = food;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
