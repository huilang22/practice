/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AxrtPaymentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AxrtPaymentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AxrtPaymentObjectData axrtPayUpdateIn;
/**
 *
 * Constructor to create a  AxrtPaymentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AxrtPaymentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentObjectData axrtPayUpdateInIn) {
    super(id, context, "AxrtPaymentUpdate");
    axrtPayUpdateIn = axrtPayUpdateInIn;
  }

  public void translateToMap() {
    if (axrtPayUpdateIn != null) {
      axrtPayUpdateIn.resetFlags(true, true);
      addInput("AxrtPayment", AxrtPaymentObjectHelper.toMap(axrtPayUpdateIn, new HashMap(), "AxrtPayment").get("AxrtPayment"));
    }
  }


/**
 *
 * Sets the AxrtPayment
 * @param axrtPayUpdateInIn Value of the axrtPayUpdateIn
 *
 */

  public void setAxrtPayment(AxrtPaymentObjectData axrtPayUpdateInIn) {
    axrtPayUpdateIn = axrtPayUpdateInIn;
  }

  public void translateFromMap() {
    axrtPayUpdateIn = AxrtPaymentObjectHelper.fromMap(inputMap, "AxrtPayment");
  }

/**
 *
 * Gets the AxrtPayment
 * @return Value of the AxrtPayment
 *
 */

  public AxrtPaymentObjectData getAxrtPayment( ) {
    return axrtPayUpdateIn;
  }

}
