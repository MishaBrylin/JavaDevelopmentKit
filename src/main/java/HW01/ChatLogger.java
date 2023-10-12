package HW01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ChatLogger {
    private static final String LOG_FILE = "./src/main/java/HW01/log.txt";
    private List<String> messageHistory;

    public ChatLogger() {
        messageHistory = new ArrayList<>();
    }

    public void logMessage(String message) {
        try {
            FileWriter fileWriter = new FileWriter(LOG_FILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getMessageHistory() {
        return messageHistory;
    }

    public void loadMessageHistory() {
        try {
            File file = new File(LOG_FILE);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                messageHistory.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}