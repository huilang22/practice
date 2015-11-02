/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcRatingReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingReasonObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcRatingReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingReasonObjectFilter FindInIn) {
    super(id, context, "CtcRatingReasonFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(FindIn, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }


/**
 *
 * Sets the CtcRatingReason
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcRatingReason(CtcRatingReasonObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcRatingReasonObjectHelper.fromMapFilter(inputMap, "CtcRatingReason");
  }

/**
 *
 * Gets the CtcRatingReason
 * @return Value of the CtcRatingReason
 *
 */

  public CtcRatingReasonObjectFilter getCtcRatingReason( ) {
    return FindIn;
  }

}
