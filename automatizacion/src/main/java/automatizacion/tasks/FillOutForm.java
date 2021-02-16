package automatizacion.tasks;

import automatizacion.userinterface.FillOutFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillOutForm implements Task {
    public static FillOutForm the(){
        return Tasks.instrumented(FillOutForm.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Martha").into(FillOutFormPage.INPUT_FIRSTNAME),
                Enter.theValue("Morales Zuluaica").into(FillOutFormPage.INPUT_LASTTNAME),
                Enter.theValue("mar-2617@hotmail.com").into(FillOutFormPage.INPUT_EMAIL),
                Click.on(FillOutFormPage.INPUT_MONTH),
                Click.on(FillOutFormPage.INPUT_MONTH_OPTION),
                Click.on(FillOutFormPage.INPUT_DAY),
                Click.on(FillOutFormPage.INPUT_DAY_OPTION),
                Click.on(FillOutFormPage.INPUT_YEAR),
                Click.on(FillOutFormPage.INPUT_YEAR_OPTION),
                Click.on(FillOutFormPage.ENTER_BUTTON),
                Click.on(FillOutFormPage.ENTER_BUTTON_TWO),
                Click.on(FillOutFormPage.ENTER_BUTTON_THREE),
                Enter.theValue("(uuxKV#LO^x7V").into(FillOutFormPage.INPUT_PASSWORD),
                Enter.theValue("(uuxKV#LO^x7V").into(FillOutFormPage.INPUT_CONFIRM_PASSWORD),
                Click.on(FillOutFormPage.ENTER_TERMS),
                Click.on(FillOutFormPage.ENTER_PRIVACY),
                Click.on(FillOutFormPage.ENTER_COMPLETE));

    }
}
