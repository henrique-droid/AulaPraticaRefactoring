import java.util.Enumeration;

public class TextStatement extends Statement {

  private String getRentalRecordResult(Customer aCustomer) {
    String result = "Rental Record for " + aCustomer.getName() +
      "\n";
    return result;
  }

  private String getFiguresForRentalResult(Rental each) {
    String result = "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
    return result;
  }

  private String getTotalChargeResult(Customer aCustomer) {
    String result = "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
    return result;
  }

  private String getTotalFrequentRenterPointsResult(Customer aCustomer) {
    String result = "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
    return result;
  }

  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getRentalRecordResult(aCustomer); 
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += getFiguresForRentalResult(each);
      }
      //add footer lines
      result += getTotalChargeResult(aCustomer);
      result += getTotalFrequentRenterPointsResult(aCustomer);
      return result;
   }
}