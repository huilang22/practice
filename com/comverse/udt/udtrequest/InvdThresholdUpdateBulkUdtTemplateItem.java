/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvdThresholdUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdThresholdUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdThresholdObjectData InvdThresholdUpdateIn;
/**
 *
 * Constructor to create a  InvdThresholdUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdThresholdUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdThresholdObjectData InvdThresholdUpdateInIn) {
    super(id, context, "InvdThresholdUpdate");
    InvdThresholdUpdateIn = InvdThresholdUpdateInIn;
  }

  public void translateToMap() {
    if (InvdThresholdUpdateIn != null) {
      InvdThresholdUpdateIn.resetFlags(true, true);
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(InvdThresholdUpdateIn, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }


/**
 *
 * Sets the InvdThreshold
 * @param InvdThresholdUpdateInIn Value of the InvdThresholdUpdateIn
 *
 */

  public void setInvdThreshold(InvdThresholdObjectData InvdThresholdUpdateInIn) {
    InvdThresholdUpdateIn = InvdThresholdUpdateInIn;
  }

  public void translateFromMap() {
    InvdThresholdUpdateIn = InvdThresholdObjectHelper.fromMap(inputMap, "InvdThreshold");
  }

/**
 *
 * Gets the InvdThreshold
 * @return Value of the InvdThreshold
 *
 */

  public InvdThresholdObjectData getInvdThreshold( ) {
    return InvdThresholdUpdateIn;
  }

}
