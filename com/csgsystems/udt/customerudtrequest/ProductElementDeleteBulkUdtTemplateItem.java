/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ProductElementDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductElementDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductElementObjectKeyData PEDeleteIn;
/**
 *
 * Constructor to create a  ProductElementDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductElementDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementObjectKeyData PEDeleteInIn) {
    super(id, context, "ProductElementDelete");
    PEDeleteIn = PEDeleteInIn;
  }

  public void translateToMap() {
    if (PEDeleteIn != null) {
      PEDeleteIn.resetFlags(true, true);
      addInput("ProductElement", ProductElementObjectKeyHelper.toMap(PEDeleteIn, new HashMap(), "ProductElementObjectKeyData").get("ProductElementObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductElement
 * @param PEDeleteInIn Value of the PEDeleteIn
 *
 */

  public void setProductElement(ProductElementObjectKeyData PEDeleteInIn) {
    PEDeleteIn = PEDeleteInIn;
  }

  public void translateFromMap() {
    PEDeleteIn = ProductElementObjectKeyHelper.fromMap(inputMap, "ProductElement");
  }

/**
 *
 * Gets the ProductElement
 * @return Value of the ProductElement
 *
 */

  public ProductElementObjectKeyData getProductElement( ) {
    return PEDeleteIn;
  }

}
