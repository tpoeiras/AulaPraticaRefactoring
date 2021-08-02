import java.util.Enumeration;

public class TextStatement extends Statement {
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

   private String headerValue(String customerName) {
      return "Rental Record for " + customerName + "\n";
   }

   private String rentalValue(String title, String charge) {
      return "\t" + title + "\t" + charge + "\n";
   }

   private String owedValue(String totalCharge) {
      return "Amount owed is " + totalCharge + "\n";
   }

   private String earnedValue(String totalFrequentRenterPoints) {
      return "You earned " + totalFrequentRenterPoints +
         " frequent renter points";
   }
}
