import javax.swing.*;

public class ScreenResolutionSelector {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScreenResolutionSelector().createAndShowGUI());
    }

    private void createAndShowGUI() {
        String[] resolutions = {"800x600", "1024x768", "1280x1024", "1920x1080"};

        // Создание диалогового окна с выпадающим списком
        String selectedResolution = (String) JOptionPane.showInputDialog(
                null,
                "Выберите разрешение экрана:",
                "Выбор разрешения",
                JOptionPane.PLAIN_MESSAGE,
                null,
                resolutions,
                resolutions[0]
        );

        // Проверка, если пользователь не выбрал разрешение
        if (selectedResolution != null) {
            // Парсинг выбранного разрешения
            String[] dimensions = selectedResolution.split("x");
            int width = Integer.parseInt(dimensions[0]);
            int height = Integer.parseInt(dimensions[1]);

            // Создание окна с выбранным разрешением
            JFrame frame = new JFrame("Окно с разрешением " + selectedResolution);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(width, height);
            frame.setLocationRelativeTo(null); // Центрирование окна
            frame.setVisible(true);
        }
    }
}

