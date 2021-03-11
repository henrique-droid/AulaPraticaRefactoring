import java.util.Enumeration;
public class HtmlStatement extends Statement {

  protected String getRentalRecordResult(Customer aCustomer) {
    String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
    return result;
  }

  protected String getFiguresForRentalResult(Rental each) {
    String result = each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
    return result;
  }

  protected String getTotalChargeResult(Customer aCustomer) {
    String result = "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    return result;
  }

  protected String getTotalFrequentRenterPointsResult(Customer aCustomer) {
    String result = "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
    return result;
  }

}