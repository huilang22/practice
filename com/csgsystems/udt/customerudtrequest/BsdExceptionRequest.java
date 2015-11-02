/*
 * Generated code DO NOT EDIT
 * Generated file: BsdExceptionRequest.java
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

import com.csgsystems.sfq.data.*;
public final class BsdExceptionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdExceptionRequest (String request, BsdExceptionRequestMethod method) {
    initialize(request, "BsdException", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdExceptionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdExceptionForBsdExceptionCreate(BsdExceptionObjectData data) {
    if (data != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(data, new HashMap(), "BsdException").get("BsdException"));
    }
  }
  public void setBsdExceptionForBsdExceptionDelete(BsdExceptionObjectData data) {
    if (data != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(data, new HashMap(), "BsdException").get("BsdException"));
    }
  }
  public void setBsdExceptionForBsdExceptionFind(BsdExceptionObjectFilter data) {
    if (data != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(data, new HashMap(), "BsdException").get("BsdException"));
    }
  }
  public void setBsdExceptionForBsdExceptionFindInternal(BsdExceptionObjectFilter data) {
    if (data != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(data, new HashMap(), "BsdException").get("BsdException"));
    }
  }
  public void setBsdExceptionForBsdExceptionGet(BsdExceptionObjectKeyData data) {
    if (data != null) {
      addInput("BsdException", BsdExceptionObjectKeyHelper.toMap(data, new HashMap(), "BsdException").get("BsdException"));
    }
  }
  public void setBsdExceptionForBsdExceptionGetInternal(BsdExceptionObjectKeyData data) {
    if (data != null) {
      addInput("BsdException", BsdExceptionObjectKeyHelper.toMap(data, new HashMap(), "BsdException").get("BsdException"));
    }
  }
  public void setBsdExceptionForBsdExceptionUpdate(BsdExceptionObjectData data) {
    if (data != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(data, new HashMap(), "BsdException").get("BsdException"));
    }
  }
  public BsdExceptionObjectData getBsdExceptionObjectDataBsdExceptionFromBsdExceptionCreate() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
  public BsdExceptionObjectData getBsdExceptionObjectDataBsdExceptionFromBsdExceptionDelete() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
  public BsdExceptionObjectDataList getBsdExceptionObjectDataBsdExceptionFromBsdExceptionFind() {
    return BsdExceptionObjectHelper.fromMapList(outputMap, "BsdExceptionList");
  }
  public BsdExceptionObjectDataList getBsdExceptionObjectDataBsdExceptionFromBsdExceptionFindInternal() {
    return BsdExceptionObjectHelper.fromMapList(outputMap, "BsdExceptionList");
  }
  public BsdExceptionObjectData getBsdExceptionObjectDataBsdExceptionFromBsdExceptionGet() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
  public BsdExceptionObjectData getBsdExceptionObjectDataBsdExceptionFromBsdExceptionGetInternal() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
  public BsdExceptionObjectData getBsdExceptionObjectDataBsdExceptionFromBsdExceptionUpdate() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
  /**
   @deprecated
   */
  public void setBsdExceptionObjectFilter(BsdExceptionObjectFilter data) {
    if (data != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(data, new HashMap()).get("BsdExceptionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdExceptionObjectData(BsdExceptionObjectData data) {
    if (data != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(data, new HashMap()).get("BsdExceptionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdExceptionObjectKeyData(BsdExceptionObjectKeyData data) {
    if (data != null) {
      addInput("BsdException", BsdExceptionObjectKeyHelper.toMap(data, new HashMap()).get("BsdExceptionObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdExceptionObjectDataList getBsdExceptionObjectDataList() {
    return BsdExceptionObjectHelper.fromMapList(outputMap, "BsdExceptionList");
  }
  /**
   @deprecated
   */
  public BsdExceptionObjectData getBsdExceptionObjectData() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
}
