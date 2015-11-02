/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemRatingFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemRatingFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemRatingObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcItemRatingFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemRatingFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingObjectFilter FindInIn) {
    super(id, context, "CtcItemRatingFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItemRating", CtcItemRatingObjectHelper.toMap(FindIn, new HashMap(), "CtcItemRating").get("CtcItemRating"));
    }
  }


/**
 *
 * Sets the CtcItemRating
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcItemRating(CtcItemRatingObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcItemRatingObjectHelper.fromMapFilter(inputMap, "CtcItemRating");
  }

/**
 *
 * Gets the CtcItemRating
 * @return Value of the CtcItemRating
 *
 */

  public CtcItemRatingObjectFilter getCtcItemRating( ) {
    return FindIn;
  }

}
