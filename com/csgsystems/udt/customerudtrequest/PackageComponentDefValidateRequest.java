/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentDefValidateRequest.java
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

import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;
public final class PackageComponentDefValidateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PackageComponentDefValidateRequest (String request, PackageComponentDefValidateRequestMethod method) {
    initialize(request, "PackageComponentDefValidate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PackageComponentDefValidateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPackageComponentDefValidateForPackageComponentDefValidateCreate(PCDObjectData data) {
    if (data != null) {
      addInput("PackageComponentDefValidate", PCDObjectHelper.toMap(data, new HashMap(), "PackageComponentDefValidate").get("PackageComponentDefValidate"));
    }
  }
  public void setServiceInternalIdForPackageComponentDefValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForPackageComponentDefValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public PCDObjectData getPCDObjectDataPackageComponentDefValidateFromPackageComponentDefValidateCreate() {
    return PCDObjectHelper.fromMap(outputMap, "PackageComponentDefValidate");
  }
  /**
   @deprecated
   */
  public void setPCDObjectData(PCDObjectData data) {
    if (data != null) {
      addInput("PackageComponentDefValidate", PCDObjectHelper.toMap(data, new HashMap()).get("PCDObject"));
    }
  }
  /**
   @deprecated
   */
  public PCDObjectData getPCDObjectData() {
    return PCDObjectHelper.fromMap(outputMap, "PackageComponentDefValidate");
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
