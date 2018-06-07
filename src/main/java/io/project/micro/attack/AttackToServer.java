package io.project.micro.attack;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.Client;

/**
 *
 * @author armdev
 */
@Client("/users")
public interface AttackToServer {

    @Get("/find/{name}")
    String hello(String name);
}
