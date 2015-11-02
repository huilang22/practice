/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdAssignFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentMerchantIdAssignFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentMerchantIdAssignFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentMerchantIdAssignObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PaymentMerchantIdAssignFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentMerchantIdAssignFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentMerchantIdAssignObjectDataList noOpInIn) {
    super(id, context, "PaymentMerchantIdAssignFind");
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
        mapArray[i] = PaymentMerchantIdAssignObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentMerchantIdAssign", noOpIn);
      }
      addInput("PaymentMerchantIdAssign", mapList);
    }
  }
/**
 *
 * Sets the  PaymentMerchantIdAssign
 * @param noOpInIn PaymentMerchantIdAssignObjectDataList to set
 *
 */
  public void setPaymentMerchantIdAssign(PaymentMerchantIdAssignObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentMerchantIdAssign passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentMerchantIdAssignObjectDataList getPaymentMerchantIdAssign() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentMerchantIdAssignObjectHelper.fromMapList(inputMap, "PaymentMerchantIdAssignList");
  }
}
