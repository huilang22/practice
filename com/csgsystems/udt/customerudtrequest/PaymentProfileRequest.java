/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentProfileRequest.java
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
public final class PaymentProfileRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PaymentProfileRequest (String request, PaymentProfileRequestMethod method) {
    initialize(request, "PaymentProfile", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PaymentProfileRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPaymentProfileForPaymentProfileCreate(PaymentProfileObjectData data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(data, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }
  public void setPaymentProtocolForPaymentProfileCreate(Integer data) {
    if (data != null) {
      addInput("PaymentProtocol", data);
    }
  }
  public void setPaymentProfileForPaymentProfileDelete(PaymentProfileObjectKeyData data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectKeyHelper.toMap(data, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }
  public void setPaymentProtocol3ForPaymentProfileDelete(Integer data) {
    if (data != null) {
      addInput("PaymentProtocol3", data);
    }
  }
  public void setProfileStatusForPaymentProfileDelete(Integer data) {
    if (data != null) {
      addInput("ProfileStatus", data);
    }
  }
  public void setPaymentProfileForPaymentProfileFind(PaymentProfileObjectFilter data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(data, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }
  public void setPaymentProfileForPaymentProfileGet(PaymentProfileObjectKeyData data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectKeyHelper.toMap(data, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }
  public void setPaymentProfileForPaymentProfileUpdate(PaymentProfileObjectData data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(data, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }
  public void setPaymentProtocol2ForPaymentProfileUpdate(Integer data) {
    if (data != null) {
      addInput("PaymentProtocol2", data);
    }
  }
  public PaymentProfileObjectData getPaymentProfileObjectDataPaymentProfileFromPaymentProfileCreate() {
    return PaymentProfileObjectHelper.fromMap(outputMap, "PaymentProfile");
  }
  public PaymentProfileObjectData getPaymentProfileObjectDataPaymentProfileFromPaymentProfileDelete() {
    return PaymentProfileObjectHelper.fromMap(outputMap, "PaymentProfile");
  }
  public PaymentProfileObjectDataList getPaymentProfileObjectDataPaymentProfileFromPaymentProfileFind() {
    return PaymentProfileObjectHelper.fromMapList(outputMap, "PaymentProfileList");
  }
  public PaymentProfileObjectData getPaymentProfileObjectDataPaymentProfileFromPaymentProfileGet() {
    return PaymentProfileObjectHelper.fromMap(outputMap, "PaymentProfile");
  }
  public PaymentProfileObjectData getPaymentProfileObjectDataPaymentProfileFromPaymentProfileUpdate() {
    return PaymentProfileObjectHelper.fromMap(outputMap, "PaymentProfile");
  }
  /**
   @deprecated
   */
  public void setPaymentProfileObjectFilter(PaymentProfileObjectFilter data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(data, new HashMap()).get("PaymentProfileObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentProfileObjectData(PaymentProfileObjectData data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(data, new HashMap()).get("PaymentProfileObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentProfileObjectKeyData(PaymentProfileObjectKeyData data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectKeyHelper.toMap(data, new HashMap()).get("PaymentProfileObject"));
    }
  }
  /**
   @deprecated
   */
  public PaymentProfileObjectDataList getPaymentProfileObjectDataList() {
    return PaymentProfileObjectHelper.fromMapList(outputMap, "PaymentProfileList");
  }
  /**
   @deprecated
   */
  public PaymentProfileObjectData getPaymentProfileObjectData() {
    return PaymentProfileObjectHelper.fromMap(outputMap, "PaymentProfile");
  }
  /**
   @deprecated
   */
  public void setPaymentProtocol(Integer data) {
    if (data != null) {
      addInput("PaymentProtocol", data);
    }
  }
  /**
   @deprecated
   */
  public void setPaymentProtocol2(Integer data) {
    if (data != null) {
      addInput("PaymentProtocol2", data);
    }
  }
  /**
   @deprecated
   */
  public void setPaymentProtocol3(Integer data) {
    if (data != null) {
      addInput("PaymentProtocol3", data);
    }
  }
  /**
   @deprecated
   */
  public void setProfileStatus(Integer data) {
    if (data != null) {
      addInput("ProfileStatus", data);
    }
  }
}
