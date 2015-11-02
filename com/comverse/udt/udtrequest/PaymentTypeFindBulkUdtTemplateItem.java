/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a PaymentTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PaymentTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PaymentTypeObjectFilter bmfFindIn;
/**
 *
 * Constructor to create a  PaymentTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PaymentTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PaymentTypeObjectFilter bmfFindInIn) {
    super(id, context, "PaymentTypeFind");
    bmfFindIn = bmfFindInIn;
  }

  public void translateToMap() {
    if (bmfFindIn != null) {
      Integer index =  bmfFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentType", PaymentTypeObjectHelper.toMap(bmfFindIn, new HashMap(), "PaymentType").get("PaymentType"));
    }
  }


/**
 *
 * Sets the PaymentType
 * @param bmfFindInIn Value of the bmfFindIn
 *
 */

  public void setPaymentType(PaymentTypeObjectFilter bmfFindInIn) {
    bmfFindIn = bmfFindInIn;
  }

  public void translateFromMap() {
    bmfFindIn = PaymentTypeObjectHelper.fromMapFilter(inputMap, "PaymentType");
  }

/**
 *
 * Gets the PaymentType
 * @return Value of the PaymentType
 *
 */

  public PaymentTypeObjectFilter getPaymentType( ) {
    return bmfFindIn;
  }

}
