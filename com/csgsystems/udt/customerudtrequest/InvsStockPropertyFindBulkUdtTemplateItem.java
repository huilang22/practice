/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropertyFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsStockPropertyFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStockPropertyFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStockPropertyObjectFilter InvsStockPropertyFindIn;
/**
 *
 * Constructor to create a  InvsStockPropertyFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStockPropertyFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropertyObjectFilter InvsStockPropertyFindInIn) {
    super(id, context, "InvsStockPropertyFind");
    InvsStockPropertyFindIn = InvsStockPropertyFindInIn;
  }

  public void translateToMap() {
    if (InvsStockPropertyFindIn != null) {
      Integer index =  InvsStockPropertyFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(InvsStockPropertyFindIn, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }


/**
 *
 * Sets the InvsStockProperty
 * @param InvsStockPropertyFindInIn Value of the InvsStockPropertyFindIn
 *
 */

  public void setInvsStockProperty(InvsStockPropertyObjectFilter InvsStockPropertyFindInIn) {
    InvsStockPropertyFindIn = InvsStockPropertyFindInIn;
  }

  public void translateFromMap() {
    InvsStockPropertyFindIn = InvsStockPropertyObjectHelper.fromMapFilter(inputMap, "InvsStockProperty");
  }

/**
 *
 * Gets the InvsStockProperty
 * @return Value of the InvsStockProperty
 *
 */

  public InvsStockPropertyObjectFilter getInvsStockProperty( ) {
    return InvsStockPropertyFindIn;
  }

}
