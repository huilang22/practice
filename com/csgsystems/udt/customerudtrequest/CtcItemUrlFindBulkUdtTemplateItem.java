/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemUrlFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemUrlFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemUrlFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemUrlObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcItemUrlFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemUrlFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemUrlObjectFilter FindInIn) {
    super(id, context, "CtcItemUrlFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(FindIn, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }


/**
 *
 * Sets the CtcItemUrl
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcItemUrl(CtcItemUrlObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcItemUrlObjectHelper.fromMapFilter(inputMap, "CtcItemUrl");
  }

/**
 *
 * Gets the CtcItemUrl
 * @return Value of the CtcItemUrl
 *
 */

  public CtcItemUrlObjectFilter getCtcItemUrl( ) {
    return FindIn;
  }

}
