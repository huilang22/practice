/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintMessageRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.utl.data.*;
public final class BsdConstraintMessageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdConstraintMessageRequest (String request, BsdConstraintMessageRequestMethod method) {
    initialize(request, "BsdConstraintMessage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdConstraintMessageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdConstraintMessageForBsdConstraintMessageCreate(BsdConstraintMessageObjectBaseData data) {
    if (data != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseHelper.toMap(data, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
  public void setBsdConstraintMessageForBsdConstraintMessageDelete(BsdConstraintMessageObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
  public void setBsdConstraintMessageForBsdConstraintMessageFind(BsdConstraintMessageObjectFilter data) {
    if (data != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectHelper.toMap(data, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
  public void setBsdConstraintMessageForBsdConstraintMessageGet(BsdConstraintMessageObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
  public void setBsdConstraintMessageForBsdConstraintMessageUpdate(BsdConstraintMessageObjectBaseData data) {
    if (data != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseHelper.toMap(data, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
  public BsdConstraintMessageObjectBaseData getBsdConstraintMessageObjectBaseDataBsdConstraintMessageFromBsdConstraintMessageCreate() {
    return BsdConstraintMessageObjectBaseHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
  public BsdConstraintMessageObjectBaseData getBsdConstraintMessageObjectBaseDataBsdConstraintMessageFromBsdConstraintMessageDelete() {
    return BsdConstraintMessageObjectBaseHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
  public BsdConstraintMessageObjectDataList getBsdConstraintMessageObjectDataBsdConstraintMessageFromBsdConstraintMessageFind() {
    return BsdConstraintMessageObjectHelper.fromMapList(outputMap, "BsdConstraintMessageList");
  }
  public BsdConstraintMessageObjectData getBsdConstraintMessageObjectDataBsdConstraintMessageFromBsdConstraintMessageGet() {
    return BsdConstraintMessageObjectHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
  public BsdConstraintMessageObjectBaseKeyData getBsdConstraintMessageObjectBaseKeyDataBsdConstraintMessageFromBsdConstraintMessageSequenceGet() {
    return BsdConstraintMessageObjectBaseKeyHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
  public BsdConstraintMessageObjectBaseData getBsdConstraintMessageObjectBaseDataBsdConstraintMessageFromBsdConstraintMessageUpdate() {
    return BsdConstraintMessageObjectBaseHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
  /**
   @deprecated
   */
  public void setBsdConstraintMessageObjectFilter(BsdConstraintMessageObjectFilter data) {
    if (data != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectHelper.toMap(data, new HashMap()).get("BsdConstraintMessageObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdConstraintMessageObjectDataList getBsdConstraintMessageObjectDataList() {
    return BsdConstraintMessageObjectHelper.fromMapList(outputMap, "BsdConstraintMessageList");
  }
  /**
   @deprecated
   */
  public BsdConstraintMessageObjectData getBsdConstraintMessageObjectData() {
    return BsdConstraintMessageObjectHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
  /**
   @deprecated
   */
  public void setBsdConstraintMessageObjectBaseData(BsdConstraintMessageObjectBaseData data) {
    if (data != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseHelper.toMap(data, new HashMap()).get("BsdConstraintMessageObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdConstraintMessageObjectBaseKeyData(BsdConstraintMessageObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseKeyHelper.toMap(data, new HashMap()).get("BsdConstraintMessageObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BsdConstraintMessageObjectBaseKeyData getBsdConstraintMessageObjectBaseKeyData() {
    return BsdConstraintMessageObjectBaseKeyHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
  /**
   @deprecated
   */
  public BsdConstraintMessageObjectBaseData getBsdConstraintMessageObjectBaseData() {
    return BsdConstraintMessageObjectBaseHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
}
