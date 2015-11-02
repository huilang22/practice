/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductAlternateGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a ProductAlternateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductAlternateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectBaseData ProductAlternateGetIn;
/**
 *
 * Constructor to create a  ProductAlternateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductAlternateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectBaseData ProductAlternateGetInIn) {
    super(id, context, "ProductAlternateGet");
    ProductAlternateGetIn = ProductAlternateGetInIn;
  }

  public void translateToMap() {
    if (ProductAlternateGetIn != null) {
      ProductAlternateGetIn.resetFlags(true, true);
      addInput("Product", ProductObjectBaseHelper.toMap(ProductAlternateGetIn, new HashMap(), "Product").get("Product"));
    }
  }


/**
 *
 * Sets the Product
 * @param ProductAlternateGetInIn Value of the ProductAlternateGetIn
 *
 */

  public void setProduct(ProductObjectBaseData ProductAlternateGetInIn) {
    ProductAlternateGetIn = ProductAlternateGetInIn;
  }

  public void translateFromMap() {
    ProductAlternateGetIn = ProductObjectBaseHelper.fromMap(inputMap, "Product");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectBaseData getProduct( ) {
    return ProductAlternateGetIn;
  }

}
