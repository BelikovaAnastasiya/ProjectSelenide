import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SomeTestClass {

    @Test
    public void choseeMovieTest()
    {
        String movieName = "Звездные Войны";
        open("https://www.kinopoisk.ru/");
        $(".header-search-partial-component__search-field").setValue(movieName);
        $(".header-search-partial-component__button").click();

    }
}
