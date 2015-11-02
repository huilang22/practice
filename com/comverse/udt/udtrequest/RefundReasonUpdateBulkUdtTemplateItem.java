/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RefundReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundReasonObjectData RRUpdateIn;
/**
 *
 * Constructor to create a  RefundReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundReasonObjectData RRUpdateInIn) {
    super(id, context, "RefundReasonUpdate");
    RRUpdateIn = RRUpdateInIn;
  }

  public void translateToMap() {
    if (RRUpdateIn != null) {
      RRUpdateIn.resetFlags(true, true);
      addInput("RefundReason", RefundReasonObjectHelper.toMap(RRUpdateIn, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }


/**
 *
 * Sets the RefundReason
 * @param RRUpdateInIn Value of the RRUpdateIn
 *
 */

  public void setRefundReason(RefundReasonObjectData RRUpdateInIn) {
    RRUpdateIn = RRUpdateInIn;
  }

  public void translateFromMap() {
    RRUpdateIn = RefundReasonObjectHelper.fromMap(inputMap, "RefundReason");
  }

/**
 *
 * Gets the RefundReason
 * @return Value of the RefundReason
 *
 */

  public RefundReasonObjectData getRefundReason( ) {
    return RRUpdateIn;
  }

}
