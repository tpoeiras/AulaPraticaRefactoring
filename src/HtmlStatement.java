import java.util.Enumeration;

public class HtmlStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = headerValue(aCustomer.getName());
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += rentalValue(each.getMovie().getTitle(), String.valueOf(each.getCharge()));
      }
      //add footer lines
      result += owedValue(String.valueOf(aCustomer.getTotalCharge()));
      result += earnedValue(String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
      return result;
   }

   private String headerValue(String customerName) {
      return "<H1>Rentals for <EM>" + customerName + "</EM></H1><P>\n";
   }

   private String rentalValue(String title, String charge) {
      return title + ": " + charge + "<BR>\n";
   }

   private String owedValue(String totalCharge) {
      return "<P>You owe <EM>" + totalCharge + "</EM><P>\n";
   }

   private String earnedValue(String totalFrequentRenterPoints) {
      return "On this rental you earned <EM>" + totalFrequentRenterPoints +
          "</EM> frequent renter points<P>";
   }
}
