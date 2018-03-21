package concert;

import org.aspectj.lang.ProceedingJoinPoint;


public class Audience2
{
    public void quit(ProceedingJoinPoint jp)
    {
        try{
            System.out.println("Thanks  Thanks Thanks");
            jp.proceed();  //执行方法
            System.out.println("byebye  byebye byebye");
        }catch (Throwable e){
            System.out.println("sorry sorry sorry");
        }
    }

}
