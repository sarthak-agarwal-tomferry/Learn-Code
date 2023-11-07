public class EmailCarbonFootprintCalculator {
    
    private EmailCarbonFootprintCalculatorHelper emailCarbonFootprintCalculatorHelper = new EmailCarbonFootprintCalculatorHelper();
    
    public EmailWrapper getCarbonFootprint(String emailId, Integer inboxEmails, Integer sentEmails, Integer spamEmails){
        EmailWrapper emailWrapper = new EmailWrapper();
        emailWrapper.emailId = emailId;
        emailWrapper.source = emailCarbonFootprintCalculatorHelper.getSource(emailId);
        emailWrapper.inbox = emailCarbonFootprintCalculatorHelper.getInboxEmailsCarbonFootprint(inboxEmails) + ' KG';
        emailWrapper.sent = emailCarbonFootprintCalculatorHelper.getSentEmailsCarbonFootprint(sentEmails) + ' KG';
        emailWrapper.spam = emailCarbonFootprintCalculatorHelper.getSpamEmailsCarbonFootprint(spamEmails) + ' KG';
        
        return emailWrapper;
    }
}