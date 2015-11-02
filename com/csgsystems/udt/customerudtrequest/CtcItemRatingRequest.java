/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRatingRequest.java
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
public final class CtcItemRatingRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcItemRatingRequest (String request, CtcItemRatingRequestMethod method) {
    initialize(request, "CtcItemRating", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcItemRatingRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcItemRatingForCtcItemRatingCreate(CtcItemRatingObjectData data) {
    if (data != null) {
      addInput("CtcItemRating", CtcItemRatingObjectHelper.toMap(data, new HashMap(), "CtcItemRating").get("CtcItemRating"));
    }
  }
  public void setCtcItemRatingForCtcItemRatingDelete(CtcItemRatingObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemRating", CtcItemRatingObjectKeyHelper.toMap(data, new HashMap(), "CtcItemRating").get("CtcItemRating"));
    }
  }
  public void setCtcItemRatingForCtcItemRatingFind(CtcItemRatingObjectFilter data) {
    if (data != null) {
      addInput("CtcItemRating", CtcItemRatingObjectHelper.toMap(data, new HashMap(), "CtcItemRating").get("CtcItemRating"));
    }
  }
  public void setCtcItemRatingForCtcItemRatingGet(CtcItemRatingObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemRating", CtcItemRatingObjectKeyHelper.toMap(data, new HashMap(), "CtcItemRating").get("CtcItemRating"));
    }
  }
  public CtcItemRatingObjectData getCtcItemRatingObjectDataCtcItemRatingFromCtcItemRatingCreate() {
    return CtcItemRatingObjectHelper.fromMap(outputMap, "CtcItemRating");
  }
  public CtcItemRatingObjectData getCtcItemRatingObjectDataCtcItemRatingFromCtcItemRatingDelete() {
    return CtcItemRatingObjectHelper.fromMap(outputMap, "CtcItemRating");
  }
  public CtcItemRatingObjectDataList getCtcItemRatingObjectDataCtcItemRatingFromCtcItemRatingFind() {
    return CtcItemRatingObjectHelper.fromMapList(outputMap, "CtcItemRatingList");
  }
  public CtcItemRatingObjectData getCtcItemRatingObjectDataCtcItemRatingFromCtcItemRatingGet() {
    return CtcItemRatingObjectHelper.fromMap(outputMap, "CtcItemRating");
  }
  /**
   @deprecated
   */
  public void setCtcItemRatingObjectFilter(CtcItemRatingObjectFilter data) {
    if (data != null) {
      addInput("CtcItemRating", CtcItemRatingObjectHelper.toMap(data, new HashMap()).get("CtcItemRatingObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemRatingObjectData(CtcItemRatingObjectData data) {
    if (data != null) {
      addInput("CtcItemRating", CtcItemRatingObjectHelper.toMap(data, new HashMap()).get("CtcItemRatingObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemRatingObjectKeyData(CtcItemRatingObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemRating", CtcItemRatingObjectKeyHelper.toMap(data, new HashMap()).get("CtcItemRatingObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcItemRatingObjectDataList getCtcItemRatingObjectDataList() {
    return CtcItemRatingObjectHelper.fromMapList(outputMap, "CtcItemRatingList");
  }
  /**
   @deprecated
   */
  public CtcItemRatingObjectData getCtcItemRatingObjectData() {
    return CtcItemRatingObjectHelper.fromMap(outputMap, "CtcItemRating");
  }
}
