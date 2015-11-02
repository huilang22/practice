/*
 * Generated code DO NOT EDIT
 * Generated file: CountryCodeRequest.java
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
public final class CountryCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CountryCodeRequest (String request, CountryCodeRequestMethod method) {
    initialize(request, "CountryCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CountryCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCountryCodeForCountryCodeCreate(CountryCodeObjectData data) {
    if (data != null) {
      addInput("CountryCode", CountryCodeObjectHelper.toMap(data, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }
  public void setCountryCodeForCountryCodeDelete(CountryCodeObjectKeyData data) {
    if (data != null) {
      addInput("CountryCode", CountryCodeObjectKeyHelper.toMap(data, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }
  public void setCountryCodeForCountryCodeFind(CountryCodeObjectFilter data) {
    if (data != null) {
      addInput("CountryCode", CountryCodeObjectHelper.toMap(data, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }
  public void setCountryCodeForCountryCodeGet(CountryCodeObjectKeyData data) {
    if (data != null) {
      addInput("CountryCode", CountryCodeObjectKeyHelper.toMap(data, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }
  public void setCountryCodeForCountryCodeUpdate(CountryCodeObjectData data) {
    if (data != null) {
      addInput("CountryCode", CountryCodeObjectHelper.toMap(data, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }
  public CountryCodeObjectData getCountryCodeObjectDataCountryCodeFromCountryCodeCreate() {
    return CountryCodeObjectHelper.fromMap(outputMap, "CountryCode");
  }
  public CountryCodeObjectData getCountryCodeObjectDataCountryCodeFromCountryCodeDelete() {
    return CountryCodeObjectHelper.fromMap(outputMap, "CountryCode");
  }
  public CountryCodeObjectDataList getCountryCodeObjectDataCountryCodeFromCountryCodeFind() {
    return CountryCodeObjectHelper.fromMapList(outputMap, "CountryCodeList");
  }
  public CountryCodeObjectData getCountryCodeObjectDataCountryCodeFromCountryCodeGet() {
    return CountryCodeObjectHelper.fromMap(outputMap, "CountryCode");
  }
  public CountryCodeObjectData getCountryCodeObjectDataCountryCodeFromCountryCodeUpdate() {
    return CountryCodeObjectHelper.fromMap(outputMap, "CountryCode");
  }
  /**
   @deprecated
   */
  public void setCountryCodeObjectFilter(CountryCodeObjectFilter data) {
    if (data != null) {
      addInput("CountryCode", CountryCodeObjectHelper.toMap(data, new HashMap()).get("CountryCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCountryCodeObjectData(CountryCodeObjectData data) {
    if (data != null) {
      addInput("CountryCode", CountryCodeObjectHelper.toMap(data, new HashMap()).get("CountryCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCountryCodeObjectKeyData(CountryCodeObjectKeyData data) {
    if (data != null) {
      addInput("CountryCode", CountryCodeObjectKeyHelper.toMap(data, new HashMap()).get("CountryCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public CountryCodeObjectDataList getCountryCodeObjectDataList() {
    return CountryCodeObjectHelper.fromMapList(outputMap, "CountryCodeList");
  }
  /**
   @deprecated
   */
  public CountryCodeObjectData getCountryCodeObjectData() {
    return CountryCodeObjectHelper.fromMap(outputMap, "CountryCode");
  }
}
