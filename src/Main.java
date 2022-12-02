public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        if ( deliveryDistance > 60 ) {
            System.out.println(" Потребуется дней: 3 ");
        }else if ( deliveryDistance <= 20  ) {System.out.println( " Потребуется дней: 1 " );
        }else if ( deliveryDistance <= 60 ) {System.out.println( " Потребуется дней: 2 " );
        }else if ( deliveryDistance <= 100  ) {System.out.println( " Потребуется дней: 3 " );
        }
    }
}


