/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemRatingReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemRatingReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemRatingReasonObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcItemRatingReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemRatingReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingReasonObjectKeyData GetInIn) {
    super(id, context, "CtcItemRatingReasonGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemRatingReasonObjectKeyData").get("CtcItemRatingReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItemRatingReason
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcItemRatingReason(CtcItemRatingReasonObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcItemRatingReasonObjectKeyHelper.fromMap(inputMap, "CtcItemRatingReason");
  }

/**
 *
 * Gets the CtcItemRatingReason
 * @return Value of the CtcItemRatingReason
 *
 */

  public CtcItemRatingReasonObjectKeyData getCtcItemRatingReason( ) {
    return GetIn;
  }

}
