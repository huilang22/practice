/*
 * Generated code DO NOT EDIT
 * Generated file: ProductLineFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductLineFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductLineFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductLineObjectFilter pgFindIn;
/**
 *
 * Constructor to create a  ProductLineFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductLineFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductLineObjectFilter pgFindInIn) {
    super(id, context, "ProductLineFind");
    pgFindIn = pgFindInIn;
  }

  public void translateToMap() {
    if (pgFindIn != null) {
      Integer index =  pgFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductLine", ProductLineObjectHelper.toMap(pgFindIn, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }


/**
 *
 * Sets the ProductLine
 * @param pgFindInIn Value of the pgFindIn
 *
 */

  public void setProductLine(ProductLineObjectFilter pgFindInIn) {
    pgFindIn = pgFindInIn;
  }

  public void translateFromMap() {
    pgFindIn = ProductLineObjectHelper.fromMapFilter(inputMap, "ProductLine");
  }

/**
 *
 * Gets the ProductLine
 * @return Value of the ProductLine
 *
 */

  public ProductLineObjectFilter getProductLine( ) {
    return pgFindIn;
  }

}
