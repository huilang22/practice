/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeValidateRequest.java
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
import com.csgsystems.om.data.*;
public final class InvsTypeValidateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsTypeValidateRequest (String request, InvsTypeValidateRequestMethod method) {
    initialize(request, "InvsTypeValidate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsTypeValidateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsTypeValidateForInvsTypeValidateCreate(InvsTypeObjectData data) {
    if (data != null) {
      addInput("InvsTypeValidate", InvsTypeObjectHelper.toMap(data, new HashMap(), "InvsTypeValidate").get("InvsTypeValidate"));
    }
  }
  public void setServiceInternalIdForInvsTypeValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForInvsTypeValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public InvsTypeObjectData getInvsTypeObjectDataInvsTypeValidateFromInvsTypeValidateCreate() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsTypeValidate");
  }
  /**
   @deprecated
   */
  public void setInvsTypeObjectData(InvsTypeObjectData data) {
    if (data != null) {
      addInput("InvsTypeValidate", InvsTypeObjectHelper.toMap(data, new HashMap()).get("InvsTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsTypeObjectData getInvsTypeObjectData() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsTypeValidate");
  }
  /**
   @deprecated
   */
  public void setServiceInternalId(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceInternalIdResets(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
}
