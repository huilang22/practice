/*
 * Generated code DO NOT EDIT
 * Generated file: TaxAssignmentRequest.java
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
public final class TaxAssignmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TaxAssignmentRequest (String request, TaxAssignmentRequestMethod method) {
    initialize(request, "TaxAssignment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TaxAssignmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTaxAssignmentForTaxAssignmentFind(TaxAssignmentObjectFilter data) {
    if (data != null) {
      addInput("TaxAssignment", TaxAssignmentObjectHelper.toMap(data, new HashMap(), "TaxAssignment").get("TaxAssignment"));
    }
  }
  public void setTaxAssignmentForTaxAssignmentGet(TaxAssignmentObjectKeyData data) {
    if (data != null) {
      addInput("TaxAssignment", TaxAssignmentObjectKeyHelper.toMap(data, new HashMap(), "TaxAssignment").get("TaxAssignment"));
    }
  }
  public TaxAssignmentObjectDataList getTaxAssignmentObjectDataTaxAssignmentFromTaxAssignmentFind() {
    return TaxAssignmentObjectHelper.fromMapList(outputMap, "TaxAssignmentList");
  }
  public TaxAssignmentObjectData getTaxAssignmentObjectDataTaxAssignmentFromTaxAssignmentGet() {
    return TaxAssignmentObjectHelper.fromMap(outputMap, "TaxAssignment");
  }
  /**
   @deprecated
   */
  public void setTaxAssignmentObjectFilter(TaxAssignmentObjectFilter data) {
    if (data != null) {
      addInput("TaxAssignment", TaxAssignmentObjectHelper.toMap(data, new HashMap()).get("TaxAssignmentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTaxAssignmentObjectKeyData(TaxAssignmentObjectKeyData data) {
    if (data != null) {
      addInput("TaxAssignment", TaxAssignmentObjectKeyHelper.toMap(data, new HashMap()).get("TaxAssignmentObject"));
    }
  }
  /**
   @deprecated
   */
  public TaxAssignmentObjectDataList getTaxAssignmentObjectDataList() {
    return TaxAssignmentObjectHelper.fromMapList(outputMap, "TaxAssignmentList");
  }
  /**
   @deprecated
   */
  public TaxAssignmentObjectData getTaxAssignmentObjectData() {
    return TaxAssignmentObjectHelper.fromMap(outputMap, "TaxAssignment");
  }
}
