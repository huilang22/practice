/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a ProductGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductGroupObjectData pgCrIn;
/**
 *
 * Constructor to create a  ProductGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductGroupObjectData pgCrInIn) {
    super(id, context, "ProductGroupCreate");
    pgCrIn = pgCrInIn;
  }

  public void translateToMap() {
    if (pgCrIn != null) {
      pgCrIn.resetFlags(true, true);
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(pgCrIn, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }


/**
 *
 * Sets the ProductGroup
 * @param pgCrInIn Value of the pgCrIn
 *
 */

  public void setProductGroup(ProductGroupObjectData pgCrInIn) {
    pgCrIn = pgCrInIn;
  }

  public void translateFromMap() {
    pgCrIn = ProductGroupObjectHelper.fromMap(inputMap, "ProductGroup");
  }

/**
 *
 * Gets the ProductGroup
 * @return Value of the ProductGroup
 *
 */

  public ProductGroupObjectData getProductGroup( ) {
    return pgCrIn;
  }

}
