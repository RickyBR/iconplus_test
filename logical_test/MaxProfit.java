public class MaxProfit {

    public static void main(String[] args) {
        // Contoh input
        int[] prices1 = {10, 9, 6, 5, 15};
        int[] prices2 = {7, 8, 3, 10, 8};
        int[] prices3 = {5, 12, 11, 12, 10};
        int[] prices4 = {7, 18, 27, 10, 29};
        int[] prices5 = {20, 17, 15, 14, 10};

        System.out.println("Keuntungan terbaik: " + findMaxProfit(prices1));
        System.out.println("Keuntungan terbaik: " + findMaxProfit(prices2));
        System.out.println("Keuntungan terbaik: " + findMaxProfit(prices3));
        System.out.println("Keuntungan terbaik: " + findMaxProfit(prices4));
        System.out.println("Keuntungan terbaik: " + findMaxProfit(prices5));
    }

    public static int findMaxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            throw new IllegalArgumentException("Array harus memiliki setidaknya dua elemen.");
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            int potentialProfit = currentPrice - minPrice;

            maxProfit = Math.max(maxProfit, potentialProfit);
            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;
    }
}