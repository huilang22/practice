/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSubjMatterRatingRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvsSubjMatterRatingRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsSubjMatterRatingRequest (String request, InvsSubjMatterRatingRequestMethod method) {
    initialize(request, "InvsSubjMatterRating", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsSubjMatterRatingRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsSubjMatterRatingForInvsSubjMatterRatingCreate(InvsSubjMatterRatingObjectData data) {
    if (data != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(data, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }
  public void setInvsSubjMatterRatingForInvsSubjMatterRatingFind(InvsSubjMatterRatingObjectFilter data) {
    if (data != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(data, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }
  public void setInvsSubjMatterRatingForInvsSubjMatterRatingGet(InvsSubjMatterRatingObjectKeyData data) {
    if (data != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectKeyHelper.toMap(data, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }
  public void setInvsSubjMatterRatingForInvsSubjMatterRatingUpdate(InvsSubjMatterRatingObjectData data) {
    if (data != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(data, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }
  public InvsSubjMatterRatingObjectData getInvsSubjMatterRatingObjectDataInvsSubjMatterRatingFromInvsSubjMatterRatingCreate() {
    return InvsSubjMatterRatingObjectHelper.fromMap(outputMap, "InvsSubjMatterRating");
  }
  public InvsSubjMatterRatingObjectDataList getInvsSubjMatterRatingObjectDataInvsSubjMatterRatingFromInvsSubjMatterRatingFind() {
    return InvsSubjMatterRatingObjectHelper.fromMapList(outputMap, "InvsSubjMatterRatingList");
  }
  public InvsSubjMatterRatingObjectData getInvsSubjMatterRatingObjectDataInvsSubjMatterRatingFromInvsSubjMatterRatingGet() {
    return InvsSubjMatterRatingObjectHelper.fromMap(outputMap, "InvsSubjMatterRating");
  }
  public InvsSubjMatterRatingObjectData getInvsSubjMatterRatingObjectDataInvsSubjMatterRatingFromInvsSubjMatterRatingUpdate() {
    return InvsSubjMatterRatingObjectHelper.fromMap(outputMap, "InvsSubjMatterRating");
  }
  /**
   @deprecated
   */
  public void setInvsSubjMatterRatingObjectFilter(InvsSubjMatterRatingObjectFilter data) {
    if (data != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(data, new HashMap()).get("InvsSubjMatterRatingObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSubjMatterRatingObjectData(InvsSubjMatterRatingObjectData data) {
    if (data != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(data, new HashMap()).get("InvsSubjMatterRatingObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSubjMatterRatingObjectKeyData(InvsSubjMatterRatingObjectKeyData data) {
    if (data != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectKeyHelper.toMap(data, new HashMap()).get("InvsSubjMatterRatingObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsSubjMatterRatingObjectDataList getInvsSubjMatterRatingObjectDataList() {
    return InvsSubjMatterRatingObjectHelper.fromMapList(outputMap, "InvsSubjMatterRatingList");
  }
  /**
   @deprecated
   */
  public InvsSubjMatterRatingObjectData getInvsSubjMatterRatingObjectData() {
    return InvsSubjMatterRatingObjectHelper.fromMap(outputMap, "InvsSubjMatterRating");
  }
}
