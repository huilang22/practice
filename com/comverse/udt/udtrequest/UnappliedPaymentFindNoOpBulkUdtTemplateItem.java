/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a UnappliedPaymentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnappliedPaymentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnappliedPaymentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UnappliedPaymentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnappliedPaymentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnappliedPaymentObjectDataList noOpInIn) {
    super(id, context, "UnappliedPaymentFind");
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
        mapArray[i] = UnappliedPaymentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnappliedPayment", noOpIn);
      }
      addInput("UnappliedPayment", mapList);
    }
  }
/**
 *
 * Sets the  UnappliedPayment
 * @param noOpInIn UnappliedPaymentObjectDataList to set
 *
 */
  public void setUnappliedPayment(UnappliedPaymentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnappliedPayment passed into the constructor
 * @return Simulated response
 *
 */
  public UnappliedPaymentObjectDataList getUnappliedPayment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnappliedPaymentObjectHelper.fromMapList(inputMap, "UnappliedPaymentList");
  }
}
