package life.captainxyw.adapter;

/**
 * 适配器模式：***Spring的HandleAdapter***
 */
public class Main {


    public static void main(String[] args) {
        SDCardAdapter adapter = new SDCardAdapter();
        System.out.println(readFromSDCard(adapter));
        writeToSDCard(adapter, "ssss");

    }
    public static String readFromSDCard(USB card) {
        return card.readFromUSB();
    }

    public static void writeToSDCard(USB card, String msg) {
        card.writeToUSB(msg);
    }
}
