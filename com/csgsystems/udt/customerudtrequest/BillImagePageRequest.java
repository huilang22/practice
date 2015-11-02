/*
 * Generated code DO NOT EDIT
 * Generated file: BillImagePageRequest.java
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
public final class BillImagePageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillImagePageRequest (String request, BillImagePageRequestMethod method) {
    initialize(request, "BillImagePage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillImagePageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountActiveDateForBillImagePageFind(Date data) {
    if (data != null) {
      addInput("AccountActiveDate", data);
    }
  }
  public void setBillImagePageForBillImagePageFind(BillImagePageObjectFilter data) {
    if (data != null) {
      addInput("BillImagePage", BillImagePageObjectHelper.toMap(data, new HashMap(), "BillImagePage").get("BillImagePage"));
    }
  }
  public BillImagePageObjectDataList getBillImagePageObjectDataBillImagePageFromBillImagePageFind() {
    return BillImagePageObjectHelper.fromMapList(outputMap, "BillImagePageList");
  }
  /**
   @deprecated
   */
  public void setAccountActiveDate(Date data) {
    if (data != null) {
      addInput("AccountActiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setBillImagePageObjectFilter(BillImagePageObjectFilter data) {
    if (data != null) {
      addInput("BillImagePage", BillImagePageObjectHelper.toMap(data, new HashMap()).get("BillImagePageObject"));
    }
  }
  /**
   @deprecated
   */
  public BillImagePageObjectDataList getBillImagePageObjectDataList() {
    return BillImagePageObjectHelper.fromMapList(outputMap, "BillImagePageList");
  }
}
