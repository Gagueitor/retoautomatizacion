package automatizacion.questions;


import automatizacion.userinterface.FillOutFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String confirmRegistration = Text.of(FillOutFormPage.CONFIRM_REGISTRATION).viewedBy(actor).asString();
        if (question.equals(confirmRegistration)){
            result = true;

        }else {
            result = false;
        }
        return result;
    }
}
