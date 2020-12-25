import com.zzc.dao.EmpDao;
import com.zzc.entity.Emp;
import com.zzc.service.EmpServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author liu
 * @Date 2020/12/24 14:05
 */
public class TestCase {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = ac.getBean("empDao",EmpDao.class);
        System.out.println(empDao.findAll());
    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpServiceImpl empServiceImpl = ac.getBean("empServiceImpl",EmpServiceImpl.class);
        System.out.println(empServiceImpl.findAll());
    }
    @Test
    public void test3() throws IOException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpServiceImpl empServiceImpl = ac.getBean("empServiceImpl",EmpServiceImpl.class);
        empServiceImpl.insertEmp(Emp.builder().name("孙尚香").job("谋士").sal(9999.9).deptno(0).build());
    }
    @Test
    public void test4(){
        /**
         * 相同单词出现的次数 wordcount
         * hello tom hello jerry
         * hello 2
         * tom 1
         * jerry 1
         */
        //wordcount
        //(1)map对每一个单词进行分割 hello tom hello jerry
        //reduce 计数 相同的单词次数加一 不同的单词次数设置为1
        String wordStr = "hello tom hello jerry hello rose jerry";
        String[] split = wordStr.split(" ");
        Map<String, Integer> wordcount = new HashMap<String, Integer>();
        for (String word : split) {
            Set<String> keySet = wordcount.keySet();
            //获取value 单词出现的次数，相同则次数加1
            Integer count = wordcount.get(word);
            if (keySet.contains(word)){
                count++;
                wordcount.put(word,count);
            }else {
                wordcount.put(word,1);
            }
        }
        System.out.println(wordcount);
    }
}
