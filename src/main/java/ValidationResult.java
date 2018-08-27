public class ValidationResult {

    private String issuer;
    private boolean isCorrect = false;

    public ValidationResult(String issuer, boolean isCorrect) {
        this.issuer = issuer;
        this.isCorrect = isCorrect;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
