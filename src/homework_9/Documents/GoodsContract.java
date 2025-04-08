package homework_9.Documents;

import java.util.Date;

public class GoodsContract extends AbstractDocument {
    private String goodsType;
    private int goodsQuantity;

    public GoodsContract(String goodsType, int goodsQuantity, Date dateDoc, String numDoc) {
        super(numDoc, dateDoc);
        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;
    }

    public String getDocumentNumber() {
        return "GC" + numDoc;
    }

    @Override
    public String getInfo() {
        System.out.println("Контракт на поставку товаров:" +
                " Номер документа - " + numDoc +
                ", Дата документа - " + dateDoc +
                ", Тип товара - " + goodsType +
                ", Количество товаров - " + goodsQuantity);
        return "";
    }
}
