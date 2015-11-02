/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductFindWithExtendedDataBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ProductFindWithExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductFindWithExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectFilter PFindWithIn;
/**
 *
 * Constructor to create a  ProductFindWithExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductFindWithExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectFilter PFindWithInIn) {
    super(id, context, "ProductFindWithExtendedData");
    PFindWithIn = PFindWithInIn;
  }

  public void translateToMap() {
    if (PFindWithIn != null) {
      Integer index =  PFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Product", ProductObjectHelper.toMap(PFindWithIn, new HashMap(), "Product").get("Product"));
    }
  }


/**
 *
 * Sets the Product
 * @param PFindWithInIn Value of the PFindWithIn
 *
 */

  public void setProduct(ProductObjectFilter PFindWithInIn) {
    PFindWithIn = PFindWithInIn;
  }

  public void translateFromMap() {
    PFindWithIn = ProductObjectHelper.fromMapFilter(inputMap, "Product");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectFilter getProduct( ) {
    return PFindWithIn;
  }

}
