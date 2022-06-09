package top.sailliao.miao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("top.sailliao.miao.dao")
@SpringBootApplication
public class MiaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiaoApplication.class, args);
	}

}
