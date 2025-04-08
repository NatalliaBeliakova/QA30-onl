package homework_9.Documents;

import java.util.Date;

public class Invoice extends AbstractDocument{
    private double totalAmount;
    private String departmentCode;

    public Invoice (double totalAmount, String departmentCode, Date dateDoc, String numDoc) {
        super(numDoc, dateDoc);
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
    }
    public String getDocumentNumber() {
        return "INV" + numDoc;
    }

    @Override
    public String getInfo() {
        System.out.println("Финансовая накладная:" +
                " Номер документа - " + numDoc +
                ", Дата документа - " + dateDoc +
                ", Итоговая сумма за месяц - " + totalAmount +
                ", Код департамента - " + departmentCode);
        return "";
    }
}
