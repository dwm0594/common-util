package cn.dwm.util;

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
}
