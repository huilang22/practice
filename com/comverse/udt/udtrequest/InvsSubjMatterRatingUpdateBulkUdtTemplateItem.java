/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSubjMatterRatingUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSubjMatterRatingUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSubjMatterRatingObjectData InvsSubjMatterRatingUpdateIn;
/**
 *
 * Constructor to create a  InvsSubjMatterRatingUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSubjMatterRatingUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSubjMatterRatingObjectData InvsSubjMatterRatingUpdateInIn) {
    super(id, context, "InvsSubjMatterRatingUpdate");
    InvsSubjMatterRatingUpdateIn = InvsSubjMatterRatingUpdateInIn;
  }

  public void translateToMap() {
    if (InvsSubjMatterRatingUpdateIn != null) {
      InvsSubjMatterRatingUpdateIn.resetFlags(true, true);
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(InvsSubjMatterRatingUpdateIn, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }


/**
 *
 * Sets the InvsSubjMatterRating
 * @param InvsSubjMatterRatingUpdateInIn Value of the InvsSubjMatterRatingUpdateIn
 *
 */

  public void setInvsSubjMatterRating(InvsSubjMatterRatingObjectData InvsSubjMatterRatingUpdateInIn) {
    InvsSubjMatterRatingUpdateIn = InvsSubjMatterRatingUpdateInIn;
  }

  public void translateFromMap() {
    InvsSubjMatterRatingUpdateIn = InvsSubjMatterRatingObjectHelper.fromMap(inputMap, "InvsSubjMatterRating");
  }

/**
 *
 * Gets the InvsSubjMatterRating
 * @return Value of the InvsSubjMatterRating
 *
 */

  public InvsSubjMatterRatingObjectData getInvsSubjMatterRating( ) {
    return InvsSubjMatterRatingUpdateIn;
  }

}
