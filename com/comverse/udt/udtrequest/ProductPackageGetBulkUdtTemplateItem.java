/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageGetBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectKeyData getIn;
/**
 *
 * Constructor to create a  ProductPackageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectKeyData getInIn) {
    super(id, context, "ProductPackageGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(getIn, new HashMap(), "ProductPackageObjectKeyData").get("ProductPackageObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param getInIn Value of the getIn
 *
 */

  public void setProductPackage(ProductPackageObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = ProductPackageObjectKeyHelper.fromMap(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectKeyData getProductPackage( ) {
    return getIn;
  }

}
