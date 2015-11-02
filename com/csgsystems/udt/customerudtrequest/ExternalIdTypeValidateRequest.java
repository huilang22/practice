/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdTypeValidateRequest.java
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
public final class ExternalIdTypeValidateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExternalIdTypeValidateRequest (String request, ExternalIdTypeValidateRequestMethod method) {
    initialize(request, "ExternalIdTypeValidate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExternalIdTypeValidateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExternalIdTypeValidateForExternalIdTypeValidateCreate(ExternalIdTypeObjectData data) {
    if (data != null) {
      addInput("ExternalIdTypeValidate", ExternalIdTypeObjectHelper.toMap(data, new HashMap(), "ExternalIdTypeValidate").get("ExternalIdTypeValidate"));
    }
  }
  public void setServiceInternalIdForExternalIdTypeValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForExternalIdTypeValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public ExternalIdTypeObjectData getExternalIdTypeObjectDataExternalIdTypeValidateFromExternalIdTypeValidateCreate() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdTypeValidate");
  }
  /**
   @deprecated
   */
  public void setExternalIdTypeObjectData(ExternalIdTypeObjectData data) {
    if (data != null) {
      addInput("ExternalIdTypeValidate", ExternalIdTypeObjectHelper.toMap(data, new HashMap()).get("ExternalIdTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public ExternalIdTypeObjectData getExternalIdTypeObjectData() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdTypeValidate");
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
