public class FlowOfExecution {
    public static boolean isHoopy(int x) {
        boolean hoopyFlag;
        if(x % 2 == 0) {
            hoopyFlag = true;
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }
    public static boolean isFrabjuous(int x) {
        boolean frabjuousFlag;
        if(x > 0) {
            frabjuousFlag = true;
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
    public static void main(String[] args) {
        boolean flag1 = isHoopy(202);
        boolean flag2 = isFrabjuous(202);
        System.out.println(flag1);
        System.out.println(flag2);
        if (flag1 && flag2) {
            System.out.println("ping!");
        }
        if (flag1 || flag2) {
            System.out.println("pong!");
        }
    }
}
/*
* I already see flag1 and flag 2
* making me think of capture the flag.
*
* Overall, I see true and false statements.
* It's going to print Ping or Pong, or both.
* For the second, it's going to be true because the
* value IS over 0. For the first, 202 % 2
* 202 modulo 2 is 0. It's all true, and it'll print the
* Ping and Pong.
*
* True
* true
* ping
* pong
*  */