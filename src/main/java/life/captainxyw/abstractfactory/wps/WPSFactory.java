package life.captainxyw.abstractfactory.wps;

import life.captainxyw.abstractfactory.AbstractFactory;
import life.captainxyw.abstractfactory.Md;
import life.captainxyw.abstractfactory.Word;

public class WPSFactory extends AbstractFactory {

    @Override
    public WSPPDF convertToPDF(Md md) {
        return null;
    }

    @Override
    public WPSWord convertToWord(Md md) {
        return null;
    }
}
