package automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillOutFormPage extends PageObject {
    public static final Target INPUT_FIRSTNAME          = Target.the("").located(By.id("firstName"));
    public static final Target INPUT_LASTTNAME          = Target.the("").located(By.id("lastName"));
    public static final Target INPUT_EMAIL              = Target.the("").located(By.id("email"));
    public static final Target INPUT_MONTH              = Target.the("").located(By.id("birthMonth"));
    public static final Target INPUT_MONTH_OPTION       = Target.the("").located( By.cssSelector("#birthMonth > option[label='March']"));
    public static final Target INPUT_DAY                = Target.the("").located(By.id("birthDay"));
    public static final Target INPUT_DAY_OPTION         = Target.the("").located(By.cssSelector("#birthDay > option[label='9']"));
    public static final Target INPUT_YEAR               = Target.the("").located(By.id("birthYear"));
    public static final Target INPUT_YEAR_OPTION        = Target.the("").located( By.cssSelector("#birthYear > option[label='1966']"));
    public static final Target ENTER_BUTTON             = Target.the("").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
    public static final Target ENTER_BUTTON_TWO         = Target.the("").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target ENTER_BUTTON_THREE       = Target.the("").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PASSWORD           = Target.the("").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD   = Target.the("").located(By.id("confirmPassword"));
    public static final Target ENTER_TERMS              = Target.the("").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ENTER_PRIVACY            = Target.the("").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target ENTER_COMPLETE           = Target.the("").located(By.xpath("//*[@id='laddaBtn']"));
    public static final Target CONFIRM_REGISTRATION     = Target.the("").located(By.xpath("//h1"));


}
