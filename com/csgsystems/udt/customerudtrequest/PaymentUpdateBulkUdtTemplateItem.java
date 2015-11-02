/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PaymentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentObjectData payUpdateIn1;
  protected Integer _WaiveEpg;
/**
 *
 * Constructor to create a  PaymentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentObjectData payUpdateIn1In, Integer _WaiveEpgIn) {
    super(id, context, "PaymentUpdate");
    payUpdateIn1 = payUpdateIn1In;
    _WaiveEpg = _WaiveEpgIn;
  }

  public void translateToMap() {
    if (payUpdateIn1 != null) {
      payUpdateIn1.resetFlags(true, true);
      addInput("Payment", PaymentObjectHelper.toMap(payUpdateIn1, new HashMap(), "Payment").get("Payment"));
    }
    if (_WaiveEpg != null) {
      addInput("WaiveEpg", _WaiveEpg);
    }
  }


/**
 *
 * Sets the Payment
 * @param payUpdateIn1In Value of the payUpdateIn1
 *
 */

  public void setPayment(PaymentObjectData payUpdateIn1In) {
    payUpdateIn1 = payUpdateIn1In;
  }

/**
 *
 * Sets the WaiveEpg
 * @param _WaiveEpgIn Value of the _WaiveEpg
 *
 */

  public void setWaiveEpg(Integer _WaiveEpgIn) {
    _WaiveEpg = _WaiveEpgIn;
  }

  public void translateFromMap() {
    payUpdateIn1 = PaymentObjectHelper.fromMap(inputMap, "Payment");
    _WaiveEpg = (Integer)inputMap.get("WaiveEpg");
  }

/**
 *
 * Gets the Payment
 * @return Value of the Payment
 *
 */

  public PaymentObjectData getPayment( ) {
    return payUpdateIn1;
  }

/**
 *
 * Gets the WaiveEpg
 * @return Value of the WaiveEpg
 *
 */

  public Integer getWaiveEpg( ) {
    return _WaiveEpg;
  }

}
