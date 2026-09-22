void main() {
    System.out.print("byte");
    System.out.print(" ");
    System.out.print(Byte.SIZE);
    System.out.print(" ");
    System.out.print(Byte.MIN_VALUE);
    System.out.print(" ");
    System.out.println(Byte.MAX_VALUE);
    ;

    System.out.print("short");
    System.out.print(" ");
    System.out.print(Short.SIZE);
    System.out.print(" ");
    System.out.print(Short.MIN_VALUE);
    System.out.print(" ");
    System.out.println(Short.MAX_VALUE);
    ;

    System.out.print("int");
    System.out.print(" ");
    System.out.print(Integer.SIZE);
    System.out.print(" ");
    System.out.print(Integer.MIN_VALUE);
    System.out.print(" ");
    System.out.println(Integer.MAX_VALUE);
    ;

    System.out.print("long");
    System.out.print(" ");
    System.out.print(Long.SIZE);
    System.out.print(" ");
    System.out.print(Long.MIN_VALUE);
    System.out.print(" ");
    System.out.println(Long.MAX_VALUE);
    ;

    System.out.print("float");
    System.out.print(" ");
    System.out.print(Float.SIZE);
    System.out.print(" ");
    System.out.print(Float.MIN_VALUE);
    System.out.print(" ");
    System.out.println(Float.MAX_VALUE);
    ;

    System.out.print("double");
    System.out.print(" ");
    System.out.print(Double.SIZE);
    System.out.print(" ");
    System.out.print(Double.MIN_VALUE);
    System.out.print(" ");
    System.out.println(Double.MAX_VALUE);
    ;

    System.out.print("Char");
    System.out.print(" ");
    System.out.print(Character.SIZE);
    System.out.print(" ");
    System.out.print(Character.MIN_VALUE);
    System.out.print(" ");
    System.out.println(Character.MAX_VALUE);
    ;

    System.out.print("Boolean");
    System.out.print(" ");
    System.out.print("1");
    System.out.print(" ");
    System.out.print(Boolean.FALSE);
    System.out.print(" ");
    System.out.println(Boolean.TRUE);;

    Scanner reader = new Scanner(System.in);

    System.out.print("Ввести число: ");

    byte valByte = Byte.parseByte(reader.nextLine());
    System.out.print(valByte);
    System.out.print(" ");

    short valShort = Short.parseShort(reader.nextLine());
    System.out.print(valShort);
    System.out.print(" ");

    int valInt = Integer.parseInt(reader.nextLine());
    System.out.print(valInt);
    System.out.print(" ");

    long valLong = Long.parseLong(reader.nextLine());
    System.out.print(valLong);
    System.out.print(" ");

    float valFloat = Float.parseFloat(reader.nextLine());
    System.out.print(valFloat);
    System.out.print(" ");

    double valDouble = Double.parseDouble(reader.nextLine());
    System.out.print(valDouble);
    System.out.print(" ");

    boolean valBool = Boolean.parseBoolean(reader.nextLine());
    System.out.print(valBool);

}