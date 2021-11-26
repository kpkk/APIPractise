package entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrowserProps {

    private String os;
    private String os_version;
    private String browser;
    private String device;
    private String browser_version;
    private String real_mobile;

    public String getBrowser_version() {
        return browser_version;
    }

    public void setBrowser_version(String browser_version) {
        this.browser_version = browser_version;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getReal_mobile() {
        return real_mobile;
    }

    public void setReal_mobile(String real_mobile) {
        this.real_mobile = real_mobile;
    }


}

