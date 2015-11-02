/*
 * Generated code DO NOT EDIT
 * Generated file: PpvServiceRequest.java
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

import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;
public final class PpvServiceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PpvServiceRequest (String request, PpvServiceRequestMethod method) {
    initialize(request, "PpvService", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PpvServiceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountInternalIdForPpvServiceFind(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setPpvServiceForPpvServiceFind(PpvServiceObjectFilter data) {
    if (data != null) {
      addInput("PpvService", PpvServiceObjectHelper.toMap(data, new HashMap(), "PpvService").get("PpvService"));
    }
  }
  public PpvServiceObjectDataList getPpvServiceObjectDataPpvServiceFromPpvServiceFind() {
    return PpvServiceObjectHelper.fromMapList(outputMap, "PpvServiceList");
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setPpvServiceObjectFilter(PpvServiceObjectFilter data) {
    if (data != null) {
      addInput("PpvService", PpvServiceObjectHelper.toMap(data, new HashMap()).get("PpvServiceObject"));
    }
  }
  /**
   @deprecated
   */
  public PpvServiceObjectDataList getPpvServiceObjectDataList() {
    return PpvServiceObjectHelper.fromMapList(outputMap, "PpvServiceList");
  }
}
