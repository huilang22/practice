/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductExternalFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductExternalFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductExternalFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectFilter PSEXFindIn;
/**
 *
 * Constructor to create a  ProductExternalFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductExternalFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectFilter PSEXFindInIn) {
    super(id, context, "ProductExternalFind");
    PSEXFindIn = PSEXFindInIn;
  }

  public void translateToMap() {
    if (PSEXFindIn != null) {
      Integer index =  PSEXFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Product", ProductObjectHelper.toMap(PSEXFindIn, new HashMap(), "Product").get("Product"));
    }
  }


/**
 *
 * Sets the Product
 * @param PSEXFindInIn Value of the PSEXFindIn
 *
 */

  public void setProduct(ProductObjectFilter PSEXFindInIn) {
    PSEXFindIn = PSEXFindInIn;
  }

  public void translateFromMap() {
    PSEXFindIn = ProductObjectHelper.fromMapFilter(inputMap, "Product");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectFilter getProduct( ) {
    return PSEXFindIn;
  }

}
