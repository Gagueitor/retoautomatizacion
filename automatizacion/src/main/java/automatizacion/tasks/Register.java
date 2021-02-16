package automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Click;
import automatizacion.userinterface.UtestLoginPage;

public class Register implements Task {
    public static Register onthePague() {
        return Tasks.instrumented(Register.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestLoginPage.LOGIN_BUTTON));
    }
}
