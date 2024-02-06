public class Shop {

    public static final int APPLEPRICE = 8;
    public static final int STRAWBERRYPRICE = 13;
    public static final int MANGOPRICE = 20;

    public static int totalPrice1(int appleSum, int strawberrySum) {
        if (appleSum < 0 || strawberrySum < 0) {
            System.out.println("ERROR");
            return -1;
        }
        int totalPrice = 0;
        totalPrice = appleSum * APPLEPRICE + strawberrySum * STRAWBERRYPRICE;
        return totalPrice;
    }

    public static int totalPrice2(int appleSum, int strawberrySum, int mangoSum) {
        if (appleSum < 0 || strawberrySum < 0 || mangoSum < 0) {
            System.out.println("ERROR");
            return -1;
        }
        int totalPrice = 0;
        totalPrice = appleSum * APPLEPRICE + strawberrySum * STRAWBERRYPRICE + mangoSum * MANGOPRICE;
        return totalPrice;
    }

    public static double totalPrice3(int appleSum, int strawberrySum, int mangoSum) {
        if (appleSum < 0 || strawberrySum < 0 || mangoSum < 0) {
            System.out.println("ERROR");
            return -1;
        }
        double totalPrice = 0;
        totalPrice = appleSum * APPLEPRICE + strawberrySum * STRAWBERRYPRICE * 0.8 + mangoSum * MANGOPRICE;
        return totalPrice;
    }

    public static int totalPrice4(int appleSum, int strawberrySum, int mangoSum) {
        if (appleSum < 0 || strawberrySum < 0 || mangoSum < 0) {
            System.out.println("ERROR");
            return -1;
        }
        int totalPrice = 0;
        int sum = 0;
        totalPrice = appleSum * APPLEPRICE + strawberrySum * STRAWBERRYPRICE + mangoSum * MANGOPRICE;
        sum = totalPrice / 100;
        totalPrice -= sum * 10;
        return totalPrice;
    }


}
