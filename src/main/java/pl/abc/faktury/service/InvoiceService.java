package pl.abc.faktury.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.abc.faktury.model.dto.InvoiceDto;
import pl.abc.faktury.model.entity.Invoice;
import pl.abc.faktury.repository.InvoiceRepository;

import javax.annotation.Resource;

@Service
@Transactional
public class InvoiceService {

    @Resource
    private InvoiceRepository invoiceRepository;

    public void createInvoice(InvoiceDto invoiceDto) {

    Invoice invoice = new Invoice();
    invoice.setNumber(invoiceDto.getNumber());

    invoiceRepository.save(invoice);

    }
}
