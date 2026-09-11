public class EmailObjectBuilder implements EmailBuilder {
    private String recipient;
    private String subject;
    private String body;
    @Override
    public EmailObjectBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
    @Override
    public EmailObjectBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    @Override
    public EmailObjectBuilder setBody(String body) {
        this.body = body;
        return this;
    }
    public Email getResult() {
        if (recipient == null || recipient.isEmpty()) {
            throw new IllegalStateException("Recipient email address is required!");
        }
        return new Email(recipient, subject, body);
    }
}