package homework_9.Documents;

import java.util.Date;

public abstract class AbstractDocument implements Document {
    protected String numDoc;
    protected Date dateDoc;
    public AbstractDocument (String numDoc, Date dateDoc) {
        this.numDoc = numDoc;
        this.dateDoc = dateDoc;
    }

    public abstract String getInfo();
}
