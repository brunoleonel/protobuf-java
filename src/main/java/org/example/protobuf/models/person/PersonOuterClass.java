// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package org.example.protobuf.models.person;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\032\020common/car.proto\032\024common" +
      "/address.proto\"^\n\006Person\022\n\n\002id\030\001 \001(\003\022\014\n\004" +
      "name\030\002 \001(\t\022 \n\007address\030\003 \001(\0132\017.common.Add" +
      "ress\022\030\n\003car\030\004 \003(\0132\013.common.CarB&\n\"org.ex" +
      "ample.protobuf.models.personP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.example.protobuf.models.common.CarOuterClass.getDescriptor(),
          org.example.protobuf.models.common.AddressOuterClass.getDescriptor(),
        });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Id", "Name", "Address", "Car", });
    org.example.protobuf.models.common.CarOuterClass.getDescriptor();
    org.example.protobuf.models.common.AddressOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
