/*
 * Generated code DO NOT EDIT
 * Generated file: RefundReasonFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RefundReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RefundReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RefundReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RefundReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RefundReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundReasonObjectDataList noOpInIn) {
    super(id, context, "RefundReasonFind");
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
        mapArray[i] = RefundReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RefundReason", noOpIn);
      }
      addInput("RefundReason", mapList);
    }
  }
/**
 *
 * Sets the  RefundReason
 * @param noOpInIn RefundReasonObjectDataList to set
 *
 */
  public void setRefundReason(RefundReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RefundReason passed into the constructor
 * @return Simulated response
 *
 */
  public RefundReasonObjectDataList getRefundReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RefundReasonObjectHelper.fromMapList(inputMap, "RefundReasonList");
  }
}
