package com.example.groceryapplication.models;

import com.google.firebase.Timestamp;

import java.util.List;

public class ChatRoom {
    private String roomId;
    private List<String> participants;

    Timestamp lastMessageTimestamp;
    String lastSenderId;
    String lastMessage;

    public ChatRoom(String chatroomId, List<String> userIds, Timestamp lastMessageTimestamp, String lastMessageSenderId) {
        this.roomId = chatroomId;
        this.participants = userIds;
        this.lastMessageTimestamp = lastMessageTimestamp;
        this.lastSenderId = lastMessageSenderId;
    }

    public ChatRoom() {
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public Timestamp getLastMessageTimestamp() {
        return lastMessageTimestamp;
    }

    public void setLastMessageTimestamp(Timestamp lastMessageTimestamp) {
        this.lastMessageTimestamp = lastMessageTimestamp;
    }

    public String getLastSenderId() {
        return lastSenderId;
    }

    public void setLastSenderId(String lastSenderId) {
        this.lastSenderId = lastSenderId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
