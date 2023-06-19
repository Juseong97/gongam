public class b {

    private String name;
    private String addr;

    public b(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public void myName(){
        System.out.println("이름은: "+this.name+"\n"+ "주소는: "+this.addr);
    }
}
