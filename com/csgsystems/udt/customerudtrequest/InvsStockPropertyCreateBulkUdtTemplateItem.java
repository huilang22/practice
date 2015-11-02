/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropertyCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsStockPropertyCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStockPropertyCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStockPropertyObjectData InvsStockPropertyCreateIn;
/**
 *
 * Constructor to create a  InvsStockPropertyCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStockPropertyCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropertyObjectData InvsStockPropertyCreateInIn) {
    super(id, context, "InvsStockPropertyCreate");
    InvsStockPropertyCreateIn = InvsStockPropertyCreateInIn;
  }

  public void translateToMap() {
    if (InvsStockPropertyCreateIn != null) {
      InvsStockPropertyCreateIn.resetFlags(true, true);
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(InvsStockPropertyCreateIn, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }


/**
 *
 * Sets the InvsStockProperty
 * @param InvsStockPropertyCreateInIn Value of the InvsStockPropertyCreateIn
 *
 */

  public void setInvsStockProperty(InvsStockPropertyObjectData InvsStockPropertyCreateInIn) {
    InvsStockPropertyCreateIn = InvsStockPropertyCreateInIn;
  }

  public void translateFromMap() {
    InvsStockPropertyCreateIn = InvsStockPropertyObjectHelper.fromMap(inputMap, "InvsStockProperty");
  }

/**
 *
 * Gets the InvsStockProperty
 * @return Value of the InvsStockProperty
 *
 */

  public InvsStockPropertyObjectData getInvsStockProperty( ) {
    return InvsStockPropertyCreateIn;
  }

}
