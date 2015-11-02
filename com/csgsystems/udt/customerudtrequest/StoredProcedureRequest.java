/*
 * Generated code DO NOT EDIT
 * Generated file: StoredProcedureRequest.java
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

import com.csgsystems.utl.data.*;
public final class StoredProcedureRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public StoredProcedureRequest (String request, StoredProcedureRequestMethod method) {
    initialize(request, "StoredProcedure", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (StoredProcedureRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setStoredProcedureCallForStoredProcedureCall(StoredProcedureObjectData data) {
    if (data != null) {
      addInput("StoredProcedureCall", StoredProcedureObjectHelper.toMap(data, new HashMap(), "StoredProcedureCall").get("StoredProcedureCall"));
    }
  }
  public Map[] getMapStoredProcedureResultFromStoredProcedureCall() {
    return (Map[])outputMap.get("StoredProcedureResult");
  }
  /**
   @deprecated
   */
  public void setStoredProcedureObjectData(StoredProcedureObjectData data) {
    if (data != null) {
      addInput("StoredProcedure", StoredProcedureObjectHelper.toMap(data, new HashMap()).get("StoredProcedureObject"));
    }
  }
  /**
   @deprecated
   */
  public Map getStoredProcedureResult() {
    return (Map)outputMap.get("StoredProcedureResult");
  }
}
