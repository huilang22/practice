/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectAttributeRequest.java
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
public final class BsdObjectAttributeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdObjectAttributeRequest (String request, BsdObjectAttributeRequestMethod method) {
    initialize(request, "BsdObjectAttribute", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdObjectAttributeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdObjectAttributeForBsdObjectAttributeCreate(BsdObjectAttributeObjectBaseData data) {
    if (data != null) {
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseHelper.toMap(data, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }
  public void setBsdObjectAttributeForBsdObjectAttributeDelete(BsdObjectAttributeObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }
  public void setBsdObjectAttributeForBsdObjectAttributeFind(BsdObjectAttributeObjectFilter data) {
    if (data != null) {
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectHelper.toMap(data, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }
  public void setBsdObjectAttributeForBsdObjectAttributeGet(BsdObjectAttributeObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }
  public BsdObjectAttributeObjectBaseData getBsdObjectAttributeObjectBaseDataBsdObjectAttributeFromBsdObjectAttributeCreate() {
    return BsdObjectAttributeObjectBaseHelper.fromMap(outputMap, "BsdObjectAttribute");
  }
  public BsdObjectAttributeObjectBaseData getBsdObjectAttributeObjectBaseDataBsdObjectAttributeFromBsdObjectAttributeDelete() {
    return BsdObjectAttributeObjectBaseHelper.fromMap(outputMap, "BsdObjectAttribute");
  }
  public BsdObjectAttributeObjectDataList getBsdObjectAttributeObjectDataBsdObjectAttributeFromBsdObjectAttributeFind() {
    return BsdObjectAttributeObjectHelper.fromMapList(outputMap, "BsdObjectAttributeList");
  }
  public BsdObjectAttributeObjectData getBsdObjectAttributeObjectDataBsdObjectAttributeFromBsdObjectAttributeGet() {
    return BsdObjectAttributeObjectHelper.fromMap(outputMap, "BsdObjectAttribute");
  }
  /**
   @deprecated
   */
  public void setBsdObjectAttributeObjectFilter(BsdObjectAttributeObjectFilter data) {
    if (data != null) {
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectHelper.toMap(data, new HashMap()).get("BsdObjectAttributeObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdObjectAttributeObjectDataList getBsdObjectAttributeObjectDataList() {
    return BsdObjectAttributeObjectHelper.fromMapList(outputMap, "BsdObjectAttributeList");
  }
  /**
   @deprecated
   */
  public BsdObjectAttributeObjectData getBsdObjectAttributeObjectData() {
    return BsdObjectAttributeObjectHelper.fromMap(outputMap, "Bsd");
  }
  /**
   @deprecated
   */
  public void setBsdObjectAttributeObjectBaseData(BsdObjectAttributeObjectBaseData data) {
    if (data != null) {
      addInput("Bsd", BsdObjectAttributeObjectBaseHelper.toMap(data, new HashMap()).get("BsdObjectAttributeObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdObjectAttributeObjectBaseKeyData(BsdObjectAttributeObjectBaseKeyData data) {
    if (data != null) {
      addInput("Bsd", BsdObjectAttributeObjectBaseKeyHelper.toMap(data, new HashMap()).get("BsdObjectAttributeObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BsdObjectAttributeObjectBaseData getBsdObjectAttributeObjectBaseData() {
    return BsdObjectAttributeObjectBaseHelper.fromMap(outputMap, "Bsd");
  }
}
