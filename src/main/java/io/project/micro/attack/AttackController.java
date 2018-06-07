package io.project.micro.attack;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.reactivex.Single;
import javax.inject.Inject;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author armdev
 */
@Controller("/users")
@Validated
public class AttackController {

    @Inject
    private AttackToServer attack;

    @Get("/find/{name}")
    public Single<String> hello(@NotBlank String name) {
        return Single.just("Your username is  " + name  + " !");
    }

    @Get("/find/username/{name}")
    public String get(@NotBlank String name) {
        return attack.hello(name);
    }
}
