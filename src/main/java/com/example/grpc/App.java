package com.example.grpc;

import com.example.grpc.BrokeredBaseCommand;
import com.example.grpc.UserSession;
import io.grpc.*;
import io.grpc.stub.StreamObserver;
import com.example.grpc.*;

public class App {

    public static void main(String[] args) throws Exception {

//        BrokeredBaseCommand command = BrokeredBaseCommand.newBuilder()
//                .setLocale("gkgjkgjkg")
//                .setTcSessionId("dkfvjshdfsdkjf")
//                .setCurrentContextActionId("sd,fgksdfgdfgdsflgsd")
//                .build();
//
//        System.out.println(command.toString());

        BrokeredBaseCommand baseCommand = BrokeredBaseCommand.newBuilder()
                .setCurrentContextActionId("dlsfkszfcdsfdfsdffjsldf")
                .setLocale("en-US")
                .build();

        System.out.println(baseCommand);

        // Start the gRPC server
        Server server = ServerBuilder.forPort(50051)
                .addService(new HelloServiceImpl())
                .build()
                .start();
        System.out.println("Server started on port 50051");

        // Run client after slight delay
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                        .usePlaintext()
                        .build();

                com.example.grpc.HelloServiceGrpc.HelloServiceBlockingStub stub = com.example.grpc.HelloServiceGrpc.newBlockingStub(channel);
                com.example.grpc.HelloProto.HelloRequest request = com.example.grpc.HelloProto.HelloRequest.newBuilder().setName("Java Dev").build();
                com.example.grpc.HelloProto.HelloResponse response = stub.sayHello(request);
                System.out.println("Client received: " + response.getMessage());

                channel.shutdown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        // Keep server alive
        server.awaitTermination();
    }

    // gRPC Service implementation
    static class HelloServiceImpl extends com.example.grpc.HelloServiceGrpc.HelloServiceImplBase {
        @Override
        public void sayHello(com.example.grpc.HelloProto.HelloRequest request, StreamObserver<com.example.grpc.HelloProto.HelloResponse> responseObserver) {
            String reply = "Hello, " + request.getName() + "!";
            com.example.grpc.HelloProto.HelloResponse response = com.example.grpc.HelloProto.HelloResponse.newBuilder().setMessage(reply).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
