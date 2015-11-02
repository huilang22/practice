/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a ProductGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductGroupObjectKeyData pgGetIn;
/**
 *
 * Constructor to create a  ProductGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductGroupObjectKeyData pgGetInIn) {
    super(id, context, "ProductGroupGet");
    pgGetIn = pgGetInIn;
  }

  public void translateToMap() {
    if (pgGetIn != null) {
      pgGetIn.resetFlags(true, true);
      addInput("ProductGroup", ProductGroupObjectKeyHelper.toMap(pgGetIn, new HashMap(), "ProductGroupObjectKeyData").get("ProductGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductGroup
 * @param pgGetInIn Value of the pgGetIn
 *
 */

  public void setProductGroup(ProductGroupObjectKeyData pgGetInIn) {
    pgGetIn = pgGetInIn;
  }

  public void translateFromMap() {
    pgGetIn = ProductGroupObjectKeyHelper.fromMap(inputMap, "ProductGroup");
  }

/**
 *
 * Gets the ProductGroup
 * @return Value of the ProductGroup
 *
 */

  public ProductGroupObjectKeyData getProductGroup( ) {
    return pgGetIn;
  }

}
