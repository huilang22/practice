/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcItemFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemObjectFilter FindInIn) {
    super(id, context, "CtcItemFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItem", CtcItemObjectHelper.toMap(FindIn, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }


/**
 *
 * Sets the CtcItem
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcItem(CtcItemObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcItemObjectHelper.fromMapFilter(inputMap, "CtcItem");
  }

/**
 *
 * Gets the CtcItem
 * @return Value of the CtcItem
 *
 */

  public CtcItemObjectFilter getCtcItem( ) {
    return FindIn;
  }

}
