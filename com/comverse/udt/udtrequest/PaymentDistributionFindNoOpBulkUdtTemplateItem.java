/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentDistributionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentDistributionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentDistributionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PaymentDistributionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentDistributionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentDistributionObjectDataList noOpInIn) {
    super(id, context, "PaymentDistributionFind");
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
        mapArray[i] = PaymentDistributionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PaymentDistribution", noOpIn);
      }
      addInput("PaymentDistribution", mapList);
    }
  }
/**
 *
 * Sets the  PaymentDistribution
 * @param noOpInIn PaymentDistributionObjectDataList to set
 *
 */
  public void setPaymentDistribution(PaymentDistributionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentDistribution passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentDistributionObjectDataList getPaymentDistribution() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentDistributionObjectHelper.fromMapList(inputMap, "PaymentDistributionList");
  }
}
