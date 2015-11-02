/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ProductChargeMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductChargeMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductChargeMapObjectFilter PCMapFindIn;
/**
 *
 * Constructor to create a  ProductChargeMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductChargeMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductChargeMapObjectFilter PCMapFindInIn) {
    super(id, context, "ProductChargeMapFind");
    PCMapFindIn = PCMapFindInIn;
  }

  public void translateToMap() {
    if (PCMapFindIn != null) {
      Integer index =  PCMapFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(PCMapFindIn, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }


/**
 *
 * Sets the ProductChargeMap
 * @param PCMapFindInIn Value of the PCMapFindIn
 *
 */

  public void setProductChargeMap(ProductChargeMapObjectFilter PCMapFindInIn) {
    PCMapFindIn = PCMapFindInIn;
  }

  public void translateFromMap() {
    PCMapFindIn = ProductChargeMapObjectHelper.fromMapFilter(inputMap, "ProductChargeMap");
  }

/**
 *
 * Gets the ProductChargeMap
 * @return Value of the ProductChargeMap
 *
 */

  public ProductChargeMapObjectFilter getProductChargeMap( ) {
    return PCMapFindIn;
  }

}
