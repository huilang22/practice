/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementPlusRequest.java
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
public final class InvElementPlusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvElementPlusRequest (String request, InvElementPlusRequestMethod method) {
    initialize(request, "InvElementPlus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvElementPlusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvElementPlusForInvElementPlusAutoCont(InvElementPlusObjFilter data) {
    if (data != null) {
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(data, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }
  public void setInvElementPlusForInvElementPlusAuto(InvElementPlusObjFilter data) {
    if (data != null) {
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(data, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }
  public void setInvElementPlusForInvElementPlusContFind(InvElementPlusObjData data) {
    if (data != null) {
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(data, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }
  public void setInvElementPlusForInvElementPlusGet(InvElementPlusObjKeyData data) {
    if (data != null) {
      addInput("InvElementPlus", InvElementPlusObjKeyHelper.toMap(data, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }
  public void setInvElementPlusForInvElementPlusIdFind(InvElementPlusObjData data) {
    if (data != null) {
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(data, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }
  public InvElementPlusObjDataList getInvElementPlusObjDataInvElementPlusFromInvElementPlusAutoCont() {
    return InvElementPlusObjHelper.fromMapList(outputMap, "InvElementPlusList");
  }
  public InvElementPlusObjDataList getInvElementPlusObjDataInvElementPlusFromInvElementPlusAuto() {
    return InvElementPlusObjHelper.fromMapList(outputMap, "InvElementPlusList");
  }
  public InvElementPlusObjDataList getInvElementPlusObjDataInvElementPlusFromInvElementPlusContFind() {
    return InvElementPlusObjHelper.fromMapList(outputMap, "InvElementPlusList");
  }
  public InvElementPlusObjData getInvElementPlusObjDataInvElementPlusFromInvElementPlusGet() {
    return InvElementPlusObjHelper.fromMap(outputMap, "InvElementPlus");
  }
  public InvElementPlusObjDataList getInvElementPlusObjDataInvElementPlusFromInvElementPlusIdFind() {
    return InvElementPlusObjHelper.fromMapList(outputMap, "InvElementPlusList");
  }
  /**
   @deprecated
   */
  public void setInvElementPlusObjFilter(InvElementPlusObjFilter data) {
    if (data != null) {
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(data, new HashMap()).get("InvElementPlusObj"));
    }
  }
  /**
   @deprecated
   */
  public void setInvElementPlusObjData(InvElementPlusObjData data) {
    if (data != null) {
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(data, new HashMap()).get("InvElementPlusObj"));
    }
  }
  /**
   @deprecated
   */
  public void setInvElementPlusObjKeyData(InvElementPlusObjKeyData data) {
    if (data != null) {
      addInput("InvElementPlus", InvElementPlusObjKeyHelper.toMap(data, new HashMap()).get("InvElementPlusObj"));
    }
  }
  /**
   @deprecated
   */
  public InvElementPlusObjDataList getInvElementPlusObjDataList() {
    return InvElementPlusObjHelper.fromMapList(outputMap, "InvElementPlusList");
  }
  /**
   @deprecated
   */
  public Map  getInvElementPlusObjExtendedData() {
    return InvElementPlusObjHelper.fromMap(outputMap, "InvElementPlus").extendedData;
  }
  
  /**
   @deprecated
   */
  public InvElementPlusObjData getInvElementPlusObjData() {
    return InvElementPlusObjHelper.fromMap(outputMap, "InvElementPlus");
  }
}
