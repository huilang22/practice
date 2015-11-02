/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemUpdateBulkUdtTemplateItem.java
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
