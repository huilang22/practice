/*
 * Generated code DO NOT EDIT
 * Generated file: RefundFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RefundFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RefundFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RefundObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RefundFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RefundFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundObjectDataList noOpInIn) {
    super(id, context, "RefundFind");
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
        mapArray[i] = RefundObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Refund", noOpIn);
      }
      addInput("Refund", mapList);
    }
  }
/**
 *
 * Sets the  Refund
 * @param noOpInIn RefundObjectDataList to set
 *
 */
  public void setRefund(RefundObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Refund passed into the constructor
 * @return Simulated response
 *
 */
  public RefundObjectDataList getRefund() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RefundObjectHelper.fromMapList(inputMap, "RefundList");
  }
}
