package life.captainxyw.prototype;

import java.io.*;

public class DeepCloneablePerson implements Serializable {

    private String name;

    private Integer age;

    private Cat cat;

    public DeepCloneablePerson(String name, Integer age, Cat cat) {
        this.name = name;
        this.age = age;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "DeepCloneablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                '}';
    }

    public DeepCloneablePerson clone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (DeepCloneablePerson) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        DeepCloneablePerson ccc = new DeepCloneablePerson("xuyewei", 30, new Cat("fluffy", "mm"));
        DeepCloneablePerson ddd = ccc.clone();
        System.out.println(ccc);
        System.out.println(ddd);
    }
}
