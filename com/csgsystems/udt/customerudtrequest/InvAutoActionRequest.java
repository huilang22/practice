/*
 * Generated code DO NOT EDIT
 * Generated file: InvAutoActionRequest.java
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
public final class InvAutoActionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvAutoActionRequest (String request, InvAutoActionRequestMethod method) {
    initialize(request, "InvAutoAction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvAutoActionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvAutoActionForInvAutoActionContigSelectNums(InvAutoActionSelectNumsObjData data) {
    if (data != null) {
      addInput("InvAutoAction", InvAutoActionSelectNumsObjHelper.toMap(data, new HashMap(), "InvAutoAction").get("InvAutoAction"));
    }
  }
  public void setInvAutoActionForInvAutoActionDel(InvAutoActionObjFilter data) {
    if (data != null) {
      addInput("InvAutoAction", InvAutoActionObjHelper.toMap(data, new HashMap(), "InvAutoAction").get("InvAutoAction"));
    }
  }
  public void setInvAutoActionForInvAutoActionFind(InvAutoActionObjData data) {
    if (data != null) {
      addInput("InvAutoAction", InvAutoActionObjHelper.toMap(data, new HashMap(), "InvAutoAction").get("InvAutoAction"));
    }
  }
  public void setInvAutoActionForInvAutoActionSelectNums(InvAutoActionSelectNumsObjData data) {
    if (data != null) {
      addInput("InvAutoAction", InvAutoActionSelectNumsObjHelper.toMap(data, new HashMap(), "InvAutoAction").get("InvAutoAction"));
    }
  }
  public InvAutoActionContigSelectNumsOutputData getInvAutoActionContigSelectNumsOutputDataInvAutoActionContigSelectNumsOutputDataFromInvAutoActionContigSelectNums() {
    return InvAutoActionContigSelectNumsOutputHelper.fromMap(outputMap);
  }
  public InvAutoActionObjDataList getInvAutoActionObjDataInvAutoActionFromInvAutoActionFind() {
    return InvAutoActionObjHelper.fromMapList(outputMap, "InvAutoActionList");
  }
  public InvAutoActionSelectNumsOutputData getInvAutoActionSelectNumsOutputDataInvAutoActionSelectNumsOutputDataFromInvAutoActionSelectNums() {
    return InvAutoActionSelectNumsOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public InvAutoActionContigSelectNumsOutputData getInvAutoActionContigSelectNumsOutputData() {
    return InvAutoActionContigSelectNumsOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setInvAutoActionObjFilter(InvAutoActionObjFilter data) {
    if (data != null) {
      addInput("InvAutoAction", InvAutoActionObjHelper.toMap(data, new HashMap()).get("InvAutoActionObj"));
    }
  }
  /**
   @deprecated
   */
  public void setInvAutoActionObjData(InvAutoActionObjData data) {
    if (data != null) {
      addInput("InvAutoAction", InvAutoActionObjHelper.toMap(data, new HashMap()).get("InvAutoActionObj"));
    }
  }
  /**
   @deprecated
   */
  public InvAutoActionObjDataList getInvAutoActionObjDataList() {
    return InvAutoActionObjHelper.fromMapList(outputMap, "InvAutoActionList");
  }
  /**
   @deprecated
   */
  public InvAutoActionSelectNumsOutputData getInvAutoActionSelectNumsOutputData() {
    return InvAutoActionSelectNumsOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setInvAutoActionSelectNumsObjData(InvAutoActionSelectNumsObjData data) {
    if (data != null) {
      addInput("InvAutoAction", InvAutoActionSelectNumsObjHelper.toMap(data, new HashMap()).get("InvAutoActionSelectNumsObj"));
    }
  }
}
