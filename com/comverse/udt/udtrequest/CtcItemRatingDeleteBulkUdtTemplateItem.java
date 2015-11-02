/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemRatingDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemRatingDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemRatingObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcItemRatingDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemRatingDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingObjectKeyData DeleteInIn) {
    super(id, context, "CtcItemRatingDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcItemRating", CtcItemRatingObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemRatingObjectKeyData").get("CtcItemRatingObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItemRating
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcItemRating(CtcItemRatingObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcItemRatingObjectKeyHelper.fromMap(inputMap, "CtcItemRating");
  }

/**
 *
 * Gets the CtcItemRating
 * @return Value of the CtcItemRating
 *
 */

  public CtcItemRatingObjectKeyData getCtcItemRating( ) {
    return DeleteIn;
  }

}
