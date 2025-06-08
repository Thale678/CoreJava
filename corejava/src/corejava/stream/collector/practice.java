package corejava.stream.collector;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class practice {
    public static void main(String[] args) {
        


        String sentences = "Hello world, hello!,Java streams are powerful. streams make life easier.";

    String[] split = sentences.split("\\W+");

    Map<String, Long> collect = Arrays.asList(split).stream().collect(Collectors.groupingBy(x -> x,Collectors.counting()));
    /*
System.out.println(collect);
collect.forEach((key, value) -> System.out.println(key + ": " + value));

 collect.entrySet().stream().forEach((Entry) -> System.out.println("Word :"+Entry.getKey()+" - Count :"+Entry.getValue()));
 */

        @SuppressWarnings("unused")
        List<Transaction> transactions = Arrays.asList(
            new Transaction("T001", "DEPOSIT", 1500.0, LocalDate.of(2025, 1, 10), "SUCCESS"),
            new Transaction("T002", "WITHDRAWAL", 500.0, LocalDate.of(2025, 1, 11), "SUCCESS"),
            new Transaction("T003", "TRANSFER", 750.0, LocalDate.of(2025, 1, 12), "CANCELED"),
            new Transaction("T004", "DEPOSIT", 2000.0, LocalDate.of(2025, 1, 13), "SUCCESS"),
            new Transaction("T005", "TRANSFER", 1250.0, LocalDate.of(2025, 1, 14), "SUCCESS"),
            new Transaction("T006", "WITHDRAWAL", 300.0, LocalDate.of(2025, 1, 15), "FAILED"),
            new Transaction("T007", "DEPOSIT", 800.0, LocalDate.of(2025, 1, 16), "SUCCESS")
        );

       Map<String, Double> collect2 = transactions.stream().collect(Collectors.groupingBy(x -> x.getType(),Collectors.summingDouble(Transaction::getAmount)));
        
       collect2.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed()).forEach((Entry) -> System.out.println(Entry.getKey()+" :"+Entry.getValue()));
      // System.out.println(collect2);




      List<String> list = Arrays.asList("banana", "apple", "kiwi", "pineapple","kiwi");

      String result = list.stream().distinct().sorted(Comparator.comparing(String::length)).collect(Collectors.joining(","));
      System.out.println("Sort By String length :"+result);


      List<List<Integer>> nested = Arrays.asList(
    Arrays.asList(1,7,2),
    Arrays.asList(3, 4),
    Arrays.asList(5));

    List<Integer> collect3 = nested.stream().flatMap(x -> x.stream()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println("Flattern list using flatMap : "+collect3);


//--------------------------------------------------------------------------------------------------------
List<Sale> sales = Arrays.asList(
    new Sale("P101", "Electronics", 2, 500.0, LocalDate.now().minusMonths(2)),
    new Sale("P102", "Books", 5, 20.0, LocalDate.now().minusMonths(7)),  // exclude
    new Sale("P103", "Electronics", 1, 1200.0, LocalDate.now().minusMonths(1)),
    new Sale("P104", "Furniture", 1, 1500.0, LocalDate.now().minusMonths(3)),
    new Sale("P105", "Books", 10, 15.0, LocalDate.now().minusDays(15)),
    new Sale("P106", "Furniture", 1, 900.0, LocalDate.now().minusMonths(1)),
    new Sale("P107", "Kitchen", 4, 100.0, LocalDate.now().minusMonths(2))

);
LocalDate sixMonthsAgo = LocalDate.now().minusMonths(2);
System.out.println("Get  orders 2 months ago");
    sales.stream().filter(date -> date.getDate().isBefore(sixMonthsAgo)).forEach(System.out::println);
    System.out.println("group By category");
    sales.stream().collect(Collectors.groupingBy(Sale::getCategory,Collectors.
    mapping(Sale::getProductId,Collectors.joining(",")))).forEach((k,v) -> System.out.println(k+" : "+v));
    
    System.out.println("Compute total revenue per category (quantity * unitPrice).");
    sales.stream().collect(Collectors.groupingBy(Sale::getCategory,Collectors.
    summingDouble(x -> x.getUnitPrice()*x.getQuantity()))).forEach((k,v) -> System.out.println(k+" : "+v));


    System.out.println("Compute total revenue per category (quantity * unitPrice).Sort By revenue desc");
    sales.stream().collect(Collectors.groupingBy(Sale::getCategory,Collectors.
    summingDouble(x -> x.getUnitPrice()*x.getQuantity()))).entrySet().stream()
    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(1).limit(2).forEach(x -> System.out.println(x.getKey()+" : "+x.getValue()));
    
   
}
    
    }



















     class Transaction {
        private String transactionId;
        private String type;
        private double amount;
        private LocalDate date;
        private String status;
        
        // Constructors, getters, setters, and toString() omitted for brevity

        public Transaction(String transactionId, String type,double amount, LocalDate date, String status) {
            this.amount = amount;
            this.date = date;
            this.status = status;
            this.transactionId = transactionId;
            this.type = type;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Transaction{");
            sb.append("transactionId=").append(transactionId);
            sb.append(", type=").append(type);
            sb.append(", amount=").append(amount);
            sb.append(", date=").append(date);
            sb.append(", status=").append(status);
            sb.append('}');
            return sb.toString();
        }
    }

    class Sale {
        String productId;
        String category;
        int quantity;
        double unitPrice;
        LocalDate date;
       
    public Sale(String productId, String category,int quantity,double unitPrice,LocalDate date) {
        this.category = category;
        this.date = date;
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sale{");
        sb.append("productId=").append(productId);
        sb.append(", category=").append(category);
        sb.append(", quantity=").append(quantity);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    }