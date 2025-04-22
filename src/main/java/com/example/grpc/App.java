package com.example.grpc;

public class App {

    public static void main(String[] args) throws Exception {

        com.example.grpc.BrokeredBaseCommand baseCommand = com.example.grpc.BrokeredBaseCommand.newBuilder()
                .setCurrentContextActionId("dlsfkszfcdsfdfsdffjsldf")
                .setLocale("en-US")
                .build();

        System.out.println(baseCommand);


    }


}
