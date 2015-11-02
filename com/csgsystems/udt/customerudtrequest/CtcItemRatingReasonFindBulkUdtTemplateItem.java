/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRatingReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemRatingReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemRatingReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemRatingReasonObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcItemRatingReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemRatingReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingReasonObjectFilter FindInIn) {
    super(id, context, "CtcItemRatingReasonFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(FindIn, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }


/**
 *
 * Sets the CtcItemRatingReason
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcItemRatingReason(CtcItemRatingReasonObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcItemRatingReasonObjectHelper.fromMapFilter(inputMap, "CtcItemRatingReason");
  }

/**
 *
 * Gets the CtcItemRatingReason
 * @return Value of the CtcItemRatingReason
 *
 */

  public CtcItemRatingReasonObjectFilter getCtcItemRatingReason( ) {
    return FindIn;
  }

}
