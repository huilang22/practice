/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyCreateBulkUdtTemplateItem.java
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
 * Class used to create a ProductRateKeyCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateKeyCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateKeyObjectData PRKCreateIn;
/**
 *
 * Constructor to create a  ProductRateKeyCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateKeyCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateKeyObjectData PRKCreateInIn) {
    super(id, context, "ProductRateKeyCreate");
    PRKCreateIn = PRKCreateInIn;
  }

  public void translateToMap() {
    if (PRKCreateIn != null) {
      PRKCreateIn.resetFlags(true, true);
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(PRKCreateIn, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }


/**
 *
 * Sets the ProductRateKey
 * @param PRKCreateInIn Value of the PRKCreateIn
 *
 */

  public void setProductRateKey(ProductRateKeyObjectData PRKCreateInIn) {
    PRKCreateIn = PRKCreateInIn;
  }

  public void translateFromMap() {
    PRKCreateIn = ProductRateKeyObjectHelper.fromMap(inputMap, "ProductRateKey");
  }

/**
 *
 * Gets the ProductRateKey
 * @return Value of the ProductRateKey
 *
 */

  public ProductRateKeyObjectData getProductRateKey( ) {
    return PRKCreateIn;
  }

}
