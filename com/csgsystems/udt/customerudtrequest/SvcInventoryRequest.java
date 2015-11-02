/*
 * Generated code DO NOT EDIT
 * Generated file: SvcInventoryRequest.java
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

import com.csgsystems.iv.data.*;
public final class SvcInventoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SvcInventoryRequest (String request, SvcInventoryRequestMethod method) {
    initialize(request, "SvcInventory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SvcInventoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSvcInventoryForSvcInvElementFind(SvcInvElementObjectFilter data) {
    if (data != null) {
      addInput("SvcInventory", SvcInvElementObjectHelper.toMap(data, new HashMap(), "SvcInventory").get("SvcInventory"));
    }
  }
  public SvcInvElementObjectDataList getSvcInvElementObjectDataSvcInventoryFromSvcInvElementFind() {
    return SvcInvElementObjectHelper.fromMapList(outputMap, "SvcInventoryList");
  }
  /**
   @deprecated
   */
  public void setSvcInvElementObjectFilter(SvcInvElementObjectFilter data) {
    if (data != null) {
      addInput("SvcInvElement", SvcInvElementObjectHelper.toMap(data, new HashMap()).get("SvcInvElementObject"));
    }
  }
  /**
   @deprecated
   */
  public SvcInvElementObjectDataList getSvcInvElementObjectDataList() {
    return SvcInvElementObjectHelper.fromMapList(outputMap, "SvcInvElementList");
  }
}
