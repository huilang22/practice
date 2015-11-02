/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentGetBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectKeyData getIn;
/**
 *
 * Constructor to create a  AdjustmentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectKeyData getInIn) {
    super(id, context, "AdjustmentGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("Adjustment", AdjustmentObjectKeyHelper.toMap(getIn, new HashMap(), "AdjustmentObjectKeyData").get("AdjustmentObjectKeyData"));
    }
  }


/**
 *
 * Sets the Adjustment
 * @param getInIn Value of the getIn
 *
 */

  public void setAdjustment(AdjustmentObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = AdjustmentObjectKeyHelper.fromMap(inputMap, "Adjustment");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectKeyData getAdjustment( ) {
    return getIn;
  }

}
