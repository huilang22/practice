/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectData PackageUpdateIn;
/**
 *
 * Constructor to create a  ProductPackageUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectData PackageUpdateInIn) {
    super(id, context, "ProductPackageUpdate");
    PackageUpdateIn = PackageUpdateInIn;
  }

  public void translateToMap() {
    if (PackageUpdateIn != null) {
      PackageUpdateIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(PackageUpdateIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param PackageUpdateInIn Value of the PackageUpdateIn
 *
 */

  public void setProductPackage(ProductPackageObjectData PackageUpdateInIn) {
    PackageUpdateIn = PackageUpdateInIn;
  }

  public void translateFromMap() {
    PackageUpdateIn = ProductPackageObjectHelper.fromMap(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectData getProductPackage( ) {
    return PackageUpdateIn;
  }

}
