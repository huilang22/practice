/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemFormatFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemFormatFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemFormatObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcItemFormatFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemFormatFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemFormatObjectFilter FindInIn) {
    super(id, context, "CtcItemFormatFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(FindIn, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }


/**
 *
 * Sets the CtcItemFormat
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcItemFormat(CtcItemFormatObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcItemFormatObjectHelper.fromMapFilter(inputMap, "CtcItemFormat");
  }

/**
 *
 * Gets the CtcItemFormat
 * @return Value of the CtcItemFormat
 *
 */

  public CtcItemFormatObjectFilter getCtcItemFormat( ) {
    return FindIn;
  }

}
