import java.util.Enumeration;

public abstract class Statement {
  protected abstract String getRentalRecordResult(Customer aCustomer);

  protected abstract String getFiguresForRentalResult(Rental each);

  protected abstract String getTotalChargeResult(Customer aCustomer);

  protected abstract String getTotalFrequentRenterPointsResult(Customer aCustomer);

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