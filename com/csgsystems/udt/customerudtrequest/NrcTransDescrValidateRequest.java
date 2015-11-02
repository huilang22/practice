/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrValidateRequest.java
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
public final class NrcTransDescrValidateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NrcTransDescrValidateRequest (String request, NrcTransDescrValidateRequestMethod method) {
    initialize(request, "NrcTransDescrValidate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NrcTransDescrValidateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNrcTransDescrValidateForNrcTransDescrValidateCreate(NrcTransDescrObjectData data) {
    if (data != null) {
      addInput("NrcTransDescrValidate", NrcTransDescrObjectHelper.toMap(data, new HashMap(), "NrcTransDescrValidate").get("NrcTransDescrValidate"));
    }
  }
  public void setServiceInternalIdForNrcTransDescrValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForNrcTransDescrValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public NrcTransDescrObjectData getNrcTransDescrObjectDataNrcTransDescrValidateFromNrcTransDescrValidateCreate() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescrValidate");
  }
  /**
   @deprecated
   */
  public void setNrcTransDescrObjectData(NrcTransDescrObjectData data) {
    if (data != null) {
      addInput("NrcTransDescrValidate", NrcTransDescrObjectHelper.toMap(data, new HashMap()).get("NrcTransDescrObject"));
    }
  }
  /**
   @deprecated
   */
  public NrcTransDescrObjectData getNrcTransDescrObjectData() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescrValidate");
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
