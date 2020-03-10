package com.example.demo;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.example.demo.entity.ControlPanel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@ComponentScan("com.example.demo.*")
class DemoApplicationTests {

    @Qualifier("myselfIdentifierGenerator")
    @Autowired
    IdentifierGenerator identifierGenerator;
//    @Autowired
//    RoleOperation roleOperation;

    @Test
    void contextLoads() {
//        System.out.println(roleOperation.op("admin"));

        ControlPanel controlPanel2 = new ControlPanel();
//        ControlPanel controlPanel =ControlPanel.builder().build();
        System.out.println(identifierGenerator.nextUUID(null));
    }

    public static void main(String[] args) {
//        String a;
//        a.ra



    }


}
