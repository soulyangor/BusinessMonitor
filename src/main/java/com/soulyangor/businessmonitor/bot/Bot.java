package com.soulyangor.businessmonitor.bot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Component
public class Bot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
     System.out.println(update.toString());
    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {

    }

    @Override
    public String getBotUsername() {
        return "TestVoshodbot";
    }

    @Override
    public String getBotToken() {
        return "645646082:AAF7mrsy6trkbfRqdZTlbHbYDjwWDs1JP3g";
    }
}
