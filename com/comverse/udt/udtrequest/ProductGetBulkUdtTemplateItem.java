/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGetBulkUdtTemplateItem.java
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
 * Class used to create a ProductGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectBaseKeyData ProductGetIn;
/**
 *
 * Constructor to create a  ProductGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectBaseKeyData ProductGetInIn) {
    super(id, context, "ProductGet");
    ProductGetIn = ProductGetInIn;
  }

  public void translateToMap() {
    if (ProductGetIn != null) {
      ProductGetIn.resetFlags(true, true);
      addInput("Product", ProductObjectBaseKeyHelper.toMap(ProductGetIn, new HashMap(), "ProductObjectBaseKeyData").get("ProductObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Product
 * @param ProductGetInIn Value of the ProductGetIn
 *
 */

  public void setProduct(ProductObjectBaseKeyData ProductGetInIn) {
    ProductGetIn = ProductGetInIn;
  }

  public void translateFromMap() {
    ProductGetIn = ProductObjectBaseKeyHelper.fromMap(inputMap, "Product");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectBaseKeyData getProduct( ) {
    return ProductGetIn;
  }

}
