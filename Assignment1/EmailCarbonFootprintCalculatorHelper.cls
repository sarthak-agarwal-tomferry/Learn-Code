public class EmailCarbonFootprintCalculatorHelper {
    
    public Double getInboxEmailsCarbonFootprint(Integer inboxEmails) {
        return (inboxEmails * CarbonFootprintConstants.CARBON_FOOTPRINT_INBOX_EMAIL) / 1000;
    }
    
    public Double getSentEmailsCarbonFootprint(Integer sentEmails) {
        return (sentEmails * CarbonFootprintConstants.CARBON_FOOTPRINT_SENT_EMAIL) / 1000;
    }
    
    public Double getSpamEmailsCarbonFootprint(Integer spamEmails) {
        return (spamEmails * CarbonFootprintConstants.CARBON_FOOTPRINT_SPAM_EMAIL) / 1000;
    }
    
    public String getSource(String emailId){
        if(emailId.contains('gmail')){
            return 'Gmail';
        } else if(emailId.contains('outlook')){
            return 'Outlook';
        } else if(emailId.contains('yahoo')){
            return 'Yahoo';
        }
        return '';
    }
}