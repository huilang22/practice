/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageActivateBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageActivateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageActivateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectKeyData activateIn;
/**
 *
 * Constructor to create a  ProductPackageActivateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageActivateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectKeyData activateInIn) {
    super(id, context, "ProductPackageActivate");
    activateIn = activateInIn;
  }

  public void translateToMap() {
    if (activateIn != null) {
      activateIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(activateIn, new HashMap(), "ProductPackageObjectKeyData").get("ProductPackageObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param activateInIn Value of the activateIn
 *
 */

  public void setProductPackage(ProductPackageObjectKeyData activateInIn) {
    activateIn = activateInIn;
  }

  public void translateFromMap() {
    activateIn = ProductPackageObjectKeyHelper.fromMap(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectKeyData getProductPackage( ) {
    return activateIn;
  }

}
