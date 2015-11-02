/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonGetBulkUdtTemplateItem.java
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
 * Class used to create a AdjustmentReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentReasonObjectKeyData ARGetIn;
/**
 *
 * Constructor to create a  AdjustmentReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentReasonObjectKeyData ARGetInIn) {
    super(id, context, "AdjustmentReasonGet");
    ARGetIn = ARGetInIn;
  }

  public void translateToMap() {
    if (ARGetIn != null) {
      ARGetIn.resetFlags(true, true);
      addInput("AdjustmentReason", AdjustmentReasonObjectKeyHelper.toMap(ARGetIn, new HashMap(), "AdjustmentReasonObjectKeyData").get("AdjustmentReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the AdjustmentReason
 * @param ARGetInIn Value of the ARGetIn
 *
 */

  public void setAdjustmentReason(AdjustmentReasonObjectKeyData ARGetInIn) {
    ARGetIn = ARGetInIn;
  }

  public void translateFromMap() {
    ARGetIn = AdjustmentReasonObjectKeyHelper.fromMap(inputMap, "AdjustmentReason");
  }

/**
 *
 * Gets the AdjustmentReason
 * @return Value of the AdjustmentReason
 *
 */

  public AdjustmentReasonObjectKeyData getAdjustmentReason( ) {
    return ARGetIn;
  }

}
