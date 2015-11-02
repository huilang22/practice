/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementCreateBulkUdtTemplateItem.java
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
 * Class used to create a ProductElementCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductElementCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductElementObjectData peCrIn;
/**
 *
 * Constructor to create a  ProductElementCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductElementCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementObjectData peCrInIn) {
    super(id, context, "ProductElementCreate");
    peCrIn = peCrInIn;
  }

  public void translateToMap() {
    if (peCrIn != null) {
      peCrIn.resetFlags(true, true);
      addInput("ProductElement", ProductElementObjectHelper.toMap(peCrIn, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }


/**
 *
 * Sets the ProductElement
 * @param peCrInIn Value of the peCrIn
 *
 */

  public void setProductElement(ProductElementObjectData peCrInIn) {
    peCrIn = peCrInIn;
  }

  public void translateFromMap() {
    peCrIn = ProductElementObjectHelper.fromMap(inputMap, "ProductElement");
  }

/**
 *
 * Gets the ProductElement
 * @return Value of the ProductElement
 *
 */

  public ProductElementObjectData getProductElement( ) {
    return peCrIn;
  }

}
