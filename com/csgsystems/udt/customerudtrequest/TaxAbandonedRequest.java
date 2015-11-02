/*
 * Generated code DO NOT EDIT
 * Generated file: TaxAbandonedRequest.java
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
public final class TaxAbandonedRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TaxAbandonedRequest (String request, TaxAbandonedRequestMethod method) {
    initialize(request, "TaxAbandoned", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TaxAbandonedRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTaxAbandonedForTaxAbandonedFind(TaxAbandonedObjectFilter data) {
    if (data != null) {
      addInput("TaxAbandoned", TaxAbandonedObjectHelper.toMap(data, new HashMap(), "TaxAbandoned").get("TaxAbandoned"));
    }
  }
  public void setTaxAbandonedForTaxAbandonedGet(TaxAbandonedObjectKeyData data) {
    if (data != null) {
      addInput("TaxAbandoned", TaxAbandonedObjectKeyHelper.toMap(data, new HashMap(), "TaxAbandoned").get("TaxAbandoned"));
    }
  }
  public TaxAbandonedObjectDataList getTaxAbandonedObjectDataTaxAbandonedFromTaxAbandonedFind() {
    return TaxAbandonedObjectHelper.fromMapList(outputMap, "TaxAbandonedList");
  }
  public TaxAbandonedObjectData getTaxAbandonedObjectDataTaxAbandonedFromTaxAbandonedGet() {
    return TaxAbandonedObjectHelper.fromMap(outputMap, "TaxAbandoned");
  }
  /**
   @deprecated
   */
  public void setTaxAbandonedObjectFilter(TaxAbandonedObjectFilter data) {
    if (data != null) {
      addInput("TaxAbandoned", TaxAbandonedObjectHelper.toMap(data, new HashMap()).get("TaxAbandonedObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTaxAbandonedObjectKeyData(TaxAbandonedObjectKeyData data) {
    if (data != null) {
      addInput("TaxAbandoned", TaxAbandonedObjectKeyHelper.toMap(data, new HashMap()).get("TaxAbandonedObject"));
    }
  }
  /**
   @deprecated
   */
  public TaxAbandonedObjectDataList getTaxAbandonedObjectDataList() {
    return TaxAbandonedObjectHelper.fromMapList(outputMap, "TaxAbandonedList");
  }
  /**
   @deprecated
   */
  public TaxAbandonedObjectData getTaxAbandonedObjectData() {
    return TaxAbandonedObjectHelper.fromMap(outputMap, "TaxAbandoned");
  }
}
