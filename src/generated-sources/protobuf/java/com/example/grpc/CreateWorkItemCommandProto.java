// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: create_work_item.proto

// Protobuf Java Version: 3.25.1
package com.example.grpc;

public final class CreateWorkItemCommandProto {
  private CreateWorkItemCommandProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_broker_CreateWorkItemCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_broker_CreateWorkItemCommand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026create_work_item.proto\022\006broker\032\026broker" +
      "ed_message.proto\"\210\001\n\025CreateWorkItemComma" +
      "nd\022+\n\004base\030\001 \001(\0132\035.broker.TcBrokeredBase" +
      "Command\022\r\n\005title\030\002 \001(\t\022\023\n\013description\030\003 " +
      "\001(\t\022\014\n\004type\030\004 \001(\t\022\020\n\010priority\030\005 \001(\tB0\n\020c" +
      "om.example.grpcB\032CreateWorkItemCommandPr" +
      "otoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.example.grpc.BrokeredMessageProto.getDescriptor(),
        });
    internal_static_broker_CreateWorkItemCommand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_broker_CreateWorkItemCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_broker_CreateWorkItemCommand_descriptor,
        new java.lang.String[] { "Base", "Title", "Description", "Type", "Priority", });
    com.example.grpc.BrokeredMessageProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
