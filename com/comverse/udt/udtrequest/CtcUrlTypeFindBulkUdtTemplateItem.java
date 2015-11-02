/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcUrlTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcUrlTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcUrlTypeObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcUrlTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcUrlTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcUrlTypeObjectFilter FindInIn) {
    super(id, context, "CtcUrlTypeFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(FindIn, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }


/**
 *
 * Sets the CtcUrlType
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcUrlType(CtcUrlTypeObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcUrlTypeObjectHelper.fromMapFilter(inputMap, "CtcUrlType");
  }

/**
 *
 * Gets the CtcUrlType
 * @return Value of the CtcUrlType
 *
 */

  public CtcUrlTypeObjectFilter getCtcUrlType( ) {
    return FindIn;
  }

}
