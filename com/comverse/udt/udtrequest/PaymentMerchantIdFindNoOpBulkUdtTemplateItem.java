/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentMerchantIdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentMerchantIdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentMerchantIdObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PaymentMerchantIdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentMerchantIdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdObjectDataList noOpInIn) {
    super(id, context, "PaymentMerchantIdFind");
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
        mapArray[i] = PaymentMerchantIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentMerchantId", noOpIn);
      }
      addInput("PaymentMerchantId", mapList);
    }
  }
/**
 *
 * Sets the  PaymentMerchantId
 * @param noOpInIn PaymentMerchantIdObjectDataList to set
 *
 */
  public void setPaymentMerchantId(PaymentMerchantIdObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentMerchantId passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentMerchantIdObjectDataList getPaymentMerchantId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentMerchantIdObjectHelper.fromMapList(inputMap, "PaymentMerchantIdList");
  }
}
