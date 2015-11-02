/*
 * Generated code DO NOT EDIT
 * Generated file: BsdLocaleRequest.java
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

import com.csgsystems.utl.data.*;
public final class BsdLocaleRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdLocaleRequest (String request, BsdLocaleRequestMethod method) {
    initialize(request, "BsdLocale", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdLocaleRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdLocaleForBsdLocaleCreate(BsdLocaleObjectData data) {
    if (data != null) {
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(data, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }
  public void setBsdLocaleForBsdLocaleDelete(BsdLocaleObjectKeyData data) {
    if (data != null) {
      addInput("BsdLocale", BsdLocaleObjectKeyHelper.toMap(data, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }
  public void setBsdLocaleForBsdLocaleFind(BsdLocaleObjectFilter data) {
    if (data != null) {
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(data, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }
  public void setBsdLocaleForBsdLocaleGet(BsdLocaleObjectKeyData data) {
    if (data != null) {
      addInput("BsdLocale", BsdLocaleObjectKeyHelper.toMap(data, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }
  public void setBsdLocaleForBsdLocaleUpdate(BsdLocaleObjectData data) {
    if (data != null) {
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(data, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }
  public BsdLocaleObjectData getBsdLocaleObjectDataBsdLocaleFromBsdLocaleCreate() {
    return BsdLocaleObjectHelper.fromMap(outputMap, "BsdLocale");
  }
  public BsdLocaleObjectData getBsdLocaleObjectDataBsdLocaleFromBsdLocaleDelete() {
    return BsdLocaleObjectHelper.fromMap(outputMap, "BsdLocale");
  }
  public BsdLocaleObjectDataList getBsdLocaleObjectDataBsdLocaleFromBsdLocaleFind() {
    return BsdLocaleObjectHelper.fromMapList(outputMap, "BsdLocaleList");
  }
  public BsdLocaleObjectData getBsdLocaleObjectDataBsdLocaleFromBsdLocaleGet() {
    return BsdLocaleObjectHelper.fromMap(outputMap, "BsdLocale");
  }
  public BsdLocaleObjectKeyData getBsdLocaleObjectKeyDataBsdLocaleFromBsdLocaleSequenceGet() {
    return BsdLocaleObjectKeyHelper.fromMap(outputMap, "BsdLocale");
  }
  public BsdLocaleObjectData getBsdLocaleObjectDataBsdLocaleFromBsdLocaleUpdate() {
    return BsdLocaleObjectHelper.fromMap(outputMap, "BsdLocale");
  }
  /**
   @deprecated
   */
  public void setBsdLocaleObjectFilter(BsdLocaleObjectFilter data) {
    if (data != null) {
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(data, new HashMap()).get("BsdLocaleObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdLocaleObjectData(BsdLocaleObjectData data) {
    if (data != null) {
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(data, new HashMap()).get("BsdLocaleObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdLocaleObjectKeyData(BsdLocaleObjectKeyData data) {
    if (data != null) {
      addInput("BsdLocale", BsdLocaleObjectKeyHelper.toMap(data, new HashMap()).get("BsdLocaleObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdLocaleObjectDataList getBsdLocaleObjectDataList() {
    return BsdLocaleObjectHelper.fromMapList(outputMap, "BsdLocaleList");
  }
  /**
   @deprecated
   */
  public BsdLocaleObjectKeyData getBsdLocaleObjectKeyData() {
    return BsdLocaleObjectKeyHelper.fromMap(outputMap, "BsdLocale");
  }
  /**
   @deprecated
   */
  public BsdLocaleObjectData getBsdLocaleObjectData() {
    return BsdLocaleObjectHelper.fromMap(outputMap, "BsdLocale");
  }
}
