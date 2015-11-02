/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a ProductChargeMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductChargeMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductChargeMapObjectData PCMapCreateIn;
/**
 *
 * Constructor to create a  ProductChargeMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductChargeMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductChargeMapObjectData PCMapCreateInIn) {
    super(id, context, "ProductChargeMapCreate");
    PCMapCreateIn = PCMapCreateInIn;
  }

  public void translateToMap() {
    if (PCMapCreateIn != null) {
      PCMapCreateIn.resetFlags(true, true);
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(PCMapCreateIn, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }


/**
 *
 * Sets the ProductChargeMap
 * @param PCMapCreateInIn Value of the PCMapCreateIn
 *
 */

  public void setProductChargeMap(ProductChargeMapObjectData PCMapCreateInIn) {
    PCMapCreateIn = PCMapCreateInIn;
  }

  public void translateFromMap() {
    PCMapCreateIn = ProductChargeMapObjectHelper.fromMap(inputMap, "ProductChargeMap");
  }

/**
 *
 * Gets the ProductChargeMap
 * @return Value of the ProductChargeMap
 *
 */

  public ProductChargeMapObjectData getProductChargeMap( ) {
    return PCMapCreateIn;
  }

}
