/*
 * Generated code DO NOT EDIT
 * Generated file: ServPackageTypeRequest.java
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
public final class ServPackageTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServPackageTypeRequest (String request, ServPackageTypeRequestMethod method) {
    initialize(request, "ServPackageType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServPackageTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdInForServPackageTypeFind(BigInteger data) {
    if (data != null) {
      addInput("AddressIdIn", data);
    }
  }
  public void setIndustryTypeIdForServPackageTypeFind(Integer data) {
    if (data != null) {
      addInput("IndustryTypeId", data);
    }
  }
  public void setServiceableDtForServPackageTypeFind(Date data) {
    if (data != null) {
      addInput("ServiceableDt", data);
    }
  }
  public PDObjectDataList getPDObjectDataPackageDefinitionFromServPackageTypeFind() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
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
  public void setIndustryTypeId(Integer data) {
    if (data != null) {
      addInput("IndustryTypeId", data);
    }
  }
  /**
   @deprecated
   */
  public PDObjectDataList getPDObjectDataList() {
    return PDObjectHelper.fromMapList(outputMap, "PDList");
  }
  /**
   @deprecated
   */
  public void setServiceableDt(Date data) {
    if (data != null) {
      addInput("ServiceableDt", data);
    }
  }
}
