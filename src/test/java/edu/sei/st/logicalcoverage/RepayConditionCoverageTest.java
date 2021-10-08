package edu.sei.st.logicalcoverage;


import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RepayConditionCoverageTest {
    @Test
    public void card_vaild_and_name_vaild_and_money_vaild_and_istotal_and_great_pay() {
        boolean card= true;
        boolean  name=true;
        BigDecimal money= new BigDecimal(50);
        BigDecimal pay= new BigDecimal(20);
        boolean total=true;
        boolean part=false;
        Repay cm=new Repay(card,name,money,total,part,pay);
        String actual_result=cm.doRepay();
        Assert.assertEquals("success", actual_result);
    }
    @Test
    public void card_vaild_and_name_vaild_and_money_vaild_and_ispart_and_lower_pay() {
        boolean card= true;
        boolean  name=true;
        BigDecimal money= new BigDecimal(20);
        BigDecimal pay= new BigDecimal(5);
        boolean total=false;
        boolean part=true;
        Repay cm=new Repay(card,name,money,total,part,pay);
        String actual_result=cm.doRepay();
        Assert.assertEquals("not enough balance ", actual_result);
    }
    @Test
    public void card_vaild_and_name_vaild_and_money_vaild_and_no_and_lower_pay() {
        boolean card= true;
        boolean  name=true;
        BigDecimal money= new BigDecimal(20);
        BigDecimal pay= new BigDecimal(5);
        boolean total=false;
        boolean part=false;
        Repay cm=new Repay(card,name,money,total,part,pay);
        String actual_result=cm.doRepay();
        Assert.assertEquals("return", actual_result);
    }
    @Test
    public void card_invaild_and_name_vaild_and_money_vaild_and_ispart_and_great_pay() {
        boolean card= false;
        boolean  name=true;
        BigDecimal money= new BigDecimal(80);
        BigDecimal pay= new BigDecimal(5);
        boolean total=false;
        boolean part=true;
        Repay cm=new Repay(card,name,money,total,part,pay);
        String actual_result=cm.doRepay();
        Assert.assertEquals("card invalid or name invalid or balance <=0 ", actual_result);
    }
    @Test
    public void card_vaild_and_name_invaild_and_money_vaild_and_ispart_and_great_pay() {
        boolean card= true;
        boolean  name=false;
        BigDecimal money= new BigDecimal(80);
        BigDecimal pay= new BigDecimal(5);
        boolean total=false;
        boolean part=true;
        Repay cm=new Repay(card,name,money,total,part,pay);
        String actual_result=cm.doRepay();
        Assert.assertEquals("card invalid or name invalid or balance <=0 ", actual_result);
    }
    @Test
    public void card_vaild_and_name_vaild_and_money_invaild_and_ispart_and_great_pay() {
        boolean card= true;
        boolean  name=true;
        BigDecimal money= new BigDecimal(-1);
        BigDecimal pay= new BigDecimal(5);
        boolean total=false;
        boolean part=true;
        Repay cm=new Repay(card,name,money,total,part,pay);
        String actual_result=cm.doRepay();
        Assert.assertEquals("card invalid or name invalid or balance <=0 ", actual_result);
    }
}