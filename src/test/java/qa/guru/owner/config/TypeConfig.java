package qa.guru.owner.config;

import org.aeonbits.owner.Config;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;

// проверить File, URL, Path, byte[]
public interface TypeConfig extends Config {

    @Key("integer")
    Integer getInteger();

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();

    @Key("enum")
    Browser getEnum();

    @Key("File")
    File getFile();

    @Key("URL")
    URL getUrl();

    @Key("Path")
    Path getPath();

    @Key("byte")
    byte getByte();
}