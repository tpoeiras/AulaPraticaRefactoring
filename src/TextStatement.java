public class TextStatement extends Statement {
   protected String headerValue(String customerName) {
      return "Rental Record for " + customerName + "\n";
   }

   protected String rentalValue(String title, String charge) {
      return "\t" + title + "\t" + charge + "\n";
   }

   protected String owedValue(String totalCharge) {
      return "Amount owed is " + totalCharge + "\n";
   }

   protected String earnedValue(String totalFrequentRenterPoints) {
      return "You earned " + totalFrequentRenterPoints +
         " frequent renter points";
   }
}
