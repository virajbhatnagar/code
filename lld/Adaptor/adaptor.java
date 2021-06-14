interface Driver{
    void printer();
}

class SamsungPrinterDriver implements Driver{

    @Override
    public void printer() {
      System.out.println("This is Samsung Printer Driver");
    }
}

interface AppleDriver{
    void iOSDriver();
}

class IOSPrinterDriver implements AppleDriver{

    @Override
    public void iOSDriver() {
        System.out.println("This is Apple Printer Driver");
    }
}

class iOSAdapter implements Driver{

    IOSPrinterDriver iosPrinterDriver;

    public iOSAdapter(IOSPrinterDriver iosPrinterDriver) {
        this.iosPrinterDriver = iosPrinterDriver;
    }


    @Override
    public void printer() {
        iosPrinterDriver.iOSDriver();
    }
}


public class Main {
/* adaptor */
    public static void main(String[] args){
       Driver driver = new SamsungPrinterDriver();
       driver.printer();
       Driver iOSAdapter = new iOSAdapter(new IOSPrinterDriver());
       iOSAdapter.printer();
    }
}
