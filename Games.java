import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Games {
    public static void main(String[] args) {
        String gamesPath = "E:/games";

        File game = new File(gamesPath);
        game.mkdir();

        File srcFolder = new File(gamesPath + "/src");
        File resFolder = new File(gamesPath + "/res");
        File savegamesFolder = new File(gamesPath + "/savegames");
        File tempFolder = new File(gamesPath + "/temp");
        File mainFolder = new File(gamesPath + "/src/main");
        File testFolder = new File(gamesPath + "/src/test");
        File mainJavaFile = new File(gamesPath + "/src/main/Main.java");
        File utilsJavaFile = new File(gamesPath + "/src/main/Utils.java");
        File drawablesFolder = new File(gamesPath + "/res/drawables");
        File vectorsFolder = new File(gamesPath + "/res/vectors");
        File iconsFolder = new File(gamesPath + "/res/icons");
        File tempFile = new File(gamesPath + "/temp/temp.txt");

        srcFolder.mkdir();
        resFolder.mkdir();
        savegamesFolder.mkdir();
        tempFolder.mkdir();
        mainFolder.mkdir();
        testFolder.mkdir();
        drawablesFolder.mkdir();
        vectorsFolder.mkdir();
        iconsFolder.mkdir();

        try {
            mainJavaFile.createNewFile();
            utilsJavaFile.createNewFile();
            tempFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StringBuilder log = new StringBuilder();
        log.append("Файлы и директории успешно созданы:\n");
        log.append(mainJavaFile.getAbsolutePath()).append("\n");
        log.append(utilsJavaFile.getAbsolutePath()).append("\n");
        log.append(tempFile.getAbsolutePath()).append("\n");

        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write(log.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Установка завершена");
    }
}
