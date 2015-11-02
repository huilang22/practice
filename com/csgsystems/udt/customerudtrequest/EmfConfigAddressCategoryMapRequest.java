/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigAddressCategoryMapRequest.java
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
public final class EmfConfigAddressCategoryMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EmfConfigAddressCategoryMapRequest (String request, EmfConfigAddressCategoryMapRequestMethod method) {
    initialize(request, "EmfConfigAddressCategoryMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EmfConfigAddressCategoryMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEmfConfigAddressCategoryMapForEmfConfigAddressCategoryMapCreate(EmfConfigAddressCategoryMapObjectData data) {
    if (data != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(data, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }
  public void setEmfConfigAddressCategoryMapForEmfConfigAddressCategoryMapDelete(EmfConfigAddressCategoryMapObjectData data) {
    if (data != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(data, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }
  public void setEmfConfigAddressCategoryMapForEmfConfigAddressCategoryMapFind(EmfConfigAddressCategoryMapObjectFilter data) {
    if (data != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(data, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }
  public void setEmfConfigAddressCategoryMapForEmfConfigAddressCategoryMapGet(EmfConfigAddressCategoryMapObjectKeyData data) {
    if (data != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectKeyHelper.toMap(data, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }
  public void setEmfConfigAddressCategoryMapForEmfConfigAddressCategoryMapUpdate(EmfConfigAddressCategoryMapObjectData data) {
    if (data != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(data, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }
  public EmfConfigAddressCategoryMapObjectData getEmfConfigAddressCategoryMapObjectDataEmfConfigAddressCategoryMapFromEmfConfigAddressCategoryMapCreate() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMap(outputMap, "EmfConfigAddressCategoryMap");
  }
  public EmfConfigAddressCategoryMapObjectDataList getEmfConfigAddressCategoryMapObjectDataEmfConfigAddressCategoryMapFromEmfConfigAddressCategoryMapFind() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMapList(outputMap, "EmfConfigAddressCategoryMapList");
  }
  public EmfConfigAddressCategoryMapObjectData getEmfConfigAddressCategoryMapObjectDataEmfConfigAddressCategoryMapFromEmfConfigAddressCategoryMapGet() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMap(outputMap, "EmfConfigAddressCategoryMap");
  }
  public EmfConfigAddressCategoryMapObjectData getEmfConfigAddressCategoryMapObjectDataEmfConfigAddressCategoryMapFromEmfConfigAddressCategoryMapUpdate() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMap(outputMap, "EmfConfigAddressCategoryMap");
  }
  /**
   @deprecated
   */
  public void setEmfConfigAddressCategoryMapObjectFilter(EmfConfigAddressCategoryMapObjectFilter data) {
    if (data != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(data, new HashMap()).get("EmfConfigAddressCategoryMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEmfConfigAddressCategoryMapObjectData(EmfConfigAddressCategoryMapObjectData data) {
    if (data != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(data, new HashMap()).get("EmfConfigAddressCategoryMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEmfConfigAddressCategoryMapObjectKeyData(EmfConfigAddressCategoryMapObjectKeyData data) {
    if (data != null) {
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectKeyHelper.toMap(data, new HashMap()).get("EmfConfigAddressCategoryMapObject"));
    }
  }
  /**
   @deprecated
   */
  public EmfConfigAddressCategoryMapObjectDataList getEmfConfigAddressCategoryMapObjectDataList() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMapList(outputMap, "EmfConfigAddressCategoryMapList");
  }
  /**
   @deprecated
   */
  public EmfConfigAddressCategoryMapObjectData getEmfConfigAddressCategoryMapObjectData() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMap(outputMap, "EmfConfigAddressCategoryMap");
  }
}
