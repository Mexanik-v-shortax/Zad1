//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        scanner.nextLine();

        if (command == 1) {
            user.openAccount(Currency.RUB);
        }

        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        scanner.nextLine();

        if (command == 1) {
            user.openAccount(Currency.USD);
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        scanner.nextLine();

        if (command == 1) {
            user.openAccount(Currency.EUR);
        }

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.hasAccount(Currency.RUB)) {
            System.out.println("- RUB");
        }
        if (user.hasAccount(Currency.USD)) {
            System.out.println("- USD");
        }
        if (user.hasAccount(Currency.EUR)) {
            System.out.println("- EUR");
        }
    }
}

enum Currency {
    RUB, USD, EUR
}

class PersonAccount {
    String name;

    CurrencyAccount accountRUB;
    CurrencyAccount accountUSD;
    CurrencyAccount accountEUR;

    PersonAccount(String userName) {
        name = userName;
    }

    public void openAccount(Currency currency) {
        switch (currency) {
            case RUB:
                accountRUB = new CurrencyAccount(currency,0.0);
                break;
            case USD:
                accountUSD = new CurrencyAccount(currency, 0.0);
                break;
            case EUR:
                accountEUR = new CurrencyAccount(currency, 0.0);
                break;
        }
    }

    public boolean hasAccount(Currency currency) {
        switch (currency) {
            case RUB:
                return accountRUB != null;
            case USD:
                return accountUSD != null;
            case EUR:
                return accountEUR != null;
            default:
                return false;
        }
    }
}

class CurrencyAccount {
    Currency currency;
    double balance;

    CurrencyAccount(Currency currency, double balance) {
        this.currency = currency;
        this.balance = balance;
    }
}