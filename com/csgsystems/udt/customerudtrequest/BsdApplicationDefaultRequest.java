/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationDefaultRequest.java
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
public final class BsdApplicationDefaultRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdApplicationDefaultRequest (String request, BsdApplicationDefaultRequestMethod method) {
    initialize(request, "BsdApplicationDefault", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdApplicationDefaultRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdApplicationDefaultForBsdApplicationDefaultCreate(BsdApplicationDefaultObjectData data) {
    if (data != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectHelper.toMap(data, new HashMap(), "BsdApplicationDefault").get("BsdApplicationDefault"));
    }
  }
  public void setBsdApplicationDefaultForBsdApplicationDefaultDelete(BsdApplicationDefaultObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectKeyHelper.toMap(data, new HashMap(), "BsdApplicationDefault").get("BsdApplicationDefault"));
    }
  }
  public void setBsdApplicationDefaultForBsdApplicationDefaultFind(BsdApplicationDefaultObjectFilter data) {
    if (data != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectHelper.toMap(data, new HashMap(), "BsdApplicationDefault").get("BsdApplicationDefault"));
    }
  }
  public void setBsdApplicationDefaultForBsdApplicationDefaultGet(BsdApplicationDefaultObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectKeyHelper.toMap(data, new HashMap(), "BsdApplicationDefault").get("BsdApplicationDefault"));
    }
  }
  public BsdApplicationDefaultObjectData getBsdApplicationDefaultObjectDataBsdApplicationDefaultFromBsdApplicationDefaultCreate() {
    return BsdApplicationDefaultObjectHelper.fromMap(outputMap, "BsdApplicationDefault");
  }
  public BsdApplicationDefaultObjectData getBsdApplicationDefaultObjectDataBsdApplicationDefaultFromBsdApplicationDefaultDelete() {
    return BsdApplicationDefaultObjectHelper.fromMap(outputMap, "BsdApplicationDefault");
  }
  public BsdApplicationDefaultObjectDataList getBsdApplicationDefaultObjectDataBsdApplicationDefaultFromBsdApplicationDefaultFind() {
    return BsdApplicationDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationDefaultList");
  }
  public BsdApplicationDefaultObjectData getBsdApplicationDefaultObjectDataBsdApplicationDefaultFromBsdApplicationDefaultGet() {
    return BsdApplicationDefaultObjectHelper.fromMap(outputMap, "BsdApplicationDefault");
  }
  /**
   @deprecated
   */
  public void setBsdApplicationDefaultObjectFilter(BsdApplicationDefaultObjectFilter data) {
    if (data != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectHelper.toMap(data, new HashMap()).get("BsdApplicationDefaultObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdApplicationDefaultObjectData(BsdApplicationDefaultObjectData data) {
    if (data != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectHelper.toMap(data, new HashMap()).get("BsdApplicationDefaultObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdApplicationDefaultObjectKeyData(BsdApplicationDefaultObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectKeyHelper.toMap(data, new HashMap()).get("BsdApplicationDefaultObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdApplicationDefaultObjectDataList getBsdApplicationDefaultObjectDataList() {
    return BsdApplicationDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationDefaultList");
  }
  /**
   @deprecated
   */
  public BsdApplicationDefaultObjectData getBsdApplicationDefaultObjectData() {
    return BsdApplicationDefaultObjectHelper.fromMap(outputMap, "BsdApplicationDefault");
  }
}
