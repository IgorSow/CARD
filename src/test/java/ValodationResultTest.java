import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValodationResultTest {

    private CardValidator cardValidator;


    @Before
    public void setUp(){
       cardValidator = new CardValidator();

    }

    @Test
    public void should_check_correct_Visa_Card(){
        //given
        String correctVisaCard = "4532 4167 2581 5242";

        //then
        ValidationResult knownIssuer = cardValidator.validate(correctVisaCard);

        //then
        Assert.assertEquals("Visa",knownIssuer.getIssuer());
        Assert.assertTrue(knownIssuer.isCorrect());
    }
    @Test
    public void should_check_inCorrect_Master_Card(){
        //given
        String inCorrectMasterCard = "5114 9280 8368 7472";

        //then

        ValidationResult unKnown = cardValidator.validate(inCorrectMasterCard);

        //then
        Assert.assertEquals("Master Card",unKnown.getIssuer());
        Assert.assertFalse(unKnown.isCorrect());
    }
    @Test
    public void should_check_Correct_UnknownIssuer(){
        //given
        String correctAnotherProvider = "6011 9349 9226 9260";

        //then
        ValidationResult unKnownIssuer = cardValidator.validate(correctAnotherProvider);

        Assert.assertEquals("UNKNOWN", unKnownIssuer.getIssuer());
        Assert.assertTrue(unKnownIssuer.isCorrect());

    }
}
