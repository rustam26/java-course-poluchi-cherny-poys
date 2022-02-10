package work_with_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {

        Path source = Paths.get("C:\\Users\\rusta\\Desktop\\X");
        Path destination = Paths.get("C:\\Users\\rusta\\Desktop\\CopyHere");

        Files.walkFileTree(source, new MyFileVisitor2(source,destination));

        System.out.println("Done!");
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {

    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination,StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;

    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination,StandardCopyOption.REPLACE_EXISTING);

        return FileVisitResult.CONTINUE;
    }
}
