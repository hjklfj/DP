package life.captainxyw.abstractfactory;

import life.captainxyw.abstractfactory.ms.MicrosoftFacotry;

public class Main {

    public static void main(String[] args) {
        RandomTypeMd md = new RandomTypeMd();
        AbstractFactory factory = new MicrosoftFacotry();
        Word word = factory.convertToWord(md);
    }

}
