public class Main {
    public static void main(String[] args) {
        int IOS = 0;
        int Android = 1;
        int clientOS = 0;
        if ( clientOS < 1 )
        {System.out.println( " Установите версию приложения для iOS по ссылке ");}
        else {System.out.println( " Установите версию приложения для Android по ссылке ");}
        int clientDeviceYear = 2013;
        if ( clientDeviceYear >= 2015 )
        { if ( clientOS < 1  )
        {System.out.println( " Установите версию приложения для iOS по ссылке ");} else
        {System.out.println( " Установите версию приложения для Android по ссылке ");}}
        if ( clientDeviceYear < 2015 )
        { if ( clientOS < 1  )
        {System.out.println( " Установите облегченную версию приложения для Android по ссылк");} else
        {System.out.println( " Установите облегченную версию приложения для Android по ссылке ");}}





        }
    }