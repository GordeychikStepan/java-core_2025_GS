package LW8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class IoPaths {

    private IoPaths() {}

    public static Path baseDir() {
        // C:\Users\<User>\java-io-lab8
        Path dir = Paths.get(System.getProperty("user.home"), "java-io-lab8");
        try {
            Files.createDirectories(dir);
        } catch (IOException e) {
            throw new RuntimeException("Не удалось создать базовую папку: " + dir, e);
        }
        return dir;
    }

    public static Path file(String... parts) {
        Path p = baseDir();
        for (String part : parts) p = p.resolve(part);
        return p;
    }
}

