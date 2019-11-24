package pl.abc.faktury.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.abc.faktury.service.InvoiceService;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/add-invoice")
    public String addInvoice() {

        return "add-invoice";
    }

    /** Add invoice
     *     InvoiceDto invoiceDto = new InvoiceDto();
     *     invoiceDto.setNumber("FV/2019/001");
     *
     *     invoiceService.createInvoice(invoiceDto);
     *
     */

    /**
    @PostMapping("/adduser")
    public String addUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }

        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());

        return "index";
    }
    */

}
