import java.util.List;
import java.util.Map;
import java.util.HashMap;

class       Sale {
    String category;
    double amount;

    public Sale(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}

class SalesReporter {
    /**
     * TO-DO: Aggregate total sales for each product category using map.merge().
     * \*
     *
     * @param sales A list of Sale objects.
     * @return A Map where keys are category names and values are total sales
     * for that category.
     */
    public Map<String, Double> aggregateSales(List<Sale> sales) {
        Map<String, Double> categoryTotals = new HashMap<>();

        for (Sale sale : sales) {
            categoryTotals.merge(sale.getCategory(), sale.getAmount(), Double::sum);
        }
        return categoryTotals;
    }
}