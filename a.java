import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;
import java.util.Date;
import java.io.*;

class a {
    int x = 20000;

    void withdraw() {
        System.out.println("ENTER THE AMOUNT WANT TO WITHDRAW");
        Scanner ch = new Scanner(System.in);
        int y = ch.nextInt();
        if (y > x) {
            System.out.println("TRANSACTION FAILED");
            System.exit(0);
        } else {
            System.out.println(" PURPOSE TO WITHDRAW MONEY");
            String p = ch.next();
            x = x - y;
            System.out.println("YOUR WITHDRAWAL AMOUNT IS " + y);
            System.out.println("YOUR TRANSICATION IS SUCCESSFULL ");
            System.out.println("HAVE A GOOD DAY");
            System.out.println("THANKYOU !! VISIT AGAIN !!");
            Date t = new Date();
            String to = t.toString();
            try {
                FileWriter fw = new FileWriter("abc.txt", true);
                BufferedWriter f = new BufferedWriter(fw);
                f.write(to);
                f.write(p);
                f.newLine();
                f.close();
                f.flush();
            }

            catch (Exception e) {
            }
        }
    }
}

class b extends a {
    void deposit() {
        System.out.println("ENTER THE AMOUNT TO DEPOSITE INTO YOUR ACCOUNT");
        Scanner t = new Scanner(System.in);
        int i = t.nextInt();
        x = x + i;
        System.out.println("CASH DEPOSITE IS SUCCESSFULLY DONE");
    }

    void checkbal() {
        System.out.println("YOUR TOTAL AMOUNT IS " + x);
    }

    void help() {
        try {
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("https://www.bankbazaar.com/personal-loan-customer-care.html"));
        } catch (Exception e) {
        }
    }

    void mini() {
        try {
            FileReader fr = new FileReader("abc.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println("Details are :" + line);
                line = br.readLine();
            }
        } catch (Exception e) {
        }
    }

    void m() {
        int o;
        int h = 1234;
        Scanner m = new Scanner(System.in);
        System.out.println("ENTER YOUR PIN");
        int c = m.nextInt();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        if (c == h) {
            System.out.println(" WELCOME TO  ATM");
            while (true) {
                Scanner t = new Scanner(System.in);
                System.out.println("1.Withdarwal Money");
                System.out.println("2.Deposit Money");
                System.out.println("3.Check Your Balance");
                System.out.println("4.Helpline Numbers");
                System.out.println("5.Mini Statment");
                System.out.println("6.Exit");
                int j = t.nextInt();
                switch (j) {
                    case 1:
                        withdraw();
                        break;
                        case 2: deposit();
                        break;
                        case 3: checkbal();
                        break;
                    case 4:
                        help();
                        break;
                    case 5:
                        mini();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid");
                }
            }
        } else {
            System.out.println("WORNG PASSWORD");
        }
    }
}

class mainc {
    public static void main(String[] arg) {
        b obj = new b();
        obj.m();
    }
}