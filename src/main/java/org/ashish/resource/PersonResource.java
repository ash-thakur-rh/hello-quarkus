package org.ashish.resource;

import org.ashish.dto.PersonDTO;
import org.ashish.service.PersonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/persons")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

    @Inject
    PersonService personService;

    @GET
    @Path("/{name}")
    public Response getPersonByName(@PathParam("name") String name) {
        return personService.getPersonByName(name)
                .map(person -> Response.ok(person).build())
                .orElseGet(() -> Response.status(Response.Status.NOT_FOUND).build());
    }
}
