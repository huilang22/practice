/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardTypeCodeRequest.java
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
public final class CreditCardTypeCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CreditCardTypeCodeRequest (String request, CreditCardTypeCodeRequestMethod method) {
    initialize(request, "CreditCardTypeCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CreditCardTypeCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCreditCardTypeCodeForCreditCardTypeCodeFind(CreditCardTypeCodeObjectFilter data) {
    if (data != null) {
      addInput("CreditCardTypeCode", CreditCardTypeCodeObjectHelper.toMap(data, new HashMap(), "CreditCardTypeCode").get("CreditCardTypeCode"));
    }
  }
  public void setCreditCardTypeCodeForCreditCardTypeCodeGet(CreditCardTypeCodeObjectKeyData data) {
    if (data != null) {
      addInput("CreditCardTypeCode", CreditCardTypeCodeObjectKeyHelper.toMap(data, new HashMap(), "CreditCardTypeCode").get("CreditCardTypeCode"));
    }
  }
  public CreditCardTypeCodeObjectDataList getCreditCardTypeCodeObjectDataCreditCardTypeCodeFromCreditCardTypeCodeFind() {
    return CreditCardTypeCodeObjectHelper.fromMapList(outputMap, "CreditCardTypeCodeList");
  }
  public CreditCardTypeCodeObjectData getCreditCardTypeCodeObjectDataCreditCardTypeCodeFromCreditCardTypeCodeGet() {
    return CreditCardTypeCodeObjectHelper.fromMap(outputMap, "CreditCardTypeCode");
  }
  /**
   @deprecated
   */
  public void setCreditCardTypeCodeObjectFilter(CreditCardTypeCodeObjectFilter data) {
    if (data != null) {
      addInput("CreditCardTypeCode", CreditCardTypeCodeObjectHelper.toMap(data, new HashMap()).get("CreditCardTypeCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCreditCardTypeCodeObjectKeyData(CreditCardTypeCodeObjectKeyData data) {
    if (data != null) {
      addInput("CreditCardTypeCode", CreditCardTypeCodeObjectKeyHelper.toMap(data, new HashMap()).get("CreditCardTypeCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public CreditCardTypeCodeObjectDataList getCreditCardTypeCodeObjectDataList() {
    return CreditCardTypeCodeObjectHelper.fromMapList(outputMap, "CreditCardTypeCodeList");
  }
  /**
   @deprecated
   */
  public CreditCardTypeCodeObjectData getCreditCardTypeCodeObjectData() {
    return CreditCardTypeCodeObjectHelper.fromMap(outputMap, "CreditCardTypeCode");
  }
}
