/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingRequest.java
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

import com.csgsystems.ctc.data.*;
public final class CtcRatingRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcRatingRequest (String request, CtcRatingRequestMethod method) {
    initialize(request, "CtcRating", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcRatingRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcRatingForCtcRatingCreate(CtcRatingObjectData data) {
    if (data != null) {
      addInput("CtcRating", CtcRatingObjectHelper.toMap(data, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }
  public void setCtcRatingForCtcRatingDelete(CtcRatingObjectKeyData data) {
    if (data != null) {
      addInput("CtcRating", CtcRatingObjectKeyHelper.toMap(data, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }
  public void setCtcRatingForCtcRatingFind(CtcRatingObjectFilter data) {
    if (data != null) {
      addInput("CtcRating", CtcRatingObjectHelper.toMap(data, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }
  public void setCtcRatingForCtcRatingGet(CtcRatingObjectKeyData data) {
    if (data != null) {
      addInput("CtcRating", CtcRatingObjectKeyHelper.toMap(data, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }
  public void setCtcRatingForCtcRatingUpdate(CtcRatingObjectData data) {
    if (data != null) {
      addInput("CtcRating", CtcRatingObjectHelper.toMap(data, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }
  public CtcRatingObjectData getCtcRatingObjectDataCtcRatingFromCtcRatingCreate() {
    return CtcRatingObjectHelper.fromMap(outputMap, "CtcRating");
  }
  public CtcRatingObjectData getCtcRatingObjectDataCtcRatingFromCtcRatingDelete() {
    return CtcRatingObjectHelper.fromMap(outputMap, "CtcRating");
  }
  public CtcRatingObjectDataList getCtcRatingObjectDataCtcRatingFromCtcRatingFind() {
    return CtcRatingObjectHelper.fromMapList(outputMap, "CtcRatingList");
  }
  public CtcRatingObjectData getCtcRatingObjectDataCtcRatingFromCtcRatingGet() {
    return CtcRatingObjectHelper.fromMap(outputMap, "CtcRating");
  }
  public CtcRatingObjectData getCtcRatingObjectDataCtcRatingFromCtcRatingUpdate() {
    return CtcRatingObjectHelper.fromMap(outputMap, "CtcRating");
  }
  /**
   @deprecated
   */
  public void setCtcRatingObjectFilter(CtcRatingObjectFilter data) {
    if (data != null) {
      addInput("CtcRating", CtcRatingObjectHelper.toMap(data, new HashMap()).get("CtcRatingObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcRatingObjectData(CtcRatingObjectData data) {
    if (data != null) {
      addInput("CtcRating", CtcRatingObjectHelper.toMap(data, new HashMap()).get("CtcRatingObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcRatingObjectKeyData(CtcRatingObjectKeyData data) {
    if (data != null) {
      addInput("CtcRating", CtcRatingObjectKeyHelper.toMap(data, new HashMap()).get("CtcRatingObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcRatingObjectDataList getCtcRatingObjectDataList() {
    return CtcRatingObjectHelper.fromMapList(outputMap, "CtcRatingList");
  }
  /**
   @deprecated
   */
  public CtcRatingObjectData getCtcRatingObjectData() {
    return CtcRatingObjectHelper.fromMap(outputMap, "CtcRating");
  }
}
