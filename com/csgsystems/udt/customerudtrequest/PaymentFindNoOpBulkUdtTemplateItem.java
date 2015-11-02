/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PaymentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectDataList noOpInIn) {
    super(id, context, "PaymentFind");
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
