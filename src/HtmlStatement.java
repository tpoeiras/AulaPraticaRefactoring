public class HtmlStatement extends Statement {
   protected String headerValue(String customerName) {
      return "<H1>Rentals for <EM>" + customerName + "</EM></H1><P>\n";
   }

   protected String rentalValue(String title, String charge) {
      return title + ": " + charge + "<BR>\n";
   }

   protected String owedValue(String totalCharge) {
      return "<P>You owe <EM>" + totalCharge + "</EM><P>\n";
   }

   protected String earnedValue(String totalFrequentRenterPoints) {
      return "On this rental you earned <EM>" + totalFrequentRenterPoints +
          "</EM> frequent renter points<P>";
   }
}
