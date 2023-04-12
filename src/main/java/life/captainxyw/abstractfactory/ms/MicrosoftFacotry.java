package life.captainxyw.abstractfactory.ms;

import life.captainxyw.abstractfactory.AbstractFactory;
import life.captainxyw.abstractfactory.Md;

public class MicrosoftFacotry extends AbstractFactory {

    @Override
    public MSPDF convertToPDF(Md md) {
        return new MSPDF(md);
    }

    @Override
    public MSWord convertToWord(Md md) {
        return new MSWord(md);
    }
}
