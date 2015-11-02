/*
 * Generated code DO NOT EDIT
 * Generated file: ContractTypeValidateRequest.java
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
public final class ContractTypeValidateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ContractTypeValidateRequest (String request, ContractTypeValidateRequestMethod method) {
    initialize(request, "ContractTypeValidate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ContractTypeValidateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setContractTypeValidateForContractTypeValidateCreate(ContractTypeObjectData data) {
    if (data != null) {
      addInput("ContractTypeValidate", ContractTypeObjectHelper.toMap(data, new HashMap(), "ContractTypeValidate").get("ContractTypeValidate"));
    }
  }
  public void setServiceInternalIdForContractTypeValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForContractTypeValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public ContractTypeObjectData getContractTypeObjectDataContractTypeValidateFromContractTypeValidateCreate() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractTypeValidate");
  }
  /**
   @deprecated
   */
  public void setContractTypeObjectData(ContractTypeObjectData data) {
    if (data != null) {
      addInput("ContractTypeValidate", ContractTypeObjectHelper.toMap(data, new HashMap()).get("ContractTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public ContractTypeObjectData getContractTypeObjectData() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractTypeValidate");
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
