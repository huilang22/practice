/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateOverrideUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProductRateOverrideUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateOverrideUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateOverrideObjectData PROUpdateIn;
/**
 *
 * Constructor to create a  ProductRateOverrideUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateOverrideUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateOverrideObjectData PROUpdateInIn) {
    super(id, context, "ProductRateOverrideUpdate");
    PROUpdateIn = PROUpdateInIn;
  }

  public void translateToMap() {
    if (PROUpdateIn != null) {
      PROUpdateIn.resetFlags(true, true);
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(PROUpdateIn, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }


/**
 *
 * Sets the ProductRateOverride
 * @param PROUpdateInIn Value of the PROUpdateIn
 *
 */

  public void setProductRateOverride(ProductRateOverrideObjectData PROUpdateInIn) {
    PROUpdateIn = PROUpdateInIn;
  }

  public void translateFromMap() {
    PROUpdateIn = ProductRateOverrideObjectHelper.fromMap(inputMap, "ProductRateOverride");
  }

/**
 *
 * Gets the ProductRateOverride
 * @return Value of the ProductRateOverride
 *
 */

  public ProductRateOverrideObjectData getProductRateOverride( ) {
    return PROUpdateIn;
  }

}
