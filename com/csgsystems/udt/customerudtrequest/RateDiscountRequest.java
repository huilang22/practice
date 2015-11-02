/*
 * Generated code DO NOT EDIT
 * Generated file: RateDiscountRequest.java
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
public final class RateDiscountRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateDiscountRequest (String request, RateDiscountRequestMethod method) {
    initialize(request, "RateDiscount", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateDiscountRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateDiscountForRateDiscountCreate(RateDiscountObjectData data) {
    if (data != null) {
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(data, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }
  public void setRateDiscountForRateDiscountDelete(RateDiscountObjectKeyData data) {
    if (data != null) {
      addInput("RateDiscount", RateDiscountObjectKeyHelper.toMap(data, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }
  public void setRateDiscountForRateDiscountFind(RateDiscountObjectFilter data) {
    if (data != null) {
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(data, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }
  public void setRateDiscountForRateDiscountGet(RateDiscountObjectKeyData data) {
    if (data != null) {
      addInput("RateDiscount", RateDiscountObjectKeyHelper.toMap(data, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }
  public void setRateDiscountForRateDiscountUpdate(RateDiscountObjectData data) {
    if (data != null) {
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(data, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }
  public void setRdUpdateFilterForRateDiscountUpdate(RateDiscountObjectFilter data) {
    if (data != null) {
      addInput("RdUpdateFilter", RateDiscountObjectHelper.toMap(data, new HashMap(), "RdUpdateFilter").get("RdUpdateFilter"));
    }
  }
  public void setRdUpdateGetForRateDiscountUpdate(RateDiscountObjectData data) {
    if (data != null) {
      addInput("RdUpdateGet", RateDiscountObjectHelper.toMap(data, new HashMap(), "RdUpdateGet").get("RdUpdateGet"));
    }
  }
  public RateDiscountObjectData getRateDiscountObjectDataRateDiscountFromRateDiscountCreate() {
    return RateDiscountObjectHelper.fromMap(outputMap, "RateDiscount");
  }
  public RateDiscountObjectDataList getRateDiscountObjectDataRateDiscountFromRateDiscountFind() {
    return RateDiscountObjectHelper.fromMapList(outputMap, "RateDiscountList");
  }
  public RateDiscountObjectData getRateDiscountObjectDataRateDiscountFromRateDiscountGet() {
    return RateDiscountObjectHelper.fromMap(outputMap, "RateDiscount");
  }
  public RateDiscountObjectData getRateDiscountObjectDataRateDiscountFromRateDiscountUpdate() {
    return RateDiscountObjectHelper.fromMap(outputMap, "RateDiscount");
  }
  /**
   @deprecated
   */
  public void setRateDiscountObjectFilter(RateDiscountObjectFilter data) {
    if (data != null) {
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(data, new HashMap()).get("RateDiscountObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateDiscountObjectData(RateDiscountObjectData data) {
    if (data != null) {
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(data, new HashMap()).get("RateDiscountObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateDiscountObjectKeyData(RateDiscountObjectKeyData data) {
    if (data != null) {
      addInput("RateDiscount", RateDiscountObjectKeyHelper.toMap(data, new HashMap()).get("RateDiscountObject"));
    }
  }
  /**
   @deprecated
   */
  public RateDiscountObjectDataList getRateDiscountObjectDataList() {
    return RateDiscountObjectHelper.fromMapList(outputMap, "RateDiscountList");
  }
  /**
   @deprecated
   */
  public RateDiscountObjectData getRateDiscountObjectData() {
    return RateDiscountObjectHelper.fromMap(outputMap, "RateDiscount");
  }
}
