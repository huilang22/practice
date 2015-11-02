/*
 * Generated code DO NOT EDIT
 * Generated file: ServInventoryTypeRequest.java
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

import com.csgsystems.cf.data.*;
import com.csgsystems.svbl.data.*;
public final class ServInventoryTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServInventoryTypeRequest (String request, ServInventoryTypeRequestMethod method) {
    initialize(request, "ServInventoryType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServInventoryTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdInForServInventoryTypeFind(BigInteger data) {
    if (data != null) {
      addInput("AddressIdIn", data);
    }
  }
  public InvsTypeObjectDataList getInvsTypeObjectDataInvsTypeFromServInventoryTypeFind() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
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
  public InvsTypeObjectDataList getInvsTypeObjectDataList() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
}
