import java.util.Enumeration;

public class TextStatement extends Statement {

  protected String getRentalRecordResult(Customer aCustomer) {
    String result = "Rental Record for " + aCustomer.getName() +
      "\n";
    return result;
  }

  protected String getFiguresForRentalResult(Rental each) {
    String result = "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
    return result;
  }

  protected String getTotalChargeResult(Customer aCustomer) {
    String result = "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
    return result;
  }

  protected String getTotalFrequentRenterPointsResult(Customer aCustomer) {
    String result = "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
    return result;
  }
}