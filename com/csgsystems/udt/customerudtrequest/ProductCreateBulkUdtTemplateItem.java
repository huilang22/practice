/*
 * Generated code DO NOT EDIT
 * Generated file: ProductCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ProductCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectBaseData ProductCreate2In;
/**
 *
 * Constructor to create a  ProductCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectBaseData ProductCreate2InIn) {
    super(id, context, "ProductCreate");
    ProductCreate2In = ProductCreate2InIn;
  }

  public void translateToMap() {
    if (ProductCreate2In != null) {
      ProductCreate2In.resetFlags(true, true);
      addInput("Product", ProductObjectBaseHelper.toMap(ProductCreate2In, new HashMap(), "Product").get("Product"));
    }
  }


/**
 *
 * Sets the Product
 * @param ProductCreate2InIn Value of the ProductCreate2In
 *
 */

  public void setProduct(ProductObjectBaseData ProductCreate2InIn) {
    ProductCreate2In = ProductCreate2InIn;
  }

  public void translateFromMap() {
    ProductCreate2In = ProductObjectBaseHelper.fromMap(inputMap, "Product");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectBaseData getProduct( ) {
    return ProductCreate2In;
  }

}
