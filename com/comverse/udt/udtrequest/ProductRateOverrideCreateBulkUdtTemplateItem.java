/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideCreateBulkUdtTemplateItem.java
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
 * Class used to create a ProductRateOverrideCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateOverrideCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateOverrideObjectData PROCreateIn;
/**
 *
 * Constructor to create a  ProductRateOverrideCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateOverrideCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateOverrideObjectData PROCreateInIn) {
    super(id, context, "ProductRateOverrideCreate");
    PROCreateIn = PROCreateInIn;
  }

  public void translateToMap() {
    if (PROCreateIn != null) {
      PROCreateIn.resetFlags(true, true);
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(PROCreateIn, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }


/**
 *
 * Sets the ProductRateOverride
 * @param PROCreateInIn Value of the PROCreateIn
 *
 */

  public void setProductRateOverride(ProductRateOverrideObjectData PROCreateInIn) {
    PROCreateIn = PROCreateInIn;
  }

  public void translateFromMap() {
    PROCreateIn = ProductRateOverrideObjectHelper.fromMap(inputMap, "ProductRateOverride");
  }

/**
 *
 * Gets the ProductRateOverride
 * @return Value of the ProductRateOverride
 *
 */

  public ProductRateOverrideObjectData getProductRateOverride( ) {
    return PROCreateIn;
  }

}
