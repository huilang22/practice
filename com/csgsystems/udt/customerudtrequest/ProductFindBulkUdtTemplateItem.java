/*
 * Generated code DO NOT EDIT
 * Generated file: ProductFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectBaseFilter ProductFindIn;
/**
 *
 * Constructor to create a  ProductFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectBaseFilter ProductFindInIn) {
    super(id, context, "ProductFind");
    ProductFindIn = ProductFindInIn;
  }

  public void translateToMap() {
    if (ProductFindIn != null) {
      Integer index =  ProductFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Product", ProductObjectBaseHelper.toMap(ProductFindIn, new HashMap(), "Product").get("Product"));
    }
  }


/**
 *
 * Sets the Product
 * @param ProductFindInIn Value of the ProductFindIn
 *
 */

  public void setProduct(ProductObjectBaseFilter ProductFindInIn) {
    ProductFindIn = ProductFindInIn;
  }

  public void translateFromMap() {
    ProductFindIn = ProductObjectBaseHelper.fromMapFilter(inputMap, "Product");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectBaseFilter getProduct( ) {
    return ProductFindIn;
  }

}
