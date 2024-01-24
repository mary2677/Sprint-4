import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Main_Page;
import pages.MainList;


public class List extends BaseTest{
    private final String[] expectedAnswersList = new String[]{
            "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
            "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
            "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
            "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    };
    @Test
    public void CheckDropDownListText() {

        Main_Page objMainPage = new Main_Page(driver);
        objMainPage.clickCookieButton();

        MainList objMainList = new MainList(driver);
        objMainList.scrollPageToEndOfList();

        for (int i = 0; i < 8; i++) {
            objMainList.clickQuestionArrow(i);
            objMainList.checkTextInOpenPanel(expectedAnswersList[i], i);
        }
    }
}
