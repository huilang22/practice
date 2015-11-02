/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentTransFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentTransFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentTransFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentTransObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PaymentTransFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentTransFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentTransObjectDataList noOpInIn) {
    super(id, context, "PaymentTransFind");
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
        mapArray[i] = PaymentTransObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentTrans", noOpIn);
      }
      addInput("PaymentTrans", mapList);
    }
  }
/**
 *
 * Sets the  PaymentTrans
 * @param noOpInIn PaymentTransObjectDataList to set
 *
 */
  public void setPaymentTrans(PaymentTransObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentTrans passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentTransObjectDataList getPaymentTrans() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentTransObjectHelper.fromMapList(inputMap, "PaymentTransList");
  }
}
