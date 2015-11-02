/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileCreateBulkUdtTemplateItem.java
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
 * Class used to create a AxrtPaymentProfileCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AxrtPaymentProfileCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AxrtPaymentProfileObjectData axrtppcIn;
/**
 *
 * Constructor to create a  AxrtPaymentProfileCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AxrtPaymentProfileCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppcInIn) {
    super(id, context, "AxrtPaymentProfileCreate");
    axrtppcIn = axrtppcInIn;
  }

  public void translateToMap() {
    if (axrtppcIn != null) {
      axrtppcIn.resetFlags(true, true);
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(axrtppcIn, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }


/**
 *
 * Sets the AxrtPaymentProfile
 * @param axrtppcInIn Value of the axrtppcIn
 *
 */

  public void setAxrtPaymentProfile(AxrtPaymentProfileObjectData axrtppcInIn) {
    axrtppcIn = axrtppcInIn;
  }

  public void translateFromMap() {
    axrtppcIn = AxrtPaymentProfileObjectHelper.fromMap(inputMap, "AxrtPaymentProfile");
  }

/**
 *
 * Gets the AxrtPaymentProfile
 * @return Value of the AxrtPaymentProfile
 *
 */

  public AxrtPaymentProfileObjectData getAxrtPaymentProfile( ) {
    return axrtppcIn;
  }

}
