package life.captainxyw.adapter;

public class KingstonSDCard implements SDCard {
    @Override
    public String readFromSDCard() {
        return "KingstonSDCard read...";
    }

    @Override
    public void writeToSDCard(String msg) {
        System.out.println("KingstonSDCard write...");
    }
}
