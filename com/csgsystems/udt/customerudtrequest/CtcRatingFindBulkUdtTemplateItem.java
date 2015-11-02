/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a CtcRatingFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcRatingFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingObjectFilter FindInIn) {
    super(id, context, "CtcRatingFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcRating", CtcRatingObjectHelper.toMap(FindIn, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }


/**
 *
 * Sets the CtcRating
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcRating(CtcRatingObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcRatingObjectHelper.fromMapFilter(inputMap, "CtcRating");
  }

/**
 *
 * Gets the CtcRating
 * @return Value of the CtcRating
 *
 */

  public CtcRatingObjectFilter getCtcRating( ) {
    return FindIn;
  }

}
