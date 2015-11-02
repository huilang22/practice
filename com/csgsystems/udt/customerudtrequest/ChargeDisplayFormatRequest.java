/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDisplayFormatRequest.java
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
public final class ChargeDisplayFormatRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ChargeDisplayFormatRequest (String request, ChargeDisplayFormatRequestMethod method) {
    initialize(request, "ChargeDisplayFormat", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ChargeDisplayFormatRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setChargeDisplayFormatForChargeDisplayFormatCreate(ChargeDisplayFormatObjectData data) {
    if (data != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(data, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }
  public void setChargeDisplayFormatForChargeDisplayFormatFind(ChargeDisplayFormatObjectFilter data) {
    if (data != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(data, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }
  public void setChargeDisplayFormatForChargeDisplayFormatGet(ChargeDisplayFormatObjectKeyData data) {
    if (data != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectKeyHelper.toMap(data, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }
  public void setChargeDisplayFormatForChargeDisplayFormatUpdate(ChargeDisplayFormatObjectData data) {
    if (data != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(data, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }
  public ChargeDisplayFormatObjectData getChargeDisplayFormatObjectDataChargeDisplayFormatFromChargeDisplayFormatCreate() {
    return ChargeDisplayFormatObjectHelper.fromMap(outputMap, "ChargeDisplayFormat");
  }
  public ChargeDisplayFormatObjectDataList getChargeDisplayFormatObjectDataChargeDisplayFormatFromChargeDisplayFormatFind() {
    return ChargeDisplayFormatObjectHelper.fromMapList(outputMap, "ChargeDisplayFormatList");
  }
  public ChargeDisplayFormatObjectData getChargeDisplayFormatObjectDataChargeDisplayFormatFromChargeDisplayFormatGet() {
    return ChargeDisplayFormatObjectHelper.fromMap(outputMap, "ChargeDisplayFormat");
  }
  public ChargeDisplayFormatObjectData getChargeDisplayFormatObjectDataChargeDisplayFormatFromChargeDisplayFormatUpdate() {
    return ChargeDisplayFormatObjectHelper.fromMap(outputMap, "ChargeDisplayFormat");
  }
  /**
   @deprecated
   */
  public void setChargeDisplayFormatObjectFilter(ChargeDisplayFormatObjectFilter data) {
    if (data != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(data, new HashMap()).get("ChargeDisplayFormatObject"));
    }
  }
  /**
   @deprecated
   */
  public void setChargeDisplayFormatObjectData(ChargeDisplayFormatObjectData data) {
    if (data != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(data, new HashMap()).get("ChargeDisplayFormatObject"));
    }
  }
  /**
   @deprecated
   */
  public void setChargeDisplayFormatObjectKeyData(ChargeDisplayFormatObjectKeyData data) {
    if (data != null) {
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectKeyHelper.toMap(data, new HashMap()).get("ChargeDisplayFormatObject"));
    }
  }
  /**
   @deprecated
   */
  public ChargeDisplayFormatObjectDataList getChargeDisplayFormatObjectDataList() {
    return ChargeDisplayFormatObjectHelper.fromMapList(outputMap, "ChargeDisplayFormatList");
  }
  /**
   @deprecated
   */
  public ChargeDisplayFormatObjectData getChargeDisplayFormatObjectData() {
    return ChargeDisplayFormatObjectHelper.fromMap(outputMap, "ChargeDisplayFormat");
  }
}
