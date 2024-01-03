package com.example.chat.model;

public record Message(String senderName,
                      String receiverName,
                      String message,
                      String date,
                      MessageType type) {
}
