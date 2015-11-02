/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateKeyFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductRateKeyFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateKeyFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateKeyObjectFilter PRKFindIn;
/**
 *
 * Constructor to create a  ProductRateKeyFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateKeyFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateKeyObjectFilter PRKFindInIn) {
    super(id, context, "ProductRateKeyFind");
    PRKFindIn = PRKFindInIn;
  }

  public void translateToMap() {
    if (PRKFindIn != null) {
      Integer index =  PRKFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(PRKFindIn, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }


/**
 *
 * Sets the ProductRateKey
 * @param PRKFindInIn Value of the PRKFindIn
 *
 */

  public void setProductRateKey(ProductRateKeyObjectFilter PRKFindInIn) {
    PRKFindIn = PRKFindInIn;
  }

  public void translateFromMap() {
    PRKFindIn = ProductRateKeyObjectHelper.fromMapFilter(inputMap, "ProductRateKey");
  }

/**
 *
 * Gets the ProductRateKey
 * @return Value of the ProductRateKey
 *
 */

  public ProductRateKeyObjectFilter getProductRateKey( ) {
    return PRKFindIn;
  }

}
