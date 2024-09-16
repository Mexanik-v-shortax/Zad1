//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float pixelKcalDay = 43; // столько калорий съел Пиксель до похода к бабушке
        float beefKcal = 30.2f; // калорийность говядины
        float chickenKcal = 23.8f; // калорийность курицы
        float creamKcal = 32.1f; // калорийность сливок
        float milkKcal = 13.5f; // калорийность молока

        float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
        float totalKcal = pixelKcalDay + pixelChoice;
        checkKcal(totalKcal);
    }

    private static float getMinKcalsSum(float firstDishKcal, float secondDishKcal, float firstDesert, float secondDesert) {
        float minDishKcal = Math.min(firstDishKcal, secondDishKcal); // вычислите минимальную калорийность основного блюда
        float minDesertKcal = Math.min(firstDesert, secondDesert); // вычислите минимальную калорийность десерта
        return minDishKcal + minDesertKcal;
    }

    private static void checkKcal(float catKcal) {
        System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
        if (catKcal > 100) {
            System.out.println("Пиксель сегодня не уложился в норму.");
        } else {
            System.out.println("Лимит не превышен!");
        }
    }
}
