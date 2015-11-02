/*
 * Generated code DO NOT EDIT
 * Generated file: ServInvElementRequest.java
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
import com.csgsystems.svbl.data.*;
public final class ServInvElementRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServInvElementRequest (String request, ServInvElementRequestMethod method) {
    initialize(request, "ServInvElement", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServInvElementRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdInForServInvElementFind(BigInteger data) {
    if (data != null) {
      addInput("AddressIdIn", data);
    }
  }
  public void setServInvElementForServInvElementFind(InvElementObjData data) {
    if (data != null) {
      addInput("ServInvElement", InvElementObjHelper.toMap(data, new HashMap(), "ServInvElement").get("ServInvElement"));
    }
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromServInvElementFind() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  /**
   @deprecated
   */
  public void setAddressIdIn(BigInteger data) {
    if (data != null) {
      addInput("AddressIdIn", data);
    }
  }
  /**
   @deprecated
   */
  public void setInvElementObjData(InvElementObjData data) {
    if (data != null) {
      addInput("ServInvElement", InvElementObjHelper.toMap(data, new HashMap()).get("InvElementObj"));
    }
  }
  /**
   @deprecated
   */
  public InvElementObjDataList getInvElementObjDataList() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementObjList");
  }
}
