/*
 * Generated code DO NOT EDIT
 * Generated file: ProductLineDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ProductLineDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductLineDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductLineObjectKeyData PLDeleteIn;
/**
 *
 * Constructor to create a  ProductLineDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductLineDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductLineObjectKeyData PLDeleteInIn) {
    super(id, context, "ProductLineDelete");
    PLDeleteIn = PLDeleteInIn;
  }

  public void translateToMap() {
    if (PLDeleteIn != null) {
      PLDeleteIn.resetFlags(true, true);
      addInput("ProductLine", ProductLineObjectKeyHelper.toMap(PLDeleteIn, new HashMap(), "ProductLineObjectKeyData").get("ProductLineObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductLine
 * @param PLDeleteInIn Value of the PLDeleteIn
 *
 */

  public void setProductLine(ProductLineObjectKeyData PLDeleteInIn) {
    PLDeleteIn = PLDeleteInIn;
  }

  public void translateFromMap() {
    PLDeleteIn = ProductLineObjectKeyHelper.fromMap(inputMap, "ProductLine");
  }

/**
 *
 * Gets the ProductLine
 * @return Value of the ProductLine
 *
 */

  public ProductLineObjectKeyData getProductLine( ) {
    return PLDeleteIn;
  }

}
