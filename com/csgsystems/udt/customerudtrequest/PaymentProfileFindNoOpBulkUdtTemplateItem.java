/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentProfileFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentProfileFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentProfileFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentProfileObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PaymentProfileFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentProfileFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentProfileObjectDataList noOpInIn) {
    super(id, context, "PaymentProfileFind");
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
        mapArray[i] = PaymentProfileObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentProfile", noOpIn);
      }
      addInput("PaymentProfile", mapList);
    }
  }
/**
 *
 * Sets the  PaymentProfile
 * @param noOpInIn PaymentProfileObjectDataList to set
 *
 */
  public void setPaymentProfile(PaymentProfileObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentProfile passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentProfileObjectDataList getPaymentProfile() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentProfileObjectHelper.fromMapList(inputMap, "PaymentProfileList");
  }
}
