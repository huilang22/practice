/*
 * Generated code DO NOT EDIT
 * Generated file: SpecialDestinationTypeRequest.java
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

import com.csgsystems.cf.data.*;
public final class SpecialDestinationTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SpecialDestinationTypeRequest (String request, SpecialDestinationTypeRequestMethod method) {
    initialize(request, "SpecialDestinationType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SpecialDestinationTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSpecialDestinationTypeForSpecialDestinationTypeCreate(SpecialDestinationTypeObjectData data) {
    if (data != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(data, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }
  public void setSpecialDestinationTypeForSpecialDestinationTypeFind(SpecialDestinationTypeObjectFilter data) {
    if (data != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(data, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }
  public void setSpecialDestinationTypeForSpecialDestinationTypeGet(SpecialDestinationTypeObjectKeyData data) {
    if (data != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectKeyHelper.toMap(data, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }
  public void setSpecialDestinationTypeForSpecialDestinationTypeUpdate(SpecialDestinationTypeObjectData data) {
    if (data != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(data, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }
  public SpecialDestinationTypeObjectData getSpecialDestinationTypeObjectDataSpecialDestinationTypeFromSpecialDestinationTypeCreate() {
    return SpecialDestinationTypeObjectHelper.fromMap(outputMap, "SpecialDestinationType");
  }
  public SpecialDestinationTypeObjectDataList getSpecialDestinationTypeObjectDataSpecialDestinationTypeFromSpecialDestinationTypeFind() {
    return SpecialDestinationTypeObjectHelper.fromMapList(outputMap, "SpecialDestinationTypeList");
  }
  public SpecialDestinationTypeObjectData getSpecialDestinationTypeObjectDataSpecialDestinationTypeFromSpecialDestinationTypeGet() {
    return SpecialDestinationTypeObjectHelper.fromMap(outputMap, "SpecialDestinationType");
  }
  public SpecialDestinationTypeObjectData getSpecialDestinationTypeObjectDataSpecialDestinationTypeFromSpecialDestinationTypeUpdate() {
    return SpecialDestinationTypeObjectHelper.fromMap(outputMap, "SpecialDestinationType");
  }
  /**
   @deprecated
   */
  public void setSpecialDestinationTypeObjectFilter(SpecialDestinationTypeObjectFilter data) {
    if (data != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(data, new HashMap()).get("SpecialDestinationTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSpecialDestinationTypeObjectData(SpecialDestinationTypeObjectData data) {
    if (data != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(data, new HashMap()).get("SpecialDestinationTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSpecialDestinationTypeObjectKeyData(SpecialDestinationTypeObjectKeyData data) {
    if (data != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectKeyHelper.toMap(data, new HashMap()).get("SpecialDestinationTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public SpecialDestinationTypeObjectDataList getSpecialDestinationTypeObjectDataList() {
    return SpecialDestinationTypeObjectHelper.fromMapList(outputMap, "SpecialDestinationTypeList");
  }
  /**
   @deprecated
   */
  public SpecialDestinationTypeObjectData getSpecialDestinationTypeObjectData() {
    return SpecialDestinationTypeObjectHelper.fromMap(outputMap, "SpecialDestinationType");
  }
}
