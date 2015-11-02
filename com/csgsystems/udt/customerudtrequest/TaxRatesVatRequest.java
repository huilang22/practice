/*
 * Generated code DO NOT EDIT
 * Generated file: TaxRatesVatRequest.java
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
public final class TaxRatesVatRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TaxRatesVatRequest (String request, TaxRatesVatRequestMethod method) {
    initialize(request, "TaxRatesVat", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TaxRatesVatRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTaxRatesVatForTaxRatesVatFind(TaxRatesVatObjectFilter data) {
    if (data != null) {
      addInput("TaxRatesVat", TaxRatesVatObjectHelper.toMap(data, new HashMap(), "TaxRatesVat").get("TaxRatesVat"));
    }
  }
  public void setTaxRatesVatForTaxRatesVatGet(TaxRatesVatObjectKeyData data) {
    if (data != null) {
      addInput("TaxRatesVat", TaxRatesVatObjectKeyHelper.toMap(data, new HashMap(), "TaxRatesVat").get("TaxRatesVat"));
    }
  }
  public TaxRatesVatObjectDataList getTaxRatesVatObjectDataTaxRatesVatFromTaxRatesVatFind() {
    return TaxRatesVatObjectHelper.fromMapList(outputMap, "TaxRatesVatList");
  }
  public TaxRatesVatObjectData getTaxRatesVatObjectDataTaxRatesVatFromTaxRatesVatGet() {
    return TaxRatesVatObjectHelper.fromMap(outputMap, "TaxRatesVat");
  }
  /**
   @deprecated
   */
  public void setTaxRatesVatObjectFilter(TaxRatesVatObjectFilter data) {
    if (data != null) {
      addInput("TaxRatesVat", TaxRatesVatObjectHelper.toMap(data, new HashMap()).get("TaxRatesVatObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTaxRatesVatObjectKeyData(TaxRatesVatObjectKeyData data) {
    if (data != null) {
      addInput("TaxRatesVat", TaxRatesVatObjectKeyHelper.toMap(data, new HashMap()).get("TaxRatesVatObject"));
    }
  }
  /**
   @deprecated
   */
  public TaxRatesVatObjectDataList getTaxRatesVatObjectDataList() {
    return TaxRatesVatObjectHelper.fromMapList(outputMap, "TaxRatesVatList");
  }
  /**
   @deprecated
   */
  public TaxRatesVatObjectData getTaxRatesVatObjectData() {
    return TaxRatesVatObjectHelper.fromMap(outputMap, "TaxRatesVat");
  }
}
