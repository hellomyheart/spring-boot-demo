package cn.hellomyheart.springboottest8.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description
 * @className: SwaggerConfig
 * @package: cn.hellomyheart.springboottest8.swagger
 * @author: Stephen Shen
 * @date: 2020/9/28 下午10:09
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //配置Swagger的Bean实例
    @Bean
    public Docket createDocket(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                .groupName("StephenShen")////分组名称(可以创建多个Docket就有多个组名)
                .enable(true)//enable表示是否开启Swagger
                .select()
                //RequestHandlerSelectors指定扫描的包
                .apis(RequestHandlerSelectors.basePackage("cn.hellomyheart.springboottest8.controller"))
                .build();
    }

    //配置API的基本信息（会在http://项目实际地址/swagger-ui.html页面显示）
    public ApiInfo createApiInfo(){
        return new ApiInfoBuilder()
                .title("测试标题")
                .description("测试描述")
                .termsOfServiceUrl("https://www.hellomyheart.cn")
                .build();

        //return ApiInfo.DEFAULT;
    }
}
