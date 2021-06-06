package ds;

public class MobileFactory {
    // Factory of Mobile
    public MobileDevice getMobileDevice(String name){
        if(name.equals("MI"))
            return new MiMobileDevice();
        else if(name.equals("Apple"))
            return new AppleMobileDevice();
        else
            return null;
    }

}


