/*
 * Generated code DO NOT EDIT
 * Generated file: PpvOutletRequest.java
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

import com.csgsystems.ppv.data.*;
public final class PpvOutletRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PpvOutletRequest (String request, PpvOutletRequestMethod method) {
    initialize(request, "PpvOutlet", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PpvOutletRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPpvOutletForPpvOutletFind(PpvOutletObjectFilter data) {
    if (data != null) {
      addInput("PpvOutlet", PpvOutletObjectHelper.toMap(data, new HashMap(), "PpvOutlet").get("PpvOutlet"));
    }
  }
  public PpvOutletObjectDataList getPpvOutletObjectDataPpvOutletFromPpvOutletFind() {
    return PpvOutletObjectHelper.fromMapList(outputMap, "PpvOutletList");
  }
  /**
   @deprecated
   */
  public void setPpvOutletObjectFilter(PpvOutletObjectFilter data) {
    if (data != null) {
      addInput("PpvOutlet", PpvOutletObjectHelper.toMap(data, new HashMap()).get("PpvOutletObject"));
    }
  }
  /**
   @deprecated
   */
  public PpvOutletObjectDataList getPpvOutletObjectDataList() {
    return PpvOutletObjectHelper.fromMapList(outputMap, "PpvOutletList");
  }
}
