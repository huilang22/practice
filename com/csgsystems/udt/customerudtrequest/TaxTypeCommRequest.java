/*
 * Generated code DO NOT EDIT
 * Generated file: TaxTypeCommRequest.java
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
public final class TaxTypeCommRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TaxTypeCommRequest (String request, TaxTypeCommRequestMethod method) {
    initialize(request, "TaxTypeComm", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TaxTypeCommRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTaxTypeCommForTaxTypeCommFind(TTCObjectFilter data) {
    if (data != null) {
      addInput("TaxTypeComm", TTCObjectHelper.toMap(data, new HashMap(), "TaxTypeComm").get("TaxTypeComm"));
    }
  }
  public void setTaxTypeCommForTaxTypeCommGet(TTCObjectKeyData data) {
    if (data != null) {
      addInput("TaxTypeComm", TTCObjectKeyHelper.toMap(data, new HashMap(), "TaxTypeComm").get("TaxTypeComm"));
    }
  }
  public TTCObjectDataList getTTCObjectDataTaxTypeCommFromTaxTypeCommFind() {
    return TTCObjectHelper.fromMapList(outputMap, "TaxTypeCommList");
  }
  public TTCObjectData getTTCObjectDataTaxTypeCommFromTaxTypeCommGet() {
    return TTCObjectHelper.fromMap(outputMap, "TaxTypeComm");
  }
  /**
   @deprecated
   */
  public void setTTCObjectFilter(TTCObjectFilter data) {
    if (data != null) {
      addInput("TTC", TTCObjectHelper.toMap(data, new HashMap()).get("TTCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTTCObjectKeyData(TTCObjectKeyData data) {
    if (data != null) {
      addInput("TaxTypeComm", TTCObjectKeyHelper.toMap(data, new HashMap()).get("TTCObject"));
    }
  }
  /**
   @deprecated
   */
  public TTCObjectDataList getTTCObjectDataList() {
    return TTCObjectHelper.fromMapList(outputMap, "TTCList");
  }
  /**
   @deprecated
   */
  public TTCObjectData getTTCObjectData() {
    return TTCObjectHelper.fromMap(outputMap, "TaxTypeComm");
  }
}
