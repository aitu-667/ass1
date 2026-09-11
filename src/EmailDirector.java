public class EmailDirector {
    public void buildJobOfferEmail(EmailBuilder builder, String applicantEmail) {
        builder.setRecipient(applicantEmail)
                .setSubject("Job Offer Notice")
                .setBody("Congratulations! We are pleased to offer you the Developer position.");
    }
    public void buildPasswordResetEmail(EmailBuilder builder, String userEmail) {
        builder.setRecipient(userEmail)
                .setSubject("Password Reset Request")
                .setBody("Click the link to reset your password.");
    }
}