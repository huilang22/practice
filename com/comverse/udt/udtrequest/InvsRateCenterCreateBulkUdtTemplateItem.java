/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsRateCenterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsRateCenterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsRateCenterObjectData InvsRateCenterCreateIn;
/**
 *
 * Constructor to create a  InvsRateCenterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsRateCenterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsRateCenterObjectData InvsRateCenterCreateInIn) {
    super(id, context, "InvsRateCenterCreate");
    InvsRateCenterCreateIn = InvsRateCenterCreateInIn;
  }

  public void translateToMap() {
    if (InvsRateCenterCreateIn != null) {
      InvsRateCenterCreateIn.resetFlags(true, true);
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(InvsRateCenterCreateIn, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }


/**
 *
 * Sets the InvsRateCenter
 * @param InvsRateCenterCreateInIn Value of the InvsRateCenterCreateIn
 *
 */

  public void setInvsRateCenter(InvsRateCenterObjectData InvsRateCenterCreateInIn) {
    InvsRateCenterCreateIn = InvsRateCenterCreateInIn;
  }

  public void translateFromMap() {
    InvsRateCenterCreateIn = InvsRateCenterObjectHelper.fromMap(inputMap, "InvsRateCenter");
  }

/**
 *
 * Gets the InvsRateCenter
 * @return Value of the InvsRateCenter
 *
 */

  public InvsRateCenterObjectData getInvsRateCenter( ) {
    return InvsRateCenterCreateIn;
  }

}
