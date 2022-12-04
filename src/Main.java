public class Main {
    public static void main(String[] args) {
        int IOS = 0;
        int Android = 1;
        int clientOS = 0;
        int clientDeviceYear = 2016;
        if (clientDeviceYear >= 2015) {
            if (clientOS < 1) {
                System.out.println(" Установите версию приложения для iOS по ссылке ");
            } else {
                System.out.println(" Установите  версию приложения для Android по ссылке ");
            }
        } else {
            if
            (clientOS > 0) {
                System.out.println(" Установите  облегчённую версию приложения для Android по ссылке ");
            } else {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
            }
        }
    }
}