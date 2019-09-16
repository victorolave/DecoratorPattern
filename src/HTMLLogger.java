import javax.xml.crypto.Data;

public class HTMLLogger extends LoggerDecorator {

    public HTMLLogger (Logger inp_logger) {
        super(inp_logger);
    }

    public void log(String DataLine){

        DataLine = makeHTML(DataLine);
        logger.log(DataLine);

    }

    public String makeHTML(String DataLine)
    {
        DataLine = "<HTML><BODY>" + "<b>" + DataLine + "</b>"
                + "</BODY></HTML>";

        return DataLine;
    }

}
