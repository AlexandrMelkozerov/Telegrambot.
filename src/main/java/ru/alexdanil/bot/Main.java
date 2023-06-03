package ru.alexdanil.bot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;



public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new newsbot()); // register your bot here
            System.out.println("Бот успешно запущен!");
        } catch (TelegramApiException e) {
            System.out.println("Не удалось запустить бота: " + e.getMessage());
        }
    }
}