/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcItemUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemObjectData UpdateInIn) {
    super(id, context, "CtcItemUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcItem", CtcItemObjectHelper.toMap(UpdateIn, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }


/**
 *
 * Sets the CtcItem
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcItem(CtcItemObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcItemObjectHelper.fromMap(inputMap, "CtcItem");
  }

/**
 *
 * Gets the CtcItem
 * @return Value of the CtcItem
 *
 */

  public CtcItemObjectData getCtcItem( ) {
    return UpdateIn;
  }

}
