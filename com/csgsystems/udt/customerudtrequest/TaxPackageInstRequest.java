/*
 * Generated code DO NOT EDIT
 * Generated file: TaxPackageInstRequest.java
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
public final class TaxPackageInstRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TaxPackageInstRequest (String request, TaxPackageInstRequestMethod method) {
    initialize(request, "TaxPackageInst", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TaxPackageInstRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTaxPackageInstForTaxPackageInstFind(TPIObjectFilter data) {
    if (data != null) {
      addInput("TaxPackageInst", TPIObjectHelper.toMap(data, new HashMap(), "TaxPackageInst").get("TaxPackageInst"));
    }
  }
  public void setTaxPackageInstForTaxPackageInstGet(TPIObjectKeyData data) {
    if (data != null) {
      addInput("TaxPackageInst", TPIObjectKeyHelper.toMap(data, new HashMap(), "TaxPackageInst").get("TaxPackageInst"));
    }
  }
  public TPIObjectDataList getTPIObjectDataTaxPackageInstFromTaxPackageInstFind() {
    return TPIObjectHelper.fromMapList(outputMap, "TaxPackageInstList");
  }
  public TPIObjectData getTPIObjectDataTaxPackageInstFromTaxPackageInstGet() {
    return TPIObjectHelper.fromMap(outputMap, "TaxPackageInst");
  }
  /**
   @deprecated
   */
  public void setTPIObjectFilter(TPIObjectFilter data) {
    if (data != null) {
      addInput("TPI", TPIObjectHelper.toMap(data, new HashMap()).get("TPIObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTPIObjectKeyData(TPIObjectKeyData data) {
    if (data != null) {
      addInput("TaxPackageInst", TPIObjectKeyHelper.toMap(data, new HashMap()).get("TPIObject"));
    }
  }
  /**
   @deprecated
   */
  public TPIObjectDataList getTPIObjectDataList() {
    return TPIObjectHelper.fromMapList(outputMap, "TPIList");
  }
  /**
   @deprecated
   */
  public TPIObjectData getTPIObjectData() {
    return TPIObjectHelper.fromMap(outputMap, "TaxPackageInst");
  }
}
