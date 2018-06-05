package how_many5;

public class HowMany5 {
    public static int findNumbersWith5UsingString(int number) {
        int licznik = 0;
        for (int i = 0; i < number; i++) {
            if(String.valueOf(i).contains("5")) {
                licznik++;
                System.out.println(i);
            }
        }
        return licznik;
    }

    public static int findNumbersWith5UsingModulo(int number) {
        int licznik = 0;
        for (int i = 0; i < number; i++) {
            int current = i;
            while(current != 0) {
                if(current % 10 == 5) {
                    licznik++;
                    break;
                }
                current /= 10;
            }
        }
        return licznik;
    }
}
