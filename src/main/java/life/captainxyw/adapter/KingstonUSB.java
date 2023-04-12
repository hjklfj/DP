package life.captainxyw.adapter;

public class KingstonUSB implements USB {

    @Override
    public String readFromUSB() {
        return "KingstonUSB read...";
    }

    @Override
    public void writeToUSB(String msg) {
        System.out.println("KingstonUSB write...");
    }
}
