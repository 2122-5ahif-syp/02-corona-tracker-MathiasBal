package at.htl.guestregister.boundary;

import at.htl.guestregister.entity.Customer;
import at.htl.guestregister.repository.CustomerRepository;
import io.swagger.v3.oas.annotations.Operation;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.time.Instant;
import java.util.List;

@Path("api/customer")
public class CustomerService {
    @Inject
    CustomerRepository repository;

    @Operation(
            summary = "Create new customer"
    )
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addCustomer( @FormParam("firstName") String fistName,
                                 @FormParam("lastName") String lastName,
                                 @FormParam("email") String email,
                                 @FormParam("telephone") String telephone){
        var customer = new Customer(fistName, lastName, email, telephone, Instant.now());
        repository.persist(customer);
        return Response.status(201).entity(customer).build();
    }
}
