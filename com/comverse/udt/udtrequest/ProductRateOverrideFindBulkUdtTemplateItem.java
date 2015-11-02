/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductRateOverrideFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateOverrideFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateOverrideObjectFilter PROFindIn;
/**
 *
 * Constructor to create a  ProductRateOverrideFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateOverrideFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateOverrideObjectFilter PROFindInIn) {
    super(id, context, "ProductRateOverrideFind");
    PROFindIn = PROFindInIn;
  }

  public void translateToMap() {
    if (PROFindIn != null) {
      Integer index =  PROFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(PROFindIn, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }


/**
 *
 * Sets the ProductRateOverride
 * @param PROFindInIn Value of the PROFindIn
 *
 */

  public void setProductRateOverride(ProductRateOverrideObjectFilter PROFindInIn) {
    PROFindIn = PROFindInIn;
  }

  public void translateFromMap() {
    PROFindIn = ProductRateOverrideObjectHelper.fromMapFilter(inputMap, "ProductRateOverride");
  }

/**
 *
 * Gets the ProductRateOverride
 * @return Value of the ProductRateOverride
 *
 */

  public ProductRateOverrideObjectFilter getProductRateOverride( ) {
    return PROFindIn;
  }

}
