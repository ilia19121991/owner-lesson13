package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.Browser;
import qa.guru.owner.config.TypeConfig;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.remote.BrowserType.CHROME;

public class TypeTest {

    @Test
    public void testInteger() {
        System.setProperty("integer", "10");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(10);

    }

    @Test
    public void testDouble() {
        System.setProperty("double", "10.1");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(10.1);

    }

    @Test
    public void testBoolean() {
        System.setProperty("boolean", "false");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(false);

    }

    @Test
    public void testEnum() {
        System.setProperty("enum", "CHROME");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getEnum()).isEqualTo(Browser.CHROME);

    }

    @Test
    public void testFile() {
        System.setProperty("File", "C:\\Users\\ilia1\\IdeaProjects\\owner-lesson13\\src\\test\\resources\\1.png");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getFile().toString())
                .isEqualTo("C:\\Users\\ilia1\\IdeaProjects\\owner-lesson13\\src\\test\\resources\\1.png");
    }

    @Test
    public void testUrl() {
        System.setProperty("URL", "https://github.com/");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getUrl().toString()).isEqualTo("https://github.com/");
    }

    @Test
    public void testPath() {
        // System.setProperty("Path", String.valueOf(Path.of("https://github.com/enterprise")));
        System.setProperty("Path", "C:\\Users\\ilia1\\IdeaProjects\\owner-lesson13\\src\\test\\resources\\1.png");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getPath().toString())
                .isEqualTo("C:\\Users\\ilia1\\IdeaProjects\\owner-lesson13\\src\\test\\resources\\1.png");

        System.out.println(config);

    }

    @Test
    public void testByte() {

        System.setProperty("byte", "2");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getByte()).isEqualTo(2);

        System.out.println(config);
    }

}
