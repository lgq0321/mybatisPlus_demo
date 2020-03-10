package com.example.demo.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisPlusGenerator {
  public static void main(String[] args) {
    //1. 全局配置
    GlobalConfig config = new GlobalConfig();
    config.setActiveRecord(false) // 是否支持AR模式，自动生成实体类对应的CRUD方法
            .setAuthor("liuguoquan") // 作者
//            .setOutputDir("E:\\idea_project\\mybatisPlus_demo") // 生成路径
            .setOutputDir("d:\\MybatisPlus\\src\\main\\java") // 生成路径
            .setFileOverride(true)  // 文件是否覆盖
            .setOpen(true) //生成完后是否打开文件夹
            .setEnableCache(false) //是否在xml中添加二级缓存配置
            .setIdType(IdType.NONE) // 主键策略
//            .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I
//            .setMapperName("%sDao")
//            .setXmlName("%sDao")

    .setEntityName("%s")
    .setControllerName("%sController")
    .setServiceName("%sService")
    .setServiceImplName("%sServiceImpl")
    .setMapperName("%sDao")
    .setXmlName("%sDao")



            // IEmployeeService
            .setBaseResultMap(true) //生成基本的resultMap
            .setBaseColumnList(true)//生成基本的SQL片段
            .setSwagger2(true);  //实体属性 Swagger2 注解

    //2. 数据源配置
    DataSourceConfig dsConfig  = new DataSourceConfig();
    dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型
            .setDriverName("com.mysql.cj.jdbc.Driver")
            .setUrl("jdbc:mysql://111.229.51.50:3306/sigema?useSSL=false&serverTimezone=Asia/Shanghai")
            .setUsername("root")
            .setPassword("123456");

    //3. 策略配置StrategyConfig中
    StrategyConfig stConfig = new StrategyConfig();
//    String[] fieldPrefix = {"YC_"};
                stConfig
                //使用lombok
              .setEntityLombokModel(true)
              //rest风格
              .setRestControllerStyle(true)
//            .setCapitalMode(true) //全局大写命名
            .setNaming(NamingStrategy.underline_to_camel)// 数据库表映射到实体的命名策略
            .entityTableFieldAnnotationEnable(true);

//            .setTablePrefix("YC_") //去除表的前缀
//            .setInclude(new String[]{"yc_monthlyreport"});
//            .setFieldPrefix(fieldPrefix);//去除字段前缀;

    // .setTablePrefix("hyb_"); //指定扫描表的前缀
    //.setInclude("employee");  // 指定扫描的表的名称

    //4. 包名策略配置
    PackageConfig pkConfig = new PackageConfig();
    pkConfig
//  .setParent("com.sishu.workflow")
            //E:\idea_project\marvel\sigmacloud-workflow\src\main\java\com\sishu\workflow\entity\sql
            //com.sishu.workflow.entity.sql
//            .setMapper("dao")//daos
//            .setService("service")//servcie
//            .setController("controller")//controller
//            .setEntity("entity")
//            .setXml("dao");//mapper.xml

.setParent("com.sishu.workflow")
.setXml("dao.xml")
            .setMapper("dao.sql")
.setController("controller")
.setEntity("entity.sql");

//            .setParent("com.example.demo")
//            .setXml("dao.xml")
//            .setMapper("dao")
//            .setController("controller")
//            .setEntity("entity");


    //5. 整合配置
    AutoGenerator ag = new AutoGenerator();
    ag.setGlobalConfig(config)
            .setDataSource(dsConfig)
            .setStrategy(stConfig)
            .setPackageInfo(pkConfig);

    //6. 执行
    ag.execute();
  }
}