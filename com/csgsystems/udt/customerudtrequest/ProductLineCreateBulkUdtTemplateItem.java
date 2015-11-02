/*
 * Generated code DO NOT EDIT
 * Generated file: ProductLineCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ProductLineCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductLineCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductLineObjectData plCrIn;
/**
 *
 * Constructor to create a  ProductLineCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductLineCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductLineObjectData plCrInIn) {
    super(id, context, "ProductLineCreate");
    plCrIn = plCrInIn;
  }

  public void translateToMap() {
    if (plCrIn != null) {
      plCrIn.resetFlags(true, true);
      addInput("ProductLine", ProductLineObjectHelper.toMap(plCrIn, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }


/**
 *
 * Sets the ProductLine
 * @param plCrInIn Value of the plCrIn
 *
 */

  public void setProductLine(ProductLineObjectData plCrInIn) {
    plCrIn = plCrInIn;
  }

  public void translateFromMap() {
    plCrIn = ProductLineObjectHelper.fromMap(inputMap, "ProductLine");
  }

/**
 *
 * Gets the ProductLine
 * @return Value of the ProductLine
 *
 */

  public ProductLineObjectData getProductLine( ) {
    return plCrIn;
  }

}
