/*
 * Generated code DO NOT EDIT
 * Generated file: ProductJurisdictionGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ProductJurisdictionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductJurisdictionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductJurisdictionObjectKeyData ProductJurisdictionGetIn;
/**
 *
 * Constructor to create a  ProductJurisdictionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductJurisdictionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductJurisdictionObjectKeyData ProductJurisdictionGetInIn) {
    super(id, context, "ProductJurisdictionGet");
    ProductJurisdictionGetIn = ProductJurisdictionGetInIn;
  }

  public void translateToMap() {
    if (ProductJurisdictionGetIn != null) {
      ProductJurisdictionGetIn.resetFlags(true, true);
      addInput("ProductJurisdiction", ProductJurisdictionObjectKeyHelper.toMap(ProductJurisdictionGetIn, new HashMap(), "ProductJurisdictionObjectKeyData").get("ProductJurisdictionObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductJurisdiction
 * @param ProductJurisdictionGetInIn Value of the ProductJurisdictionGetIn
 *
 */

  public void setProductJurisdiction(ProductJurisdictionObjectKeyData ProductJurisdictionGetInIn) {
    ProductJurisdictionGetIn = ProductJurisdictionGetInIn;
  }

  public void translateFromMap() {
    ProductJurisdictionGetIn = ProductJurisdictionObjectKeyHelper.fromMap(inputMap, "ProductJurisdiction");
  }

/**
 *
 * Gets the ProductJurisdiction
 * @return Value of the ProductJurisdiction
 *
 */

  public ProductJurisdictionObjectKeyData getProductJurisdiction( ) {
    return ProductJurisdictionGetIn;
  }

}
