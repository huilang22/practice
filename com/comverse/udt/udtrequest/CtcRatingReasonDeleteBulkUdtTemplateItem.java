/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcRatingReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingReasonObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcRatingReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingReasonObjectKeyData DeleteInIn) {
    super(id, context, "CtcRatingReasonDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcRatingReason", CtcRatingReasonObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcRatingReasonObjectKeyData").get("CtcRatingReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcRatingReason
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcRatingReason(CtcRatingReasonObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcRatingReasonObjectKeyHelper.fromMap(inputMap, "CtcRatingReason");
  }

/**
 *
 * Gets the CtcRatingReason
 * @return Value of the CtcRatingReason
 *
 */

  public CtcRatingReasonObjectKeyData getCtcRatingReason( ) {
    return DeleteIn;
  }

}
