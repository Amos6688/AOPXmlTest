package concert;

import org.aspectj.lang.annotation.*;

/**
 * 观众类：观看演出的切面
 */

public class Audience
{


    public void silenceCellPhones()
    {
        System.out.println("Silencing cell Phones");
    }


    public void takeSeats()
    {
        System.out.println("Taking seats");
    }


    public void applause()
    {
        System.out.println("CLAP CLAP CLAP");
    }


    public void demandRefund()
    {
        System.out.println("Demanding a refund");
    }
}
