package OOPS.FourPillars;

class Bank{
    private int accNo;
    private int custNo;

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Bank obj = new Bank();
//        obj.custNo=3;
        System.out.println(obj.getAccNo());
        System.out.println(obj.getCustNo());
    }
}
