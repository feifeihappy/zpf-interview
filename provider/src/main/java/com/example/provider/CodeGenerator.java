package com.example.provider;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 代码生成器
 *
 * @author ht
 */

public class CodeGenerator {
    static final String URL = "jdbc:mysql://localhost:3306/pro?useSSL=false&allowMultiQueries=true";

    public static void main(String[] args) {
        String projectPath = "/Users/zhaopengfei/project/github-project/zpf-interview/provider";//获取项目路径,推荐手动更改，不用自动获取的
        FastAutoGenerator.create(URL, "root", "123456")
                //全局
                .globalConfig(builder ->
                        builder.author("ht")
                                .outputDir(projectPath + "/src/main/java")//输出路径
                                .disableOpenDir()//不打开文件夹
                )
                //包名配置
                .packageConfig(builder ->
                        builder.parent("com.example.provider")
                                //自定义输出路径，mapper.xml生成到resources目录下
                                .pathInfo(Collections.singletonMap(OutputFile.xml, projectPath + "/src/main/resources/mapper")))
                //策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                        .controllerBuilder().enableRestStyle().enableHyphenStyle()
                        .serviceBuilder().formatServiceFileName("%sService")//去掉Service的 "I" 前缀
                        .entityBuilder().enableLombok().addTableFills(
                                new Column("create_time", FieldFill.INSERT)
                        ).build())
                /*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                 */
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板

                //执行
                .execute();
    }


    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}