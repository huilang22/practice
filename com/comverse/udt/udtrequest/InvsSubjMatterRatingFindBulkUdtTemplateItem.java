/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsSubjMatterRatingFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSubjMatterRatingFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSubjMatterRatingObjectFilter InvsSubjMatterRatingFindIn;
/**
 *
 * Constructor to create a  InvsSubjMatterRatingFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSubjMatterRatingFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSubjMatterRatingObjectFilter InvsSubjMatterRatingFindInIn) {
    super(id, context, "InvsSubjMatterRatingFind");
    InvsSubjMatterRatingFindIn = InvsSubjMatterRatingFindInIn;
  }

  public void translateToMap() {
    if (InvsSubjMatterRatingFindIn != null) {
      Integer index =  InvsSubjMatterRatingFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(InvsSubjMatterRatingFindIn, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }


/**
 *
 * Sets the InvsSubjMatterRating
 * @param InvsSubjMatterRatingFindInIn Value of the InvsSubjMatterRatingFindIn
 *
 */

  public void setInvsSubjMatterRating(InvsSubjMatterRatingObjectFilter InvsSubjMatterRatingFindInIn) {
    InvsSubjMatterRatingFindIn = InvsSubjMatterRatingFindInIn;
  }

  public void translateFromMap() {
    InvsSubjMatterRatingFindIn = InvsSubjMatterRatingObjectHelper.fromMapFilter(inputMap, "InvsSubjMatterRating");
  }

/**
 *
 * Gets the InvsSubjMatterRating
 * @return Value of the InvsSubjMatterRating
 *
 */

  public InvsSubjMatterRatingObjectFilter getInvsSubjMatterRating( ) {
    return InvsSubjMatterRatingFindIn;
  }

}
