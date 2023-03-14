package q_ProxyPattern;

public class PrinterProxy implements Printable {

	private String name; // 이름 
    private Printer real; // "본인" 

	public PrinterProxy() {}
	// 생성자
	public PrinterProxy(String name) {
        this.name = name;
    }
    // 이름의 설정
    public synchronized void setPrinterName(String name) {
		System.out.println("proxy : setPrinterName()"); 
		this.name = name;
        if (this.real != null) {
            this.real.setPrinterName(name);
		}
    }
    // 이름의 취득
    public String getPrinterName() {
        System.out.println("proxy : getPrinterName()"); 
        return name;
    }
	// 표시
    public void print(String string) {
        realize();
        real.print(string);
    }
	// "본인"을 생성
    private synchronized void realize() {
        if(this.real == null || this.real.getPrinterName() != this.name)
            this.real = new Printer(this.name);
    }
}
