public class User {
    private String name;
    private String lastName;
    private int age;
    private String status;
    private boolean male;


    public User(String name,String lastName,int age, String status,boolean male) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public int getUserAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isMale(){
        return male;
    }

    public void setMale(boolean male){
        this.male = male;
    }

}