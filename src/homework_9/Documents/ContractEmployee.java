package homework_9.Documents;

import java.util.Date;

public class ContractEmployee extends AbstractDocument{
    private Date contractEndDate;
    private String employeeName;

    public ContractEmployee (Date contractEndDate, String employeeName, String numDoc, Date dateDoc){
        super(numDoc, dateDoc);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }
    public String getDocumentNumber() {
        return "EC" + numDoc;
    }

    @Override
    public String getInfo() {
        System.out.println("Контракт с сотрудником: " +
                "Номер документа - " + numDoc +
                ", Дата документа - " + dateDoc +
                ", Дата окончания контракта - " + contractEndDate +
                ", Имя сотрудника - " + employeeName);
        return "";
    }
}
