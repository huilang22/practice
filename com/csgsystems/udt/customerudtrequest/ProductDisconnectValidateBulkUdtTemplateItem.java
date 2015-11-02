/*
 * Generated code DO NOT EDIT
 * Generated file: ProductDisconnectValidateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ProductDisconnectValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductDisconnectValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectData ProdDiscValidateIn;
/**
 *
 * Constructor to create a  ProductDisconnectValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductDisconnectValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectData ProdDiscValidateInIn) {
    super(id, context, "ProductDisconnectValidate");
    ProdDiscValidateIn = ProdDiscValidateInIn;
  }

  public void translateToMap() {
    if (ProdDiscValidateIn != null) {
      ProdDiscValidateIn.resetFlags(true, true);
      addInput("Product", ProductObjectHelper.toMap(ProdDiscValidateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the Product
 * @param ProdDiscValidateInIn Value of the ProdDiscValidateIn
 *
 */

  public void setProduct(ProductObjectData ProdDiscValidateInIn) {
    ProdDiscValidateIn = ProdDiscValidateInIn;
  }

  public void translateFromMap() {
    ProdDiscValidateIn = ProductObjectHelper.fromMap(inputMap, "Product");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectData getProduct( ) {
    return ProdDiscValidateIn;
  }

}
