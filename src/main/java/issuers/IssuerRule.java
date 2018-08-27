package issuers;

public class IssuerRule {
    private String issuer;
    private String prefix;
    private int lenght;

    public IssuerRule(String issuer, String prefix, int length) {
        this.issuer = issuer;
        this.prefix = prefix;
        this.lenght = length;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getLenght() {
        return lenght;
    }
}
