package edu.sei.st.logicalcoverage;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RepayStatementCoverageTest {
    Repay cm;
    boolean card;
    boolean  name;
    BigDecimal money;
    BigDecimal pay;
    boolean total;
    boolean part;
    @Test
    public void card_vaild_and_name_vaild_and_money_vaild_and_istotal_and_great_pay() {
         card= true;
          name=true;
         money= new BigDecimal(50);
         pay= new BigDecimal(20);
         total=true;
         part=false;
         cm=new Repay(card,name,money,total,part,pay);
        String actual_result=cm.doRepay();
        Assert.assertEquals("success", actual_result);
    }
    @Test
    public void card_vaild_and_name_vaild_and_money_vaild_and_istotal_and_lower_pay() {
        card= true;
          name=true;
        money= new BigDecimal(20);
         pay= new BigDecimal(5);
         total=true;
         part=false;
         cm=new Repay(card,name,money,total,part,pay);
        String actual_result=cm.doRepay();
        Assert.assertEquals("not enough balance ", actual_result);
    }
    @Test
    public void card_vaild_and_name_vaild_and_money_vaild_and_no_and_lower_pay() {
         card= true;
          name=true;
         money= new BigDecimal(20);
         pay= new BigDecimal(5);
        total=false;
         part=false;
         cm=new Repay(card,name,money,total,part,pay);
        String actual_result=cm.doRepay();
        Assert.assertEquals("return", actual_result);
    }
    @Test
    public void card_invaild_and_name_vaild_and_money_vaild_and_ispart_and_great_pay() {
         card= false;
          name=true;
         money= new BigDecimal(80);
         pay= new BigDecimal(5);
         total=false;
         part=true;
         cm=new Repay(card,name,money,total,part,pay);
        String actual_result=cm.doRepay();
        Assert.assertEquals("card invalid or name invalid or balance <=0 ", actual_result);
    }
}

