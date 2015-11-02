/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDistribPercentRequest.java
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

import com.csgsystems.bp.data.*;
public final class ChargeDistribPercentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ChargeDistribPercentRequest (String request, ChargeDistribPercentRequestMethod method) {
    initialize(request, "ChargeDistribPercent", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ChargeDistribPercentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setChargeDistribPercentForChargeDistribPercentCreate(ChargeDistribPercentObjectData data) {
    if (data != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(data, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }
  public void setChargeDistribPercentForChargeDistribPercentFind(ChargeDistribPercentObjectFilter data) {
    if (data != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(data, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }
  public void setChargeDistribPercentForChargeDistribPercentGet(ChargeDistribPercentObjectKeyData data) {
    if (data != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectKeyHelper.toMap(data, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }
  public void setChargeDistribPercentForChargeDistribPercentUpdate(ChargeDistribPercentObjectData data) {
    if (data != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(data, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }
  public ChargeDistribPercentObjectData getChargeDistribPercentObjectDataChargeDistribPercentFromChargeDistribPercentCreate() {
    return ChargeDistribPercentObjectHelper.fromMap(outputMap, "ChargeDistribPercent");
  }
  public ChargeDistribPercentObjectDataList getChargeDistribPercentObjectDataChargeDistribPercentFromChargeDistribPercentFind() {
    return ChargeDistribPercentObjectHelper.fromMapList(outputMap, "ChargeDistribPercentList");
  }
  public ChargeDistribPercentObjectData getChargeDistribPercentObjectDataChargeDistribPercentFromChargeDistribPercentGet() {
    return ChargeDistribPercentObjectHelper.fromMap(outputMap, "ChargeDistribPercent");
  }
  public ChargeDistribPercentObjectData getChargeDistribPercentObjectDataChargeDistribPercentFromChargeDistribPercentUpdate() {
    return ChargeDistribPercentObjectHelper.fromMap(outputMap, "ChargeDistribPercent");
  }
  /**
   @deprecated
   */
  public void setChargeDistribPercentObjectFilter(ChargeDistribPercentObjectFilter data) {
    if (data != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(data, new HashMap()).get("ChargeDistribPercentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setChargeDistribPercentObjectData(ChargeDistribPercentObjectData data) {
    if (data != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(data, new HashMap()).get("ChargeDistribPercentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setChargeDistribPercentObjectKeyData(ChargeDistribPercentObjectKeyData data) {
    if (data != null) {
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectKeyHelper.toMap(data, new HashMap()).get("ChargeDistribPercentObject"));
    }
  }
  /**
   @deprecated
   */
  public ChargeDistribPercentObjectDataList getChargeDistribPercentObjectDataList() {
    return ChargeDistribPercentObjectHelper.fromMapList(outputMap, "ChargeDistribPercentList");
  }
  /**
   @deprecated
   */
  public ChargeDistribPercentObjectData getChargeDistribPercentObjectData() {
    return ChargeDistribPercentObjectHelper.fromMap(outputMap, "ChargeDistribPercent");
  }
}
