/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProductChargeMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductChargeMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductChargeMapObjectData PCMapUpdateIn;
/**
 *
 * Constructor to create a  ProductChargeMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductChargeMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductChargeMapObjectData PCMapUpdateInIn) {
    super(id, context, "ProductChargeMapUpdate");
    PCMapUpdateIn = PCMapUpdateInIn;
  }

  public void translateToMap() {
    if (PCMapUpdateIn != null) {
      PCMapUpdateIn.resetFlags(true, true);
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(PCMapUpdateIn, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }


/**
 *
 * Sets the ProductChargeMap
 * @param PCMapUpdateInIn Value of the PCMapUpdateIn
 *
 */

  public void setProductChargeMap(ProductChargeMapObjectData PCMapUpdateInIn) {
    PCMapUpdateIn = PCMapUpdateInIn;
  }

  public void translateFromMap() {
    PCMapUpdateIn = ProductChargeMapObjectHelper.fromMap(inputMap, "ProductChargeMap");
  }

/**
 *
 * Gets the ProductChargeMap
 * @return Value of the ProductChargeMap
 *
 */

  public ProductChargeMapObjectData getProductChargeMap( ) {
    return PCMapUpdateIn;
  }

}
