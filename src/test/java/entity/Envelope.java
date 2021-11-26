package entity;

public class Envelope {
    public Body Body;

    public entity.Body getBody() {
        return Body;
    }

    public void setBody(entity.Body body) {
        Body = body;
    }

    public String getSoap() {
        return soap;
    }

    public void setSoap(String soap) {
        this.soap = soap;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String soap;
    public String text;
}
