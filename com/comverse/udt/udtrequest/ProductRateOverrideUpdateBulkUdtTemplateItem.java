/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideUpdateBulkUdtTemplateItem.java
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
