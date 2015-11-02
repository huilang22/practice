/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a RefundReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundReasonObjectData RRCreateIn;
/**
 *
 * Constructor to create a  RefundReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundReasonObjectData RRCreateInIn) {
    super(id, context, "RefundReasonCreate");
    RRCreateIn = RRCreateInIn;
  }

  public void translateToMap() {
    if (RRCreateIn != null) {
      RRCreateIn.resetFlags(true, true);
      addInput("RefundReason", RefundReasonObjectHelper.toMap(RRCreateIn, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }


/**
 *
 * Sets the RefundReason
 * @param RRCreateInIn Value of the RRCreateIn
 *
 */

  public void setRefundReason(RefundReasonObjectData RRCreateInIn) {
    RRCreateIn = RRCreateInIn;
  }

  public void translateFromMap() {
    RRCreateIn = RefundReasonObjectHelper.fromMap(inputMap, "RefundReason");
  }

/**
 *
 * Gets the RefundReason
 * @return Value of the RefundReason
 *
 */

  public RefundReasonObjectData getRefundReason( ) {
    return RRCreateIn;
  }

}
