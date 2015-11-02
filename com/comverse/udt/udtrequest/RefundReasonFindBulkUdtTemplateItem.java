/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a RefundReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundReasonObjectFilter RRFindIn;
/**
 *
 * Constructor to create a  RefundReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundReasonObjectFilter RRFindInIn) {
    super(id, context, "RefundReasonFind");
    RRFindIn = RRFindInIn;
  }

  public void translateToMap() {
    if (RRFindIn != null) {
      Integer index =  RRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RefundReason", RefundReasonObjectHelper.toMap(RRFindIn, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }


/**
 *
 * Sets the RefundReason
 * @param RRFindInIn Value of the RRFindIn
 *
 */

  public void setRefundReason(RefundReasonObjectFilter RRFindInIn) {
    RRFindIn = RRFindInIn;
  }

  public void translateFromMap() {
    RRFindIn = RefundReasonObjectHelper.fromMapFilter(inputMap, "RefundReason");
  }

/**
 *
 * Gets the RefundReason
 * @return Value of the RefundReason
 *
 */

  public RefundReasonObjectFilter getRefundReason( ) {
    return RRFindIn;
  }

}
