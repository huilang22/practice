/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimVectorRequest.java
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
public final class InvSimVectorRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvSimVectorRequest (String request, InvSimVectorRequestMethod method) {
    initialize(request, "InvSimVector", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvSimVectorRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvSimVectorForInvSimVectorCreate(InvSimVectorObjData data) {
    if (data != null) {
      addInput("InvSimVector", InvSimVectorObjHelper.toMap(data, new HashMap(), "InvSimVector").get("InvSimVector"));
    }
  }
  public void setRequestSizeForInvSimVectorCreate(Integer data) {
    if (data != null) {
      addInput("RequestSize", data);
    }
  }
  public void setInvSimVectorForInvSimVectorDeleteHelper(InvSimVectorBaseData data) {
    if (data != null) {
      addInput("InvSimVector", InvSimVectorBaseHelper.toMap(data, new HashMap(), "InvSimVector").get("InvSimVector"));
    }
  }
  public void setInvSimVectorForInvSimVectorDelete(InvSimVectorBaseData data) {
    if (data != null) {
      addInput("InvSimVector", InvSimVectorBaseHelper.toMap(data, new HashMap(), "InvSimVector").get("InvSimVector"));
    }
  }
  public InvSimVectorCreateOutputData getInvSimVectorCreateOutputDataInvSimVectorCreateOutputDataFromInvSimVectorCreate() {
    return InvSimVectorCreateOutputHelper.fromMap(outputMap);
  }
  public Integer getIntegerReturnCodeFromInvSimVectorDeleteHelper() {
    return (Integer)outputMap.get("ReturnCode");
  }
  public InvSimVectorDeleteObjData getInvSimVectorDeleteObjDataInvSimVectorFromInvSimVectorDelete() {
    return InvSimVectorDeleteObjHelper.fromMap(outputMap, "InvSimVector");
  }
  /**
   @deprecated
   */
  public void setInvSimVectorBaseData(InvSimVectorBaseData data) {
    if (data != null) {
      addInput("InvSimVector", InvSimVectorBaseHelper.toMap(data, new HashMap()).get("InvSimVectorBase"));
    }
  }
  /**
   @deprecated
   */
  public InvSimVectorCreateOutputData getInvSimVectorCreateOutputData() {
    return InvSimVectorCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public InvSimVectorDeleteObjData getInvSimVectorDeleteObjData() {
    return InvSimVectorDeleteObjHelper.fromMap(outputMap, "InvSimVector");
  }
  /**
   @deprecated
   */
  public void setInvSimVectorObjData(InvSimVectorObjData data) {
    if (data != null) {
      addInput("InvSimVector", InvSimVectorObjHelper.toMap(data, new HashMap()).get("InvSimVectorObj"));
    }
  }
  /**
   @deprecated
   */
  public void setRequestSize(Integer data) {
    if (data != null) {
      addInput("RequestSize", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getReturnCode() {
    return (Integer)outputMap.get("ReturnCode");
  }
}
