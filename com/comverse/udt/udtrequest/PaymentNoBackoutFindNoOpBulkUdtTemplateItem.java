/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentNoBackoutFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentNoBackoutFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentNoBackoutFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PaymentNoBackoutFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentNoBackoutFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectDataList noOpInIn) {
    super(id, context, "PaymentNoBackoutFind");
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
        mapArray[i] = PaymentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Payment", noOpIn);
      }
      addInput("Payment", mapList);
    }
  }
/**
 *
 * Sets the  Payment
 * @param noOpInIn PaymentObjectDataList to set
 *
 */
  public void setPayment(PaymentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Payment passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentObjectDataList getPayment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentObjectHelper.fromMapList(inputMap, "PaymentList");
  }
}
