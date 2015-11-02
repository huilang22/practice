/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcFormatFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFormatFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFormatObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcFormatFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFormatFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatObjectFilter FindInIn) {
    super(id, context, "CtcFormatFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(FindIn, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }


/**
 *
 * Sets the CtcFormat
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcFormat(CtcFormatObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcFormatObjectHelper.fromMapFilter(inputMap, "CtcFormat");
  }

/**
 *
 * Gets the CtcFormat
 * @return Value of the CtcFormat
 *
 */

  public CtcFormatObjectFilter getCtcFormat( ) {
    return FindIn;
  }

}
