/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemRatingGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemRatingGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemRatingObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcItemRatingGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemRatingGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingObjectKeyData GetInIn) {
    super(id, context, "CtcItemRatingGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcItemRating", CtcItemRatingObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemRatingObjectKeyData").get("CtcItemRatingObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItemRating
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcItemRating(CtcItemRatingObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcItemRatingObjectKeyHelper.fromMap(inputMap, "CtcItemRating");
  }

/**
 *
 * Gets the CtcItemRating
 * @return Value of the CtcItemRating
 *
 */

  public CtcItemRatingObjectKeyData getCtcItemRating( ) {
    return GetIn;
  }

}
