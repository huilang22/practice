/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateKeyGetBulkUdtTemplateItem.java
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
 * Class used to create a ProductRateKeyGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateKeyGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateKeyObjectKeyData PRKGetIn;
/**
 *
 * Constructor to create a  ProductRateKeyGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateKeyGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateKeyObjectKeyData PRKGetInIn) {
    super(id, context, "ProductRateKeyGet");
    PRKGetIn = PRKGetInIn;
  }

  public void translateToMap() {
    if (PRKGetIn != null) {
      PRKGetIn.resetFlags(true, true);
      addInput("ProductRateKey", ProductRateKeyObjectKeyHelper.toMap(PRKGetIn, new HashMap(), "ProductRateKeyObjectKeyData").get("ProductRateKeyObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductRateKey
 * @param PRKGetInIn Value of the PRKGetIn
 *
 */

  public void setProductRateKey(ProductRateKeyObjectKeyData PRKGetInIn) {
    PRKGetIn = PRKGetInIn;
  }

  public void translateFromMap() {
    PRKGetIn = ProductRateKeyObjectKeyHelper.fromMap(inputMap, "ProductRateKey");
  }

/**
 *
 * Gets the ProductRateKey
 * @return Value of the ProductRateKey
 *
 */

  public ProductRateKeyObjectKeyData getProductRateKey( ) {
    return PRKGetIn;
  }

}
