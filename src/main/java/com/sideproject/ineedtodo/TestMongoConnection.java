package com.sideproject.ineedtodo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class TestMongoConnection {
 public static void main(String[] args) {
        String uri = "mongodb+srv://duc19052003:Tb0eXGTxndDwmo6r@cluster0.1sb8lz9.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("test");
            System.out.println("Connection successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
