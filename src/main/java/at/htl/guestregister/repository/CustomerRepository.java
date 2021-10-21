package at.htl.guestregister.repository;

import at.htl.guestregister.entity.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class CustomerRepository implements PanacheRepository<Customer> {
}
