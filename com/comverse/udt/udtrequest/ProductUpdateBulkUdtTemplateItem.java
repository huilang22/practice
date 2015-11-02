/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProductUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectBaseData ProductUpdateIn;
/**
 *
 * Constructor to create a  ProductUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectBaseData ProductUpdateInIn) {
    super(id, context, "ProductUpdate");
    ProductUpdateIn = ProductUpdateInIn;
  }

  public void translateToMap() {
    if (ProductUpdateIn != null) {
      ProductUpdateIn.resetFlags(true, true);
      addInput("Product", ProductObjectBaseHelper.toMap(ProductUpdateIn, new HashMap(), "Product").get("Product"));
    }
  }


/**
 *
 * Sets the Product
 * @param ProductUpdateInIn Value of the ProductUpdateIn
 *
 */

  public void setProduct(ProductObjectBaseData ProductUpdateInIn) {
    ProductUpdateIn = ProductUpdateInIn;
  }

  public void translateFromMap() {
    ProductUpdateIn = ProductObjectBaseHelper.fromMap(inputMap, "Product");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectBaseData getProduct( ) {
    return ProductUpdateIn;
  }

}
