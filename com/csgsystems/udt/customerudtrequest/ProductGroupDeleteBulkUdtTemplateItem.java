/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ProductGroupDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGroupDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductGroupObjectKeyData PGDeleteIn;
/**
 *
 * Constructor to create a  ProductGroupDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGroupDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductGroupObjectKeyData PGDeleteInIn) {
    super(id, context, "ProductGroupDelete");
    PGDeleteIn = PGDeleteInIn;
  }

  public void translateToMap() {
    if (PGDeleteIn != null) {
      PGDeleteIn.resetFlags(true, true);
      addInput("ProductGroup", ProductGroupObjectKeyHelper.toMap(PGDeleteIn, new HashMap(), "ProductGroupObjectKeyData").get("ProductGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductGroup
 * @param PGDeleteInIn Value of the PGDeleteIn
 *
 */

  public void setProductGroup(ProductGroupObjectKeyData PGDeleteInIn) {
    PGDeleteIn = PGDeleteInIn;
  }

  public void translateFromMap() {
    PGDeleteIn = ProductGroupObjectKeyHelper.fromMap(inputMap, "ProductGroup");
  }

/**
 *
 * Gets the ProductGroup
 * @return Value of the ProductGroup
 *
 */

  public ProductGroupObjectKeyData getProductGroup( ) {
    return PGDeleteIn;
  }

}
