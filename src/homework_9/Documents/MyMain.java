package homework_9.Documents;

import homework_9.Exceptions.ABCException;
import homework_9.Exceptions.Finish1a2b;
import homework_9.Exceptions.Start555;

import java.util.Date;

public class MyMain {
    public static void main(String[] args) {
        Register register = new Register();

        try {
            GoodsContract goodsContract = new GoodsContract("ab1234", 5, new Date(), "12rdf3541");
            ContractEmployee employeeContract = new ContractEmployee(new Date(), "Георгий", "32esd31", new Date());
            Invoice invoice = new Invoice(301, "34а", new Date(), "5551fds231");

            checkDocumentNumber(goodsContract.getDocumentNumber());
            checkDocumentNumber(employeeContract.getDocumentNumber());
            checkDocumentNumber(invoice.getDocumentNumber());

            register.saveDocument(goodsContract);
            register.saveDocument(employeeContract);
            register.saveDocument(invoice);

            for (int i = 0; i < register.documents.length; i++) {
                if (register.documents[i] != null) {
                    register.getInfoDocuments(register.documents[i]);
                }
            }
        } catch (ABCException | Start555 | Finish1a2b e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }

    public static void checkDocumentNumber(String numDoc) throws ABCException, Start555, Finish1a2b{
        if (numDoc.contains("abc")) {
            throw new ABCException("Номер документа содержит последовательность 'abc'");
        }

        if (numDoc.startsWith("555")) {
            throw new Start555 ("Номер документа начинается с последовательности '555'");
        }

        if (numDoc.endsWith("1a2b")) {
            throw new Finish1a2b ("Номер документа оканчивается на последовательность '1a2b'");
        }
    }

}

