import checksums.ChecksumVerifer;
import checksums.LuhnCheckSumVerifer;
import org.junit.Assert;
import org.junit.Test;


public class LuhnCheckSumVeriferTest {

    @Test
    public void shouldValidateCardNumber(){
        //given

        String number = "67533";

        ChecksumVerifer checksumVerifer = new LuhnCheckSumVerifer();


        //when
        boolean isCorrect = checksumVerifer.verif(number);


        //then

        Assert.assertTrue(isCorrect);

    }
}
