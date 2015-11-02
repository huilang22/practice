/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateOverrideGetBulkUdtTemplateItem.java
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
 * Class used to create a ProductRateOverrideGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateOverrideGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateOverrideObjectKeyData PROGetIn;
/**
 *
 * Constructor to create a  ProductRateOverrideGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateOverrideGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateOverrideObjectKeyData PROGetInIn) {
    super(id, context, "ProductRateOverrideGet");
    PROGetIn = PROGetInIn;
  }

  public void translateToMap() {
    if (PROGetIn != null) {
      PROGetIn.resetFlags(true, true);
      addInput("ProductRateOverride", ProductRateOverrideObjectKeyHelper.toMap(PROGetIn, new HashMap(), "ProductRateOverrideObjectKeyData").get("ProductRateOverrideObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductRateOverride
 * @param PROGetInIn Value of the PROGetIn
 *
 */

  public void setProductRateOverride(ProductRateOverrideObjectKeyData PROGetInIn) {
    PROGetIn = PROGetInIn;
  }

  public void translateFromMap() {
    PROGetIn = ProductRateOverrideObjectKeyHelper.fromMap(inputMap, "ProductRateOverride");
  }

/**
 *
 * Gets the ProductRateOverride
 * @return Value of the ProductRateOverride
 *
 */

  public ProductRateOverrideObjectKeyData getProductRateOverride( ) {
    return PROGetIn;
  }

}
