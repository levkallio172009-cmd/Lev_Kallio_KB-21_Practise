void main() {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Введіть ціле число");
    int intVal = scanner.nextInt();

    System.out.print("Введіть число з плаваючою точкою");
    double doubleVal = scanner.nextDouble();

    scanner.nextLine();

    System.out.print("Введіть строку");
    String strVal = scanner.nextLine();

    System.out.print("Введіть true/false");
    boolean boolVal = scanner.nextBoolean();



    System.out.println("1: println всі змінні: " + intVal + " " + doubleVal + " " + strVal + " " + boolVal);

    System.out.println("2: println число int: " + intVal + " " + "true/false: " + boolVal);



    String template3 = "3: MessageFormat Рядок: {2}, Ціле: {0}, Дійсне: {1}";
    System.out.println(MessageFormat.format(template3, intVal, doubleVal, strVal));

    String template4 = "4: MessageFormat число як валюта: {0,number,currency}";
    System.out.println(MessageFormat.format(template4, doubleVal));

    String template5 = "5: MessageFormat число як відсоток: {0,number,percent}";
    System.out.println(MessageFormat.format(template5, doubleVal));



    System.out.format("6: format Десяткове ціле: %d - Науковий запис double: %e%n", intVal, doubleVal);

    System.out.format("7: format Шістнадцяткова: %x - Вісімкова: %o%n", intVal, intVal);

    System.out.format("8: format Дійсне число з точністю до 3 знаків: %.3f%n", doubleVal);

    System.out.format("9: format Ширина поля 25 (праворуч): [%25s]%n", strVal);

    System.out.format("10: format Поле 20 (ліворуч): [%-20s]  Ціле зі знаком: %+d%n", strVal, intVal);

    scanner.close();
}