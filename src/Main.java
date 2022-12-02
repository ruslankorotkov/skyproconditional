public class Main {
    public static void main(String[] args) {
        int IOS = 0;
        int Android = 1;
        int clientOS = 1;
        if ( clientOS < 1 )
        {System.out.println( " Установите версию приложения для iOS по ссылке ");}
        else {System.out.println( " Установите версию приложения для Android по ссылке ");}
        int clientDeviceYear = 2012;
        if ( clientDeviceYear >= 2015 )
        { if ( clientOS < 1  )
        {System.out.println( " Установите версию приложения для iOS по ссылке ");} else
        {System.out.println( " Установите версию приложения для Android по ссылке ");}}
        if ( clientDeviceYear < 2015 )
        { if ( clientOS < 1  )
        {System.out.println( " Установите облегченную версию приложения для Android по ссылке ");} else
        {System.out.println( " Установите облегченную версию приложения для Android по ссылке ");}}


        int monthNumber = 12;
        switch ( monthNumber ) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("такого месяца нет");
        }

        switch ( monthNumber ) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("такого времени года нет");
        }

        }

    }