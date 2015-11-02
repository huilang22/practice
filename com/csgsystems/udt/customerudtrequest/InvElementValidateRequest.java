/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementValidateRequest.java
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

import com.csgsystems.om.data.*;
public final class InvElementValidateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvElementValidateRequest (String request, InvElementValidateRequestMethod method) {
    initialize(request, "InvElementValidate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvElementValidateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvElementValidateForInvElementValidateSwapValidate(InvElementValidateObjectData data) {
    if (data != null) {
      addInput("InvElementValidate", InvElementValidateObjectHelper.toMap(data, new HashMap(), "InvElementValidate").get("InvElementValidate"));
    }
  }
  public void setInvElementValidateForInvElementValidateUnAssignValidate(InvElementValidateObjectData data) {
    if (data != null) {
      addInput("InvElementValidate", InvElementValidateObjectHelper.toMap(data, new HashMap(), "InvElementValidate").get("InvElementValidate"));
    }
  }
  public InvElementValidateObjectData getInvElementValidateObjectDataInvElementValidateFromInvElementValidateSwapValidate() {
    return InvElementValidateObjectHelper.fromMap(outputMap, "InvElementValidate");
  }
  public InvElementValidateObjectData getInvElementValidateObjectDataInvElementValidateFromInvElementValidateUnAssignValidate() {
    return InvElementValidateObjectHelper.fromMap(outputMap, "InvElementValidate");
  }
  /**
   @deprecated
   */
  public void setInvElementValidateObjectData(InvElementValidateObjectData data) {
    if (data != null) {
      addInput("InvElementValidate", InvElementValidateObjectHelper.toMap(data, new HashMap()).get("InvElementValidateObject"));
    }
  }
  /**
   @deprecated
   */
  public InvElementValidateObjectData getInvElementValidateObjectData() {
    return InvElementValidateObjectHelper.fromMap(outputMap, "InvElementValidate");
  }
}
