package issuers;


import java.util.ArrayList;
import java.util.List;

public class IssuerDetector implements Detector {

    List<IssuerRule> issuerRules;

    public IssuerDetector(){
        this.issuerRules = new ArrayList();

        issuerRules.add(new IssuerRule("Master Card", "51", 16));
        issuerRules.add(new IssuerRule("Master Card", "52", 16));
        issuerRules.add(new IssuerRule("Master Card", "53", 16));
        issuerRules.add(new IssuerRule("Master Card", "54", 16));
        issuerRules.add(new IssuerRule("Master Card", "55", 16));

        issuerRules.add(new IssuerRule("Visa", "4", 16));

        issuerRules.add(new IssuerRule("American Express", "34", 15));
        issuerRules.add(new IssuerRule("American Express", "37", 15));

    }

    @Override
    public String detect(String cardNumber) {

        String processedNumber = cardNumber.replace(" ","");

        String issuer = "UNKNOWN";
        for (IssuerRule issuerRule : issuerRules)
            if(processedNumber.startsWith(issuerRule.getPrefix())
                    && processedNumber.length() == issuerRule.getLenght()){
                issuer = issuerRule.getIssuer();
                break;
        }

        return issuer;
    }
}
