/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductGroupObjectFilter pgFindIn;
/**
 *
 * Constructor to create a  ProductGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductGroupObjectFilter pgFindInIn) {
    super(id, context, "ProductGroupFind");
    pgFindIn = pgFindInIn;
  }

  public void translateToMap() {
    if (pgFindIn != null) {
      Integer index =  pgFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(pgFindIn, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }


/**
 *
 * Sets the ProductGroup
 * @param pgFindInIn Value of the pgFindIn
 *
 */

  public void setProductGroup(ProductGroupObjectFilter pgFindInIn) {
    pgFindIn = pgFindInIn;
  }

  public void translateFromMap() {
    pgFindIn = ProductGroupObjectHelper.fromMapFilter(inputMap, "ProductGroup");
  }

/**
 *
 * Gets the ProductGroup
 * @return Value of the ProductGroup
 *
 */

  public ProductGroupObjectFilter getProductGroup( ) {
    return pgFindIn;
  }

}
