/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentCreateBulkUdtTemplateItem.java
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
 * Class used to create a PaymentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectData payCreateIn1;
  protected Integer WaiveEpg;
/**
 *
 * Constructor to create a  PaymentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectData payCreateIn1In, Integer WaiveEpgIn) {
    super(id, context, "PaymentCreate");
    payCreateIn1 = payCreateIn1In;
    WaiveEpg = WaiveEpgIn;
  }

  public void translateToMap() {
    if (payCreateIn1 != null) {
      payCreateIn1.resetFlags(true, true);
      addInput("Payment", PaymentObjectHelper.toMap(payCreateIn1, new HashMap(), "Payment").get("Payment"));
    }
    if (WaiveEpg != null) {
      addInput("WaiveEpg", WaiveEpg);
    }
  }


/**
 *
 * Sets the Payment
 * @param payCreateIn1In Value of the payCreateIn1
 *
 */

  public void setPayment(PaymentObjectData payCreateIn1In) {
    payCreateIn1 = payCreateIn1In;
  }

/**
 *
 * Sets the WaiveEpg
 * @param WaiveEpgIn Value of the WaiveEpg
 *
 */

  public void setWaiveEpg(Integer WaiveEpgIn) {
    WaiveEpg = WaiveEpgIn;
  }

  public void translateFromMap() {
    payCreateIn1 = PaymentObjectHelper.fromMap(inputMap, "Payment");
    WaiveEpg = (Integer)inputMap.get("WaiveEpg");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectData getPayment( ) {
    return payCreateIn1;
  }

/**
 *
 * Gets the WaiveEpg
 * @return Value of the WaiveEpg
 *
 */

  public Integer getWaiveEpg( ) {
    return WaiveEpg;
  }

}
