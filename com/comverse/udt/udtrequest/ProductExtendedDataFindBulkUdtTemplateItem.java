/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectBaseKeyData pedfIn;
/**
 *
 * Constructor to create a  ProductExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectBaseKeyData pedfInIn) {
    super(id, context, "ProductExtendedDataFind");
    pedfIn = pedfInIn;
  }

  public void translateToMap() {
    if (pedfIn != null) {
      pedfIn.resetFlags(true, true);
      addInput("Product", ProductObjectBaseKeyHelper.toMap(pedfIn, new HashMap(), "ProductObjectBaseKeyData").get("ProductObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Product
 * @param pedfInIn Value of the pedfIn
 *
 */

  public void setProduct(ProductObjectBaseKeyData pedfInIn) {
    pedfIn = pedfInIn;
  }

  public void translateFromMap() {
    pedfIn = ProductObjectBaseKeyHelper.fromMap(inputMap, "Product");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectBaseKeyData getProduct( ) {
    return pedfIn;
  }

}
