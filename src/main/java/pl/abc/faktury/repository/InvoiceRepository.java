package pl.abc.faktury.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.abc.faktury.model.entity.Invoice;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
}
