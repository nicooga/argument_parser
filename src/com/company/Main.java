package com.company;

public class Main {
    public static void main(String[] args) throws ArgsException {
        Args arg = new Args("l,p#,d*", args);

        boolean logging = arg.getBoolean('l');
        int port = arg.getInt('p');
        String directory = arg.getString('d');

        executeApplication(logging, port, directory);
    }

    private static void executeApplication(boolean logging, int port, String directory) {
        String message = String.format(
                "Heeey I was called with: logging = %s, port = %d and directory='%s'",
                logging ? "true" : "false",
                port,
                directory
        );

        System.out.print(message);
    }
}
