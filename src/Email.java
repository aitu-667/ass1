public class Email {
    private final String recipient;
    private final String subject;
    private final String body;
    Email(String recipient, String subject, String body) {
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
    }
    @Override
    public String toString() {
        return "Email{'" + recipient + "', subject='" + subject + "', body='" + body + "'}";
    }
}