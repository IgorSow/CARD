import checksums.ChecksumVerifer;
import checksums.LuhnCheckSumVerifer;
import issuers.Detector;
import issuers.IssuerDetector;

public class CardValidator {

    public ValidationResult validate(String cardNumber) {
        Detector issuerDetector = new IssuerDetector();

        ChecksumVerifer checksumVerifer = new LuhnCheckSumVerifer();


        String issuer = issuerDetector.detect(cardNumber);
        boolean isCorrect = checksumVerifer.verif(cardNumber);


        return new ValidationResult(issuer, isCorrect);
    }
}
