package Model;

public class Worker extends Person{
    String post;
    int experience;
    Long id = 0L;

    public Worker(String post, int experience) {
        this.post = post;
        this.experience = experience;
        this.id++;
        setName();
        setSurname();
        setAge();
    }

    @Override
    public String toString() {
        return "Worker{" +
                "post='" + post + '\'' +
                ", experience=" + experience +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
