package hello.container;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

import java.util.Set;

public class MyContainerInitV1 implements ServletContainerInitializer {

    /**
     * onStartup 서블릿 컨테이너 초기화
     * 초기화 메소드는 resources/META-INF/services/jakarta.servlet.ServletContainerInitializer (해당 파일이 있는 패키지명+파일)
     * 해당 파일안 경로 지정을 해주어야 한다. hello.container.MyContainerInitV1
     */
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.println("MyContainerInitV1.onStartup");
        System.out.println("c = " + c);
        System.out.println("ctx = " + ctx);
    }
}
