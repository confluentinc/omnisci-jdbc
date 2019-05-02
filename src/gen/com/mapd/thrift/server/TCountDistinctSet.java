/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mapd.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-05-01")
public class TCountDistinctSet implements org.apache.thrift.TBase<TCountDistinctSet, TCountDistinctSet._Fields>, java.io.Serializable, Cloneable, Comparable<TCountDistinctSet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCountDistinctSet");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STORAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("storage", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField REMOTE_PTR_FIELD_DESC = new org.apache.thrift.protocol.TField("remote_ptr", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCountDistinctSetStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCountDistinctSetTupleSchemeFactory();

  /**
   * 
   * @see TCountDistinctImplType
   */
  public TCountDistinctImplType type; // required
  public TCountDistinctSetStorage storage; // required
  public long remote_ptr; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TCountDistinctImplType
     */
    TYPE((short)1, "type"),
    STORAGE((short)2, "storage"),
    REMOTE_PTR((short)3, "remote_ptr");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // STORAGE
          return STORAGE;
        case 3: // REMOTE_PTR
          return REMOTE_PTR;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __REMOTE_PTR_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TCountDistinctImplType.class)));
    tmpMap.put(_Fields.STORAGE, new org.apache.thrift.meta_data.FieldMetaData("storage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCountDistinctSetStorage.class)));
    tmpMap.put(_Fields.REMOTE_PTR, new org.apache.thrift.meta_data.FieldMetaData("remote_ptr", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCountDistinctSet.class, metaDataMap);
  }

  public TCountDistinctSet() {
  }

  public TCountDistinctSet(
    TCountDistinctImplType type,
    TCountDistinctSetStorage storage,
    long remote_ptr)
  {
    this();
    this.type = type;
    this.storage = storage;
    this.remote_ptr = remote_ptr;
    setRemote_ptrIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCountDistinctSet(TCountDistinctSet other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetStorage()) {
      this.storage = new TCountDistinctSetStorage(other.storage);
    }
    this.remote_ptr = other.remote_ptr;
  }

  public TCountDistinctSet deepCopy() {
    return new TCountDistinctSet(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.storage = null;
    setRemote_ptrIsSet(false);
    this.remote_ptr = 0;
  }

  /**
   * 
   * @see TCountDistinctImplType
   */
  public TCountDistinctImplType getType() {
    return this.type;
  }

  /**
   * 
   * @see TCountDistinctImplType
   */
  public TCountDistinctSet setType(TCountDistinctImplType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public TCountDistinctSetStorage getStorage() {
    return this.storage;
  }

  public TCountDistinctSet setStorage(TCountDistinctSetStorage storage) {
    this.storage = storage;
    return this;
  }

  public void unsetStorage() {
    this.storage = null;
  }

  /** Returns true if field storage is set (has been assigned a value) and false otherwise */
  public boolean isSetStorage() {
    return this.storage != null;
  }

  public void setStorageIsSet(boolean value) {
    if (!value) {
      this.storage = null;
    }
  }

  public long getRemote_ptr() {
    return this.remote_ptr;
  }

  public TCountDistinctSet setRemote_ptr(long remote_ptr) {
    this.remote_ptr = remote_ptr;
    setRemote_ptrIsSet(true);
    return this;
  }

  public void unsetRemote_ptr() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REMOTE_PTR_ISSET_ID);
  }

  /** Returns true if field remote_ptr is set (has been assigned a value) and false otherwise */
  public boolean isSetRemote_ptr() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REMOTE_PTR_ISSET_ID);
  }

  public void setRemote_ptrIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REMOTE_PTR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TCountDistinctImplType)value);
      }
      break;

    case STORAGE:
      if (value == null) {
        unsetStorage();
      } else {
        setStorage((TCountDistinctSetStorage)value);
      }
      break;

    case REMOTE_PTR:
      if (value == null) {
        unsetRemote_ptr();
      } else {
        setRemote_ptr((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case STORAGE:
      return getStorage();

    case REMOTE_PTR:
      return getRemote_ptr();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case STORAGE:
      return isSetStorage();
    case REMOTE_PTR:
      return isSetRemote_ptr();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TCountDistinctSet)
      return this.equals((TCountDistinctSet)that);
    return false;
  }

  public boolean equals(TCountDistinctSet that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_storage = true && this.isSetStorage();
    boolean that_present_storage = true && that.isSetStorage();
    if (this_present_storage || that_present_storage) {
      if (!(this_present_storage && that_present_storage))
        return false;
      if (!this.storage.equals(that.storage))
        return false;
    }

    boolean this_present_remote_ptr = true;
    boolean that_present_remote_ptr = true;
    if (this_present_remote_ptr || that_present_remote_ptr) {
      if (!(this_present_remote_ptr && that_present_remote_ptr))
        return false;
      if (this.remote_ptr != that.remote_ptr)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetStorage()) ? 131071 : 524287);
    if (isSetStorage())
      hashCode = hashCode * 8191 + storage.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(remote_ptr);

    return hashCode;
  }

  @Override
  public int compareTo(TCountDistinctSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStorage()).compareTo(other.isSetStorage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStorage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storage, other.storage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRemote_ptr()).compareTo(other.isSetRemote_ptr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemote_ptr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remote_ptr, other.remote_ptr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCountDistinctSet(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("storage:");
    if (this.storage == null) {
      sb.append("null");
    } else {
      sb.append(this.storage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("remote_ptr:");
    sb.append(this.remote_ptr);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCountDistinctSetStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCountDistinctSetStandardScheme getScheme() {
      return new TCountDistinctSetStandardScheme();
    }
  }

  private static class TCountDistinctSetStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCountDistinctSet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCountDistinctSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.mapd.thrift.server.TCountDistinctImplType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STORAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.storage = new TCountDistinctSetStorage();
              struct.storage.read(iprot);
              struct.setStorageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REMOTE_PTR
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.remote_ptr = iprot.readI64();
              struct.setRemote_ptrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCountDistinctSet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.storage != null) {
        oprot.writeFieldBegin(STORAGE_FIELD_DESC);
        struct.storage.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REMOTE_PTR_FIELD_DESC);
      oprot.writeI64(struct.remote_ptr);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCountDistinctSetTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCountDistinctSetTupleScheme getScheme() {
      return new TCountDistinctSetTupleScheme();
    }
  }

  private static class TCountDistinctSetTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCountDistinctSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCountDistinctSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetStorage()) {
        optionals.set(1);
      }
      if (struct.isSetRemote_ptr()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetStorage()) {
        struct.storage.write(oprot);
      }
      if (struct.isSetRemote_ptr()) {
        oprot.writeI64(struct.remote_ptr);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCountDistinctSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.type = com.mapd.thrift.server.TCountDistinctImplType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.storage = new TCountDistinctSetStorage();
        struct.storage.read(iprot);
        struct.setStorageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.remote_ptr = iprot.readI64();
        struct.setRemote_ptrIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

