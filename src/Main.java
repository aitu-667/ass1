public class Main {
    public static void main(String[] args) {
        EmailDirector director = new EmailDirector();
        EmailObjectBuilder objectBuilder = new EmailObjectBuilder();
        director.buildJobOfferEmail(objectBuilder, "student@astanait.edu.kz");
        Email emailObject = objectBuilder.getResult();
        System.out.println(" Built Object ");
        System.out.println(emailObject);
        System.out.println();
        EmailPreviewBuilder previewBuilder = new EmailPreviewBuilder();
        director.buildJobOfferEmail(previewBuilder, "777777@astanait.edu.kz");
        String emailText = previewBuilder.getResult();
        System.out.println(" Built Text Preview ");
        System.out.println(emailText);
    }
}