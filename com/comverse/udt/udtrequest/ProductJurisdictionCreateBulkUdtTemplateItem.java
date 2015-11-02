/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ProductJurisdictionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductJurisdictionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductJurisdictionObjectData ProductJurisdictionCreateIn;
/**
 *
 * Constructor to create a  ProductJurisdictionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductJurisdictionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductJurisdictionObjectData ProductJurisdictionCreateInIn) {
    super(id, context, "ProductJurisdictionCreate");
    ProductJurisdictionCreateIn = ProductJurisdictionCreateInIn;
  }

  public void translateToMap() {
    if (ProductJurisdictionCreateIn != null) {
      ProductJurisdictionCreateIn.resetFlags(true, true);
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(ProductJurisdictionCreateIn, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }


/**
 *
 * Sets the ProductJurisdiction
 * @param ProductJurisdictionCreateInIn Value of the ProductJurisdictionCreateIn
 *
 */

  public void setProductJurisdiction(ProductJurisdictionObjectData ProductJurisdictionCreateInIn) {
    ProductJurisdictionCreateIn = ProductJurisdictionCreateInIn;
  }

  public void translateFromMap() {
    ProductJurisdictionCreateIn = ProductJurisdictionObjectHelper.fromMap(inputMap, "ProductJurisdiction");
  }

/**
 *
 * Gets the ProductJurisdiction
 * @return Value of the ProductJurisdiction
 *
 */

  public ProductJurisdictionObjectData getProductJurisdiction( ) {
    return ProductJurisdictionCreateIn;
  }

}
