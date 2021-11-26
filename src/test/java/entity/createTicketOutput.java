package entity;

public class createTicketOutput {
    public String TicketNum;

    public String getTicketNum() {
        return TicketNum;
    }

    public void setTicketNum(String ticketNum) {
        TicketNum = ticketNum;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public String getFunctionalArea() {
        return FunctionalArea;
    }

    public void setFunctionalArea(String functionalArea) {
        FunctionalArea = functionalArea;
    }

    public String RequestId;
    public String FunctionalArea;
}
