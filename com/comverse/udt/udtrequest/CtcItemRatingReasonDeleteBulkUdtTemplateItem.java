/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemRatingReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemRatingReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemRatingReasonObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcItemRatingReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemRatingReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingReasonObjectKeyData DeleteInIn) {
    super(id, context, "CtcItemRatingReasonDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemRatingReasonObjectKeyData").get("CtcItemRatingReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItemRatingReason
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcItemRatingReason(CtcItemRatingReasonObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcItemRatingReasonObjectKeyHelper.fromMap(inputMap, "CtcItemRatingReason");
  }

/**
 *
 * Gets the CtcItemRatingReason
 * @return Value of the CtcItemRatingReason
 *
 */

  public CtcItemRatingReasonObjectKeyData getCtcItemRatingReason( ) {
    return DeleteIn;
  }

}
