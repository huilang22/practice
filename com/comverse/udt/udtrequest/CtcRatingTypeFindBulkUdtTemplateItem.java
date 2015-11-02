/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcRatingTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingTypeObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcRatingTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingTypeObjectFilter FindInIn) {
    super(id, context, "CtcRatingTypeFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(FindIn, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }


/**
 *
 * Sets the CtcRatingType
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcRatingType(CtcRatingTypeObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcRatingTypeObjectHelper.fromMapFilter(inputMap, "CtcRatingType");
  }

/**
 *
 * Gets the CtcRatingType
 * @return Value of the CtcRatingType
 *
 */

  public CtcRatingTypeObjectFilter getCtcRatingType( ) {
    return FindIn;
  }

}
