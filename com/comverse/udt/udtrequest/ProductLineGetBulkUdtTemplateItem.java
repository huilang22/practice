/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ProductLineGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductLineGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductLineObjectKeyData pgGetIn;
/**
 *
 * Constructor to create a  ProductLineGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductLineGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductLineObjectKeyData pgGetInIn) {
    super(id, context, "ProductLineGet");
    pgGetIn = pgGetInIn;
  }

  public void translateToMap() {
    if (pgGetIn != null) {
      pgGetIn.resetFlags(true, true);
      addInput("ProductLine", ProductLineObjectKeyHelper.toMap(pgGetIn, new HashMap(), "ProductLineObjectKeyData").get("ProductLineObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductLine
 * @param pgGetInIn Value of the pgGetIn
 *
 */

  public void setProductLine(ProductLineObjectKeyData pgGetInIn) {
    pgGetIn = pgGetInIn;
  }

  public void translateFromMap() {
    pgGetIn = ProductLineObjectKeyHelper.fromMap(inputMap, "ProductLine");
  }

/**
 *
 * Gets the ProductLine
 * @return Value of the ProductLine
 *
 */

  public ProductLineObjectKeyData getProductLine( ) {
    return pgGetIn;
  }

}
