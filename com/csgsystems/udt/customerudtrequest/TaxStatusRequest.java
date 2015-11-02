/*
 * Generated code DO NOT EDIT
 * Generated file: TaxStatusRequest.java
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
public final class TaxStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TaxStatusRequest (String request, TaxStatusRequestMethod method) {
    initialize(request, "TaxStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TaxStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTaxStatusForTaxStatusFind(TSObjectFilter data) {
    if (data != null) {
      addInput("TaxStatus", TSObjectHelper.toMap(data, new HashMap(), "TaxStatus").get("TaxStatus"));
    }
  }
  public void setTaxStatusForTaxStatusGet(TSObjectKeyData data) {
    if (data != null) {
      addInput("TaxStatus", TSObjectKeyHelper.toMap(data, new HashMap(), "TaxStatus").get("TaxStatus"));
    }
  }
  public TSObjectDataList getTSObjectDataTaxStatusFromTaxStatusFind() {
    return TSObjectHelper.fromMapList(outputMap, "TaxStatusList");
  }
  public TSObjectData getTSObjectDataTaxStatusFromTaxStatusGet() {
    return TSObjectHelper.fromMap(outputMap, "TaxStatus");
  }
  /**
   @deprecated
   */
  public void setTSObjectFilter(TSObjectFilter data) {
    if (data != null) {
      addInput("TS", TSObjectHelper.toMap(data, new HashMap()).get("TSObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTSObjectKeyData(TSObjectKeyData data) {
    if (data != null) {
      addInput("TaxStatus", TSObjectKeyHelper.toMap(data, new HashMap()).get("TSObject"));
    }
  }
  /**
   @deprecated
   */
  public TSObjectDataList getTSObjectDataList() {
    return TSObjectHelper.fromMapList(outputMap, "TSList");
  }
  /**
   @deprecated
   */
  public TSObjectData getTSObjectData() {
    return TSObjectHelper.fromMap(outputMap, "TaxStatus");
  }
}
