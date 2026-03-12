package Codex.exam.tasks;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {

    EnvironmentVariables environmentVariables;

    private final String url;

    public NavigateTo (String url){
        this.url=url;
    }

    public static Task sauceDemoPage(){
        String url="url.base";
        return instrumented(NavigateTo.class,url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(url))
        );

    }
}
