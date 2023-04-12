package life.captainxyw.adapter;

public class SDCardAdapter extends KingstonSDCard implements USB {

    @Override
    public String readFromUSB() {
        return super.readFromSDCard();
    }

    @Override
    public void writeToUSB(String msg) {
        super.writeToSDCard(msg);
    }
}
