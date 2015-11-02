/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvdThresholdCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdThresholdCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdThresholdObjectData InvdThresholdCreateIn;
/**
 *
 * Constructor to create a  InvdThresholdCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdThresholdCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdThresholdObjectData InvdThresholdCreateInIn) {
    super(id, context, "InvdThresholdCreate");
    InvdThresholdCreateIn = InvdThresholdCreateInIn;
  }

  public void translateToMap() {
    if (InvdThresholdCreateIn != null) {
      InvdThresholdCreateIn.resetFlags(true, true);
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(InvdThresholdCreateIn, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }


/**
 *
 * Sets the InvdThreshold
 * @param InvdThresholdCreateInIn Value of the InvdThresholdCreateIn
 *
 */

  public void setInvdThreshold(InvdThresholdObjectData InvdThresholdCreateInIn) {
    InvdThresholdCreateIn = InvdThresholdCreateInIn;
  }

  public void translateFromMap() {
    InvdThresholdCreateIn = InvdThresholdObjectHelper.fromMap(inputMap, "InvdThreshold");
  }

/**
 *
 * Gets the InvdThreshold
 * @return Value of the InvdThreshold
 *
 */

  public InvdThresholdObjectData getInvdThreshold( ) {
    return InvdThresholdCreateIn;
  }

}
