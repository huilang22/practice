/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingCreateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsSubjMatterRatingCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSubjMatterRatingCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSubjMatterRatingObjectData InvsSubjMatterRatingCreateIn;
/**
 *
 * Constructor to create a  InvsSubjMatterRatingCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSubjMatterRatingCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSubjMatterRatingObjectData InvsSubjMatterRatingCreateInIn) {
    super(id, context, "InvsSubjMatterRatingCreate");
    InvsSubjMatterRatingCreateIn = InvsSubjMatterRatingCreateInIn;
  }

  public void translateToMap() {
    if (InvsSubjMatterRatingCreateIn != null) {
      InvsSubjMatterRatingCreateIn.resetFlags(true, true);
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(InvsSubjMatterRatingCreateIn, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }


/**
 *
 * Sets the InvsSubjMatterRating
 * @param InvsSubjMatterRatingCreateInIn Value of the InvsSubjMatterRatingCreateIn
 *
 */

  public void setInvsSubjMatterRating(InvsSubjMatterRatingObjectData InvsSubjMatterRatingCreateInIn) {
    InvsSubjMatterRatingCreateIn = InvsSubjMatterRatingCreateInIn;
  }

  public void translateFromMap() {
    InvsSubjMatterRatingCreateIn = InvsSubjMatterRatingObjectHelper.fromMap(inputMap, "InvsSubjMatterRating");
  }

/**
 *
 * Gets the InvsSubjMatterRating
 * @return Value of the InvsSubjMatterRating
 *
 */

  public InvsSubjMatterRatingObjectData getInvsSubjMatterRating( ) {
    return InvsSubjMatterRatingCreateIn;
  }

}
