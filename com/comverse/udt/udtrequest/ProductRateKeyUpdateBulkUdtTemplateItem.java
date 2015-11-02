/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProductRateKeyUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateKeyUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateKeyObjectData PRKUpdateIn;
/**
 *
 * Constructor to create a  ProductRateKeyUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateKeyUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateKeyObjectData PRKUpdateInIn) {
    super(id, context, "ProductRateKeyUpdate");
    PRKUpdateIn = PRKUpdateInIn;
  }

  public void translateToMap() {
    if (PRKUpdateIn != null) {
      PRKUpdateIn.resetFlags(true, true);
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(PRKUpdateIn, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }


/**
 *
 * Sets the ProductRateKey
 * @param PRKUpdateInIn Value of the PRKUpdateIn
 *
 */

  public void setProductRateKey(ProductRateKeyObjectData PRKUpdateInIn) {
    PRKUpdateIn = PRKUpdateInIn;
  }

  public void translateFromMap() {
    PRKUpdateIn = ProductRateKeyObjectHelper.fromMap(inputMap, "ProductRateKey");
  }

/**
 *
 * Gets the ProductRateKey
 * @return Value of the ProductRateKey
 *
 */

  public ProductRateKeyObjectData getProductRateKey( ) {
    return PRKUpdateIn;
  }

}
