package cn.dwm.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;

/**
 * @author dwm
 * @since 2023/3/22 20:16
 */
@Configuration
public class CommonConfiguration {

    @Bean
    public ExecutorService executorService() {
        return new ThreadPoolExecutor(
                10,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(200),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
    }


    @Bean
    public Snowflake snowflake() {
        return IdUtil.getSnowflake(1, 1);
    }

}
