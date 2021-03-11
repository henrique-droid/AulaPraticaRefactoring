import java.util.Enumeration;
public class HtmlStatement extends Statement {

  private String getRentalRecordResult(Customer aCustomer) {
    String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
    return result;
  }

  private String getFiguresForRentalResult(Rental each) {
    String result = each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
    return result;
  }

  private String getTotalChargeResult(Customer aCustomer) {
    String result = "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    return result;
  }

  private String getTotalFrequentRenterPointsResult(Customer aCustomer) {
    String result = "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
    return result;
  }

  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getRentalRecordResult(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += getFiguresForRentalResult(each);
      }
      //add footer lines
      result += getTotalChargeResult(aCustomer);
      result += getTotalFrequentRenterPointsResult(aCustomer);
      return result;
   }

}