/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AxrtPaymentProfileUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AxrtPaymentProfileUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AxrtPaymentProfileObjectData axrtppuIn;
/**
 *
 * Constructor to create a  AxrtPaymentProfileUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AxrtPaymentProfileUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppuInIn) {
    super(id, context, "AxrtPaymentProfileUpdate");
    axrtppuIn = axrtppuInIn;
  }

  public void translateToMap() {
    if (axrtppuIn != null) {
      axrtppuIn.resetFlags(true, true);
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(axrtppuIn, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }


/**
 *
 * Sets the AxrtPaymentProfile
 * @param axrtppuInIn Value of the axrtppuIn
 *
 */

  public void setAxrtPaymentProfile(AxrtPaymentProfileObjectData axrtppuInIn) {
    axrtppuIn = axrtppuInIn;
  }

  public void translateFromMap() {
    axrtppuIn = AxrtPaymentProfileObjectHelper.fromMap(inputMap, "AxrtPaymentProfile");
  }

/**
 *
 * Gets the AxrtPaymentProfile
 * @return Value of the AxrtPaymentProfile
 *
 */

  public AxrtPaymentProfileObjectData getAxrtPaymentProfile( ) {
    return axrtppuIn;
  }

}
