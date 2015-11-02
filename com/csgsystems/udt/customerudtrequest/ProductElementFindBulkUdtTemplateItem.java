/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductElementFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductElementFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductElementObjectFilter peFindIn;
/**
 *
 * Constructor to create a  ProductElementFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductElementFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementObjectFilter peFindInIn) {
    super(id, context, "ProductElementFind");
    peFindIn = peFindInIn;
  }

  public void translateToMap() {
    if (peFindIn != null) {
      Integer index =  peFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductElement", ProductElementObjectHelper.toMap(peFindIn, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }


/**
 *
 * Sets the ProductElement
 * @param peFindInIn Value of the peFindIn
 *
 */

  public void setProductElement(ProductElementObjectFilter peFindInIn) {
    peFindIn = peFindInIn;
  }

  public void translateFromMap() {
    peFindIn = ProductElementObjectHelper.fromMapFilter(inputMap, "ProductElement");
  }

/**
 *
 * Gets the ProductElement
 * @return Value of the ProductElement
 *
 */

  public ProductElementObjectFilter getProductElement( ) {
    return peFindIn;
  }

}
