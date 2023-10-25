public class EmailCarbonFootprintCalculator {
    private static final Double CARBON_FOOTPRINT_INBOX_EMAIL = 4.0;
    private static final Double CARBON_FOOTPRINT_SENT_EMAIL = 2.0;
    private static final Double CARBON_FOOTPRINT_SPAM_EMAIL = 0.3;
    
    private Double getInboxEmailsCarbonFootprint(Integer inboxEmails) {
        return (inboxEmails * CARBON_FOOTPRINT_INBOX_EMAIL) / 1000;
    }
    
    private Double getSentEmailsCarbonFootprint(Integer sentEmails) {
        return (sentEmails * CARBON_FOOTPRINT_SENT_EMAIL) / 1000;
    }
    
    private Double getSpamEmailsCarbonFootprint(Integer spamEmails) {
        return (spamEmails * CARBON_FOOTPRINT_SPAM_EMAIL) / 1000;
    }
    
    private String getSource(String emailId){
        if(emailId.contains('gmail')){
            return 'Gmail';
        } else if(emailId.contains('outlook')){
            return 'Outlook';
        } else if(emailId.contains('yahoo')){
            return 'Yahoo';
        }
        return '';
    }
    
    public EmailWrapper getCarbonFootprint(String emailId, Integer inboxEmails, Integer sentEmails, Integer spamEmails){
        EmailWrapper emailWrapper = new EmailWrapper();
        emailWrapper.emailId = emailId;
        emailWrapper.source = getSource(emailId);
        emailWrapper.inbox = getInboxEmailsCarbonFootprint(inboxEmails) + ' KG';
        emailWrapper.sent = getSentEmailsCarbonFootprint(sentEmails) + ' KG';
        emailWrapper.spam = getSpamEmailsCarbonFootprint(spamEmails) + ' KG';
        
        return emailWrapper;
    }
    
    public class EmailWrapper {
        public String emailId;
        public String source;
        public String inbox;
        public String sent;
        public String spam;
    }
    
}