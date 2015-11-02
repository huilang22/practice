/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemRatingCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemRatingCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemRatingObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcItemRatingCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemRatingCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingObjectData CreateInIn) {
    super(id, context, "CtcItemRatingCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcItemRating", CtcItemRatingObjectHelper.toMap(CreateIn, new HashMap(), "CtcItemRating").get("CtcItemRating"));
    }
  }


/**
 *
 * Sets the CtcItemRating
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcItemRating(CtcItemRatingObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcItemRatingObjectHelper.fromMap(inputMap, "CtcItemRating");
  }

/**
 *
 * Gets the CtcItemRating
 * @return Value of the CtcItemRating
 *
 */

  public CtcItemRatingObjectData getCtcItemRating( ) {
    return CreateIn;
  }

}
