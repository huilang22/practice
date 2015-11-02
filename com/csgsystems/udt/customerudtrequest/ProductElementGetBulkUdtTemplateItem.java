/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementGetBulkUdtTemplateItem.java
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
 * Class used to create a ProductElementGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductElementGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductElementObjectKeyData peGetIn;
/**
 *
 * Constructor to create a  ProductElementGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductElementGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementObjectKeyData peGetInIn) {
    super(id, context, "ProductElementGet");
    peGetIn = peGetInIn;
  }

  public void translateToMap() {
    if (peGetIn != null) {
      peGetIn.resetFlags(true, true);
      addInput("ProductElement", ProductElementObjectKeyHelper.toMap(peGetIn, new HashMap(), "ProductElementObjectKeyData").get("ProductElementObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductElement
 * @param peGetInIn Value of the peGetIn
 *
 */

  public void setProductElement(ProductElementObjectKeyData peGetInIn) {
    peGetIn = peGetInIn;
  }

  public void translateFromMap() {
    peGetIn = ProductElementObjectKeyHelper.fromMap(inputMap, "ProductElement");
  }

/**
 *
 * Gets the ProductElement
 * @return Value of the ProductElement
 *
 */

  public ProductElementObjectKeyData getProductElement( ) {
    return peGetIn;
  }

}
