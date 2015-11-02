/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferCategoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferCategoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferCategoryObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcOfferCategoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferCategoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferCategoryObjectFilter FindInIn) {
    super(id, context, "CtcOfferCategoryFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(FindIn, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }


/**
 *
 * Sets the CtcOfferCategory
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcOfferCategory(CtcOfferCategoryObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcOfferCategoryObjectHelper.fromMapFilter(inputMap, "CtcOfferCategory");
  }

/**
 *
 * Gets the CtcOfferCategory
 * @return Value of the CtcOfferCategory
 *
 */

  public CtcOfferCategoryObjectFilter getCtcOfferCategory( ) {
    return FindIn;
  }

}
