public class EmailPreviewBuilder implements EmailBuilder {
    private final StringBuilder sb = new StringBuilder("EMAIL PREVIEW");
    @Override
    public EmailPreviewBuilder setRecipient(String recipient) {
        sb.append("To: ").append(recipient).append("\n");
        return this;
    }
    @Override
    public EmailPreviewBuilder setSubject(String subject) {
        sb.append("Subject: ").append(subject).append("\n");
        return this;
    }
    @Override
    public EmailPreviewBuilder setBody(String body) {
        sb.append("Body:\n").append(body).append("\n-\n");
        return this;
    }
    public String getResult() {
        return sb.toString();
    }
}