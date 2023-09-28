import java.util.function.LongFunction;

public class Main {
    public static void main(String[] args) {

        Country country = new Country("Россия");
        country.setCountryName("Россия");
        country.setCountrySquare(160.12);
        country.setCountryCapitalName("Москва");
        country.setCountryCountPeople(14600000);
        country.setExitInSea(true);


        System.out.println(country.getCountryName());
        System.out.println(country.getCountryCapitalName());
        System.out.println(country.getCountrySquare());
        System.out.println(country.getCountryCountPeople());
        System.out.println(country.getIsHaveExitInSea());

    }
}
