/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsRateCenterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsRateCenterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsRateCenterObjectKeyData InvsRateCenterGetIn;
/**
 *
 * Constructor to create a  InvsRateCenterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsRateCenterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsRateCenterObjectKeyData InvsRateCenterGetInIn) {
    super(id, context, "InvsRateCenterGet");
    InvsRateCenterGetIn = InvsRateCenterGetInIn;
  }

  public void translateToMap() {
    if (InvsRateCenterGetIn != null) {
      InvsRateCenterGetIn.resetFlags(true, true);
      addInput("InvsRateCenter", InvsRateCenterObjectKeyHelper.toMap(InvsRateCenterGetIn, new HashMap(), "InvsRateCenterObjectKeyData").get("InvsRateCenterObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsRateCenter
 * @param InvsRateCenterGetInIn Value of the InvsRateCenterGetIn
 *
 */

  public void setInvsRateCenter(InvsRateCenterObjectKeyData InvsRateCenterGetInIn) {
    InvsRateCenterGetIn = InvsRateCenterGetInIn;
  }

  public void translateFromMap() {
    InvsRateCenterGetIn = InvsRateCenterObjectKeyHelper.fromMap(inputMap, "InvsRateCenter");
  }

/**
 *
 * Gets the InvsRateCenter
 * @return Value of the InvsRateCenter
 *
 */

  public InvsRateCenterObjectKeyData getInvsRateCenter( ) {
    return InvsRateCenterGetIn;
  }

}
