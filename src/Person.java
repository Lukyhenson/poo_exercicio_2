public class Person {
    public String name;
    public String genre;
    public int age;

    Person() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getAge() {
        return age;
    }

    public void getAllInfo() {
        System.out.println("========================================");
        System.out.println("| Name: " +  this.name);
        System.out.println("| Age: " +  this.age);
        System.out.println("| Genre: " +  this.genre);
        System.out.println("========================================");
    }
}
