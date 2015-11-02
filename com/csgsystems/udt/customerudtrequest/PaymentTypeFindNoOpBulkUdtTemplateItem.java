/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PaymentTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentTypeObjectDataList noOpInIn) {
    super(id, context, "PaymentTypeFind");
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
        mapArray[i] = PaymentTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentType", noOpIn);
      }
      addInput("PaymentType", mapList);
    }
  }
/**
 *
 * Sets the  PaymentType
 * @param noOpInIn PaymentTypeObjectDataList to set
 *
 */
  public void setPaymentType(PaymentTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentType passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentTypeObjectDataList getPaymentType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentTypeObjectHelper.fromMapList(inputMap, "PaymentTypeList");
  }
}
