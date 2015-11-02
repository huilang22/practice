/*
 * Generated code DO NOT EDIT
 * Generated file: BsdBusinessUnitRequest.java
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
public final class BsdBusinessUnitRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdBusinessUnitRequest (String request, BsdBusinessUnitRequestMethod method) {
    initialize(request, "BsdBusinessUnit", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdBusinessUnitRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdBusinessUnitForBsdBusinessUnitCreate(BsdBusinessUnitObjectData data) {
    if (data != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(data, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }
  public void setBsdBusinessUnitForBsdBusinessUnitDelete(BsdBusinessUnitObjectKeyData data) {
    if (data != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectKeyHelper.toMap(data, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }
  public void setBsdBusinessUnitForBsdBusinessUnitFind(BsdBusinessUnitObjectFilter data) {
    if (data != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(data, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }
  public void setBsdBusinessUnitForBsdBusinessUnitGet(BsdBusinessUnitObjectKeyData data) {
    if (data != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectKeyHelper.toMap(data, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }
  public void setBsdBusinessUnitForBsdBusinessUnitUpdate(BsdBusinessUnitObjectData data) {
    if (data != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(data, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }
  public BsdBusinessUnitObjectData getBsdBusinessUnitObjectDataBsdBusinessUnitFromBsdBusinessUnitCreate() {
    return BsdBusinessUnitObjectHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
  public BsdBusinessUnitObjectData getBsdBusinessUnitObjectDataBsdBusinessUnitFromBsdBusinessUnitDelete() {
    return BsdBusinessUnitObjectHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
  public BsdBusinessUnitObjectDataList getBsdBusinessUnitObjectDataBsdBusinessUnitFromBsdBusinessUnitFind() {
    return BsdBusinessUnitObjectHelper.fromMapList(outputMap, "BsdBusinessUnitList");
  }
  public BsdBusinessUnitObjectData getBsdBusinessUnitObjectDataBsdBusinessUnitFromBsdBusinessUnitGet() {
    return BsdBusinessUnitObjectHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
  public BsdBusinessUnitObjectKeyData getBsdBusinessUnitObjectKeyDataBsdBusinessUnitFromBsdBusinessUnitSequenceGet() {
    return BsdBusinessUnitObjectKeyHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
  public BsdBusinessUnitObjectData getBsdBusinessUnitObjectDataBsdBusinessUnitFromBsdBusinessUnitUpdate() {
    return BsdBusinessUnitObjectHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
  /**
   @deprecated
   */
  public void setBsdBusinessUnitObjectFilter(BsdBusinessUnitObjectFilter data) {
    if (data != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(data, new HashMap()).get("BsdBusinessUnitObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdBusinessUnitObjectData(BsdBusinessUnitObjectData data) {
    if (data != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(data, new HashMap()).get("BsdBusinessUnitObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdBusinessUnitObjectKeyData(BsdBusinessUnitObjectKeyData data) {
    if (data != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectKeyHelper.toMap(data, new HashMap()).get("BsdBusinessUnitObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdBusinessUnitObjectDataList getBsdBusinessUnitObjectDataList() {
    return BsdBusinessUnitObjectHelper.fromMapList(outputMap, "BsdBusinessUnitList");
  }
  /**
   @deprecated
   */
  public BsdBusinessUnitObjectKeyData getBsdBusinessUnitObjectKeyData() {
    return BsdBusinessUnitObjectKeyHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
  /**
   @deprecated
   */
  public BsdBusinessUnitObjectData getBsdBusinessUnitObjectData() {
    return BsdBusinessUnitObjectHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
}
