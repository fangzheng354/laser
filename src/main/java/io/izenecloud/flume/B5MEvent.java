/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package io.izenecloud.flume;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class B5MEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"B5MEvent\",\"namespace\":\"com.b5m.flume\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"Unix epoch time on the server in seconds\"},{\"name\":\"remoteAddress\",\"type\":\"string\",\"doc\":\"Client IP address\"},{\"name\":\"forwardAddress\",\"type\":\"string\"},{\"name\":\"userAgent\",\"type\":\"string\"},{\"name\":\"args\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"internalArgs\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"body\",\"type\":\"string\"},{\"name\":\"match\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Unix epoch time on the server in seconds */
  @Deprecated public long timestamp;
  /** Client IP address */
  @Deprecated public java.lang.CharSequence remoteAddress;
  @Deprecated public java.lang.CharSequence forwardAddress;
  @Deprecated public java.lang.CharSequence userAgent;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> args;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> internalArgs;
  @Deprecated public java.lang.CharSequence body;
  @Deprecated public boolean match;

  /**
   * Default constructor.
   */
  public B5MEvent() {}

  /**
   * All-args constructor.
   */
  public B5MEvent(java.lang.Long timestamp, java.lang.CharSequence remoteAddress, java.lang.CharSequence forwardAddress, java.lang.CharSequence userAgent, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> args, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> internalArgs, java.lang.CharSequence body, java.lang.Boolean match) {
    this.timestamp = timestamp;
    this.remoteAddress = remoteAddress;
    this.forwardAddress = forwardAddress;
    this.userAgent = userAgent;
    this.args = args;
    this.internalArgs = internalArgs;
    this.body = body;
    this.match = match;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return timestamp;
    case 1: return remoteAddress;
    case 2: return forwardAddress;
    case 3: return userAgent;
    case 4: return args;
    case 5: return internalArgs;
    case 6: return body;
    case 7: return match;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: timestamp = (java.lang.Long)value$; break;
    case 1: remoteAddress = (java.lang.CharSequence)value$; break;
    case 2: forwardAddress = (java.lang.CharSequence)value$; break;
    case 3: userAgent = (java.lang.CharSequence)value$; break;
    case 4: args = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 5: internalArgs = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 6: body = (java.lang.CharSequence)value$; break;
    case 7: match = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'timestamp' field.
   * Unix epoch time on the server in seconds   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * Unix epoch time on the server in seconds   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'remoteAddress' field.
   * Client IP address   */
  public java.lang.CharSequence getRemoteAddress() {
    return remoteAddress;
  }

  /**
   * Sets the value of the 'remoteAddress' field.
   * Client IP address   * @param value the value to set.
   */
  public void setRemoteAddress(java.lang.CharSequence value) {
    this.remoteAddress = value;
  }

  /**
   * Gets the value of the 'forwardAddress' field.
   */
  public java.lang.CharSequence getForwardAddress() {
    return forwardAddress;
  }

  /**
   * Sets the value of the 'forwardAddress' field.
   * @param value the value to set.
   */
  public void setForwardAddress(java.lang.CharSequence value) {
    this.forwardAddress = value;
  }

  /**
   * Gets the value of the 'userAgent' field.
   */
  public java.lang.CharSequence getUserAgent() {
    return userAgent;
  }

  /**
   * Sets the value of the 'userAgent' field.
   * @param value the value to set.
   */
  public void setUserAgent(java.lang.CharSequence value) {
    this.userAgent = value;
  }

  /**
   * Gets the value of the 'args' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getArgs() {
    return args;
  }

  /**
   * Sets the value of the 'args' field.
   * @param value the value to set.
   */
  public void setArgs(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.args = value;
  }

  /**
   * Gets the value of the 'internalArgs' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getInternalArgs() {
    return internalArgs;
  }

  /**
   * Sets the value of the 'internalArgs' field.
   * @param value the value to set.
   */
  public void setInternalArgs(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.internalArgs = value;
  }

  /**
   * Gets the value of the 'body' field.
   */
  public java.lang.CharSequence getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * @param value the value to set.
   */
  public void setBody(java.lang.CharSequence value) {
    this.body = value;
  }

  /**
   * Gets the value of the 'match' field.
   */
  public java.lang.Boolean getMatch() {
    return match;
  }

  /**
   * Sets the value of the 'match' field.
   * @param value the value to set.
   */
  public void setMatch(java.lang.Boolean value) {
    this.match = value;
  }

  /** Creates a new B5MEvent RecordBuilder */
  public static io.izenecloud.flume.B5MEvent.Builder newBuilder() {
    return new io.izenecloud.flume.B5MEvent.Builder();
  }
  
  /** Creates a new B5MEvent RecordBuilder by copying an existing Builder */
  public static io.izenecloud.flume.B5MEvent.Builder newBuilder(io.izenecloud.flume.B5MEvent.Builder other) {
    return new io.izenecloud.flume.B5MEvent.Builder(other);
  }
  
  /** Creates a new B5MEvent RecordBuilder by copying an existing B5MEvent instance */
  public static io.izenecloud.flume.B5MEvent.Builder newBuilder(io.izenecloud.flume.B5MEvent other) {
    return new io.izenecloud.flume.B5MEvent.Builder(other);
  }
  
  /**
   * RecordBuilder for B5MEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<B5MEvent>
    implements org.apache.avro.data.RecordBuilder<B5MEvent> {

    private long timestamp;
    private java.lang.CharSequence remoteAddress;
    private java.lang.CharSequence forwardAddress;
    private java.lang.CharSequence userAgent;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> args;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> internalArgs;
    private java.lang.CharSequence body;
    private boolean match;

    /** Creates a new Builder */
    private Builder() {
      super(io.izenecloud.flume.B5MEvent.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(io.izenecloud.flume.B5MEvent.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing B5MEvent instance */
    private Builder(io.izenecloud.flume.B5MEvent other) {
            super(io.izenecloud.flume.B5MEvent.SCHEMA$);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.remoteAddress)) {
        this.remoteAddress = data().deepCopy(fields()[1].schema(), other.remoteAddress);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.forwardAddress)) {
        this.forwardAddress = data().deepCopy(fields()[2].schema(), other.forwardAddress);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.userAgent)) {
        this.userAgent = data().deepCopy(fields()[3].schema(), other.userAgent);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.args)) {
        this.args = data().deepCopy(fields()[4].schema(), other.args);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.internalArgs)) {
        this.internalArgs = data().deepCopy(fields()[5].schema(), other.internalArgs);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.body)) {
        this.body = data().deepCopy(fields()[6].schema(), other.body);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.match)) {
        this.match = data().deepCopy(fields()[7].schema(), other.match);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public io.izenecloud.flume.B5MEvent.Builder setTimestamp(long value) {
      validate(fields()[0], value);
      this.timestamp = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'timestamp' field */
    public io.izenecloud.flume.B5MEvent.Builder clearTimestamp() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'remoteAddress' field */
    public java.lang.CharSequence getRemoteAddress() {
      return remoteAddress;
    }
    
    /** Sets the value of the 'remoteAddress' field */
    public io.izenecloud.flume.B5MEvent.Builder setRemoteAddress(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.remoteAddress = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'remoteAddress' field has been set */
    public boolean hasRemoteAddress() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'remoteAddress' field */
    public io.izenecloud.flume.B5MEvent.Builder clearRemoteAddress() {
      remoteAddress = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'forwardAddress' field */
    public java.lang.CharSequence getForwardAddress() {
      return forwardAddress;
    }
    
    /** Sets the value of the 'forwardAddress' field */
    public io.izenecloud.flume.B5MEvent.Builder setForwardAddress(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.forwardAddress = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'forwardAddress' field has been set */
    public boolean hasForwardAddress() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'forwardAddress' field */
    public io.izenecloud.flume.B5MEvent.Builder clearForwardAddress() {
      forwardAddress = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'userAgent' field */
    public java.lang.CharSequence getUserAgent() {
      return userAgent;
    }
    
    /** Sets the value of the 'userAgent' field */
    public io.izenecloud.flume.B5MEvent.Builder setUserAgent(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.userAgent = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'userAgent' field has been set */
    public boolean hasUserAgent() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'userAgent' field */
    public io.izenecloud.flume.B5MEvent.Builder clearUserAgent() {
      userAgent = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'args' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getArgs() {
      return args;
    }
    
    /** Sets the value of the 'args' field */
    public io.izenecloud.flume.B5MEvent.Builder setArgs(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.args = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'args' field has been set */
    public boolean hasArgs() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'args' field */
    public io.izenecloud.flume.B5MEvent.Builder clearArgs() {
      args = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'internalArgs' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getInternalArgs() {
      return internalArgs;
    }
    
    /** Sets the value of the 'internalArgs' field */
    public io.izenecloud.flume.B5MEvent.Builder setInternalArgs(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[5], value);
      this.internalArgs = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'internalArgs' field has been set */
    public boolean hasInternalArgs() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'internalArgs' field */
    public io.izenecloud.flume.B5MEvent.Builder clearInternalArgs() {
      internalArgs = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'body' field */
    public java.lang.CharSequence getBody() {
      return body;
    }
    
    /** Sets the value of the 'body' field */
    public io.izenecloud.flume.B5MEvent.Builder setBody(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.body = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'body' field has been set */
    public boolean hasBody() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'body' field */
    public io.izenecloud.flume.B5MEvent.Builder clearBody() {
      body = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'match' field */
    public java.lang.Boolean getMatch() {
      return match;
    }
    
    /** Sets the value of the 'match' field */
    public io.izenecloud.flume.B5MEvent.Builder setMatch(boolean value) {
      validate(fields()[7], value);
      this.match = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'match' field has been set */
    public boolean hasMatch() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'match' field */
    public io.izenecloud.flume.B5MEvent.Builder clearMatch() {
      fieldSetFlags()[7] = false;
      return this;
    }


    public B5MEvent build() {
      try {
        B5MEvent record = new B5MEvent();
        record.timestamp = fieldSetFlags()[0] ? this.timestamp : (java.lang.Long) defaultValue(fields()[0]);
        record.remoteAddress = fieldSetFlags()[1] ? this.remoteAddress : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.forwardAddress = fieldSetFlags()[2] ? this.forwardAddress : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.userAgent = fieldSetFlags()[3] ? this.userAgent : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.args = fieldSetFlags()[4] ? this.args : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[4]);
        record.internalArgs = fieldSetFlags()[5] ? this.internalArgs : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[5]);
        record.body = fieldSetFlags()[6] ? this.body : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.match = fieldSetFlags()[7] ? this.match : (java.lang.Boolean) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}