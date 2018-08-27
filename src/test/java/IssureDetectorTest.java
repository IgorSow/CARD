import issuers.Detector;
import issuers.IssuerDetector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IssureDetectorTest {

    private Detector iIssuerDetector;

    @Before // odpala sie przed testami

    public void setUp(){
        iIssuerDetector = new IssuerDetector();
    }


    @Test
    public void shouldDetectVisaAsIssuer() {

        //given
        final String visaNumber = "4111 1111 1111 1111";

        //when
        String issuer = iIssuerDetector.detect(visaNumber);


        //then
        Assert.assertEquals("Visa", issuer);

    }
    @Test
    public void shouldDetectMasterCardAsIssuer() {

        //given
        final String masterCard = "5511 1111 1111 1111";

        //when
        String issuer = iIssuerDetector.detect(masterCard);


        //then
        Assert.assertEquals("Master Card", issuer);
    }
    @Test
    public void shouldDetectAmericanExpressAsIssuer() {

        //given
        final String americanExpress = "3711 1111 1111 111";

        //when
        String issuer = iIssuerDetector.detect(americanExpress);


        //then
        Assert.assertEquals("American Express", issuer);
    }
}
