import java.util.Enumeration;

public abstract class Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = headerValue(aCustomer.getName());
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += rentalValue(each.getMovie().getTitle(), String.valueOf(each.getCharge()));
      }
      //add footer lines
      result += owedValue(String.valueOf(aCustomer.getTotalCharge()));
      result += earnedValue(String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
      return result;
   }

   protected abstract String headerValue(String customerName);
   protected abstract String rentalValue(String title, String charge);
   protected abstract String owedValue(String totalCharge);
   protected abstract String earnedValue(String totalFrequentRenterPoints);
}
