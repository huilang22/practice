/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProductGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductGroupObjectData pgUpdIn;
/**
 *
 * Constructor to create a  ProductGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductGroupObjectData pgUpdInIn) {
    super(id, context, "ProductGroupUpdate");
    pgUpdIn = pgUpdInIn;
  }

  public void translateToMap() {
    if (pgUpdIn != null) {
      pgUpdIn.resetFlags(true, true);
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(pgUpdIn, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }


/**
 *
 * Sets the ProductGroup
 * @param pgUpdInIn Value of the pgUpdIn
 *
 */

  public void setProductGroup(ProductGroupObjectData pgUpdInIn) {
    pgUpdIn = pgUpdInIn;
  }

  public void translateFromMap() {
    pgUpdIn = ProductGroupObjectHelper.fromMap(inputMap, "ProductGroup");
  }

/**
 *
 * Gets the ProductGroup
 * @return Value of the ProductGroup
 *
 */

  public ProductGroupObjectData getProductGroup( ) {
    return pgUpdIn;
  }

}
