public class Country {

    //Задаем переменные
    String countryName;
    int countryCountPeople;
    double countrySquare;
    String countryCapitalName;
    boolean isHaveExitInSea;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    // Задаем геттеры
    public double getCountrySquare() {
        return countrySquare;
    }

    public String getCountryCapitalName() {
        return countryCapitalName;
    }

    public int getCountryCountPeople() {
        return countryCountPeople;
    }

    public String getCountryName() {
        return countryName;
    }
    public boolean getIsHaveExitInSea() {
        return isHaveExitInSea;
    }

    //Задаем сеттеры

    public void setCountryCapitalName(String countryCapitalName) {
        this.countryCapitalName = countryCapitalName;
    }

    public void setCountryCountPeople(int countryCountPeople) {
        this.countryCountPeople = countryCountPeople;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountrySquare(double countrySquare) {
        this.countrySquare = countrySquare;
    }

    public void setExitInSea(boolean isHaveExitInSea) {
        this.isHaveExitInSea = isHaveExitInSea;
    }
}
