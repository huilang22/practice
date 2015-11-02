/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintDescriptionRequest.java
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
public final class BsdConstraintDescriptionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdConstraintDescriptionRequest (String request, BsdConstraintDescriptionRequestMethod method) {
    initialize(request, "BsdConstraintDescription", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdConstraintDescriptionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdConstraintDescriptionForBsdConstraintDescriptionCreate(BsdConstraintDescriptionObjectData data) {
    if (data != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(data, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }
  public void setBsdConstraintDescriptionForBsdConstraintDescriptionDelete(BsdConstraintDescriptionObjectKeyData data) {
    if (data != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectKeyHelper.toMap(data, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }
  public void setBsdConstraintDescriptionForBsdConstraintDescriptionFind(BsdConstraintDescriptionObjectFilter data) {
    if (data != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(data, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }
  public void setBsdConstraintDescriptionForBsdConstraintDescriptionGet(BsdConstraintDescriptionObjectKeyData data) {
    if (data != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectKeyHelper.toMap(data, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }
  public void setBsdConstraintDescriptionForBsdConstraintDescriptionUpdate(BsdConstraintDescriptionObjectData data) {
    if (data != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(data, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }
  public BsdConstraintDescriptionObjectData getBsdConstraintDescriptionObjectDataBsdConstraintDescriptionFromBsdConstraintDescriptionCreate() {
    return BsdConstraintDescriptionObjectHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
  public BsdConstraintDescriptionObjectData getBsdConstraintDescriptionObjectDataBsdConstraintDescriptionFromBsdConstraintDescriptionDelete() {
    return BsdConstraintDescriptionObjectHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
  public BsdConstraintDescriptionObjectDataList getBsdConstraintDescriptionObjectDataBsdConstraintDescriptionFromBsdConstraintDescriptionFind() {
    return BsdConstraintDescriptionObjectHelper.fromMapList(outputMap, "BsdConstraintDescriptionList");
  }
  public BsdConstraintDescriptionObjectData getBsdConstraintDescriptionObjectDataBsdConstraintDescriptionFromBsdConstraintDescriptionGet() {
    return BsdConstraintDescriptionObjectHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
  public BsdConstraintDescriptionObjectKeyData getBsdConstraintDescriptionObjectKeyDataBsdConstraintDescriptionFromBsdConstraintDescriptionSequenceGet() {
    return BsdConstraintDescriptionObjectKeyHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
  public BsdConstraintDescriptionObjectData getBsdConstraintDescriptionObjectDataBsdConstraintDescriptionFromBsdConstraintDescriptionUpdate() {
    return BsdConstraintDescriptionObjectHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
  /**
   @deprecated
   */
  public void setBsdConstraintDescriptionObjectFilter(BsdConstraintDescriptionObjectFilter data) {
    if (data != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(data, new HashMap()).get("BsdConstraintDescriptionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdConstraintDescriptionObjectData(BsdConstraintDescriptionObjectData data) {
    if (data != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(data, new HashMap()).get("BsdConstraintDescriptionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdConstraintDescriptionObjectKeyData(BsdConstraintDescriptionObjectKeyData data) {
    if (data != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectKeyHelper.toMap(data, new HashMap()).get("BsdConstraintDescriptionObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdConstraintDescriptionObjectDataList getBsdConstraintDescriptionObjectDataList() {
    return BsdConstraintDescriptionObjectHelper.fromMapList(outputMap, "BsdConstraintDescriptionList");
  }
  /**
   @deprecated
   */
  public BsdConstraintDescriptionObjectKeyData getBsdConstraintDescriptionObjectKeyData() {
    return BsdConstraintDescriptionObjectKeyHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
  /**
   @deprecated
   */
  public BsdConstraintDescriptionObjectData getBsdConstraintDescriptionObjectData() {
    return BsdConstraintDescriptionObjectHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
}
