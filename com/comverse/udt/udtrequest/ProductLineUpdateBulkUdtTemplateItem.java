/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProductLineUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductLineUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductLineObjectData plUpdIn;
/**
 *
 * Constructor to create a  ProductLineUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductLineUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductLineObjectData plUpdInIn) {
    super(id, context, "ProductLineUpdate");
    plUpdIn = plUpdInIn;
  }

  public void translateToMap() {
    if (plUpdIn != null) {
      plUpdIn.resetFlags(true, true);
      addInput("ProductLine", ProductLineObjectHelper.toMap(plUpdIn, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }


/**
 *
 * Sets the ProductLine
 * @param plUpdInIn Value of the plUpdIn
 *
 */

  public void setProductLine(ProductLineObjectData plUpdInIn) {
    plUpdIn = plUpdInIn;
  }

  public void translateFromMap() {
    plUpdIn = ProductLineObjectHelper.fromMap(inputMap, "ProductLine");
  }

/**
 *
 * Gets the ProductLine
 * @return Value of the ProductLine
 *
 */

  public ProductLineObjectData getProductLine( ) {
    return plUpdIn;
  }

}
