/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentTransUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AxrtPaymentTransUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AxrtPaymentTransUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AxrtPaymentTransObjectData AxrtPayTransUpdateIn;
/**
 *
 * Constructor to create a  AxrtPaymentTransUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AxrtPaymentTransUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentTransObjectData AxrtPayTransUpdateInIn) {
    super(id, context, "AxrtPaymentTransUpdate");
    AxrtPayTransUpdateIn = AxrtPayTransUpdateInIn;
  }

  public void translateToMap() {
    if (AxrtPayTransUpdateIn != null) {
      AxrtPayTransUpdateIn.resetFlags(true, true);
      addInput("AxrtPaymentTrans", AxrtPaymentTransObjectHelper.toMap(AxrtPayTransUpdateIn, new HashMap(), "AxrtPaymentTrans").get("AxrtPaymentTrans"));
    }
  }


/**
 *
 * Sets the AxrtPaymentTrans
 * @param AxrtPayTransUpdateInIn Value of the AxrtPayTransUpdateIn
 *
 */

  public void setAxrtPaymentTrans(AxrtPaymentTransObjectData AxrtPayTransUpdateInIn) {
    AxrtPayTransUpdateIn = AxrtPayTransUpdateInIn;
  }

  public void translateFromMap() {
    AxrtPayTransUpdateIn = AxrtPaymentTransObjectHelper.fromMap(inputMap, "AxrtPaymentTrans");
  }

/**
 *
 * Gets the AxrtPaymentTrans
 * @return Value of the AxrtPaymentTrans
 *
 */

  public AxrtPaymentTransObjectData getAxrtPaymentTrans( ) {
    return AxrtPayTransUpdateIn;
  }

}
