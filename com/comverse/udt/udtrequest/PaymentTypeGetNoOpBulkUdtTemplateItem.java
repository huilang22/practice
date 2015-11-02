/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PaymentTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PaymentTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PaymentTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   PaymentTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PaymentTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentTypeObjectData noOpInIn) {
    super(id, context, "PaymentTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PaymentType", PaymentTypeObjectHelper.toMap(noOpIn, new HashMap(), "PaymentType").get("PaymentType"));
    }
  }
/**
 *
 * Sets the  PaymentType
 * @param noOpInIn PaymentTypeObjectData to set
 *
 */
  public void setPaymentType(PaymentTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PaymentType passed into the constructor
 * @return Simulated response
 *
 */
  public PaymentTypeObjectData getPaymentType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PaymentTypeObjectHelper.fromMap(inputMap, "PaymentType");
  }
}
