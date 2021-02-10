package testdemo;

public class Testability {

    public static void main(String[] args) {
        try {
            Logger.log(LogLevel.WARNING, "Some warning - program is starting up or whatever");
            MailSender.sendMail("some-invalid-email-address.com", "Program has started.");
        } catch (IllegalArgumentException ex) {
            Logger.log(LogLevel.ERROR, "An error occured: " + ex);
        }
    }
}

enum LogLevel {
    WARNING,
    ERROR
}

class Logger {
    public static void log(LogLevel logLevel, String logText) {
        System.out.println(logLevel + ": " + logText);

        if (logLevel == LogLevel.ERROR) {
            //send e-mail about error
            MailSender.sendMail("kalle.anka@ankeborg.se", logText);
        }
    }
}

class MailSender {
    public static void sendMail(String recipient, String content) {
        if (!recipient.contains("@"))
            throw new IllegalArgumentException("The recipient must be a valid e-mail.");

        //for the sake of simplicity, this actually doesn't send an e-mail right now - but let's pretend it does.
        System.out.println("Sent e-mail to " + recipient + " with content \"" + content + "\"");
    }
}
