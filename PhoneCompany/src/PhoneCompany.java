import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneCompany {
    List<User> users;

    private final double minutePrice;
    private final double smsPrice;
    private final double gbPrice;


    public PhoneCompany(double minutePrice, double smsPrice, double gbPrice)    {
        this.users = new ArrayList<>();
        this.minutePrice = minutePrice;
        this.smsPrice = smsPrice;
        this.gbPrice = gbPrice;
    }

    public void readUserDataFromFile(File fp)  throws FileNotFoundException{
        Scanner input = new Scanner(fp);

        while(input.hasNextLine()) {
            int code = Integer.parseInt(input.nextLine());
            String name = input.nextLine();
            String lastname = input.nextLine();
            User user = new User(code, name, lastname);
            user.setUsedMinutes(Integer.parseInt(input.nextLine()));
            user.setUsedSMS(Integer.parseInt(input.nextLine()));
            user.setUsedMB(Double.parseDouble(input.nextLine()));
            this.users.add(user);
        }
    }

    public User findUserByCode(int code)    {
        for(User us : this.users)   {
            if(us.getCode() == code)
                return us;
        }
        return null;
    }

    public void computeUserCost(User user)  {
        int minutes = user.getUsedMinutes();
        int sms = user.getUsedSMS();
        double mb = user.getUsedMB();

        user.setTotalCost(minutes * minutePrice + sms * smsPrice + mb * gbPrice / 1000) ;
    }
}
