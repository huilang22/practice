/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsThresholdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsThresholdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsThresholdObjectKeyData InvsThresholdGetIn;
/**
 *
 * Constructor to create a  InvsThresholdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsThresholdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsThresholdObjectKeyData InvsThresholdGetInIn) {
    super(id, context, "InvsThresholdGet");
    InvsThresholdGetIn = InvsThresholdGetInIn;
  }

  public void translateToMap() {
    if (InvsThresholdGetIn != null) {
      InvsThresholdGetIn.resetFlags(true, true);
      addInput("InvsThreshold", InvsThresholdObjectKeyHelper.toMap(InvsThresholdGetIn, new HashMap(), "InvsThresholdObjectKeyData").get("InvsThresholdObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsThreshold
 * @param InvsThresholdGetInIn Value of the InvsThresholdGetIn
 *
 */

  public void setInvsThreshold(InvsThresholdObjectKeyData InvsThresholdGetInIn) {
    InvsThresholdGetIn = InvsThresholdGetInIn;
  }

  public void translateFromMap() {
    InvsThresholdGetIn = InvsThresholdObjectKeyHelper.fromMap(inputMap, "InvsThreshold");
  }

/**
 *
 * Gets the InvsThreshold
 * @return Value of the InvsThreshold
 *
 */

  public InvsThresholdObjectKeyData getInvsThreshold( ) {
    return InvsThresholdGetIn;
  }

}
