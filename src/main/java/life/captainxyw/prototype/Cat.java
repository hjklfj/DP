package life.captainxyw.prototype;

import java.io.Serializable;

public class Cat implements Serializable {

    private String type;

    private String name;

    public Cat(String type, String name) {
        this.type = type;
        this.name = name;
    }

}
