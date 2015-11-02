/*
 * Generated code DO NOT EDIT
 * Generated file: ProductChargeMapGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ProductChargeMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductChargeMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductChargeMapObjectKeyData PCMapGetIn;
/**
 *
 * Constructor to create a  ProductChargeMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductChargeMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductChargeMapObjectKeyData PCMapGetInIn) {
    super(id, context, "ProductChargeMapGet");
    PCMapGetIn = PCMapGetInIn;
  }

  public void translateToMap() {
    if (PCMapGetIn != null) {
      PCMapGetIn.resetFlags(true, true);
      addInput("ProductChargeMap", ProductChargeMapObjectKeyHelper.toMap(PCMapGetIn, new HashMap(), "ProductChargeMapObjectKeyData").get("ProductChargeMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductChargeMap
 * @param PCMapGetInIn Value of the PCMapGetIn
 *
 */

  public void setProductChargeMap(ProductChargeMapObjectKeyData PCMapGetInIn) {
    PCMapGetIn = PCMapGetInIn;
  }

  public void translateFromMap() {
    PCMapGetIn = ProductChargeMapObjectKeyHelper.fromMap(inputMap, "ProductChargeMap");
  }

/**
 *
 * Gets the ProductChargeMap
 * @return Value of the ProductChargeMap
 *
 */

  public ProductChargeMapObjectKeyData getProductChargeMap( ) {
    return PCMapGetIn;
  }

}
