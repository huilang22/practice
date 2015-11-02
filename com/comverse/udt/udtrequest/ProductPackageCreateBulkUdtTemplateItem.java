/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageCreateBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectData PackageCreateIn;
/**
 *
 * Constructor to create a  ProductPackageCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectData PackageCreateInIn) {
    super(id, context, "ProductPackageCreate");
    PackageCreateIn = PackageCreateInIn;
  }

  public void translateToMap() {
    if (PackageCreateIn != null) {
      PackageCreateIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(PackageCreateIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param PackageCreateInIn Value of the PackageCreateIn
 *
 */

  public void setProductPackage(ProductPackageObjectData PackageCreateInIn) {
    PackageCreateIn = PackageCreateInIn;
  }

  public void translateFromMap() {
    PackageCreateIn = ProductPackageObjectHelper.fromMap(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectData getProductPackage( ) {
    return PackageCreateIn;
  }

}
