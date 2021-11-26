package entity;

public class createTicketResponse {
    public Object WSResponseHeader;
    public createTicketOutput createTicketOutput;
    public String xmlns;

    public Object getWSResponseHeader() {
        return WSResponseHeader;
    }

    public void setWSResponseHeader(Object WSResponseHeader) {
        this.WSResponseHeader = WSResponseHeader;
    }

    public entity.createTicketOutput getCreateTicketOutput() {
        return createTicketOutput;
    }

    public void setCreateTicketOutput(entity.createTicketOutput createTicketOutput) {
        this.createTicketOutput = createTicketOutput;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getNs2() {
        return ns2;
    }

    public void setNs2(String ns2) {
        this.ns2 = ns2;
    }

    public String getNs3() {
        return ns3;
    }

    public void setNs3(String ns3) {
        this.ns3 = ns3;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String ns2;
    public String ns3;
    public String text;
}
