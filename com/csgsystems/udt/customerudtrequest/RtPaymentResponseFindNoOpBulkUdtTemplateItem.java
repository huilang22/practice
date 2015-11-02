/*
 * Generated code DO NOT EDIT
 * Generated file: RtPaymentResponseFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a RtPaymentResponseFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RtPaymentResponseFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RtPaymentResponseObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RtPaymentResponseFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RtPaymentResponseFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RtPaymentResponseObjectDataList noOpInIn) {
    super(id, context, "RtPaymentResponseFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = RtPaymentResponseObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RtPaymentResponse", noOpIn);
      }
      addInput("RtPaymentResponse", mapList);
    }
  }
/**
 *
 * Sets the  RtPaymentResponse
 * @param noOpInIn RtPaymentResponseObjectDataList to set
 *
 */
  public void setRtPaymentResponse(RtPaymentResponseObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RtPaymentResponse passed into the constructor
 * @return Simulated response
 *
 */
  public RtPaymentResponseObjectDataList getRtPaymentResponse() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RtPaymentResponseObjectHelper.fromMapList(inputMap, "RtPaymentResponseList");
  }
}
