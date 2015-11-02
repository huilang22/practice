/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageDisconnectValidateBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageDisconnectValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageDisconnectValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectData PackageDisconnectValidateIn;
/**
 *
 * Constructor to create a  ProductPackageDisconnectValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageDisconnectValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectData PackageDisconnectValidateInIn) {
    super(id, context, "ProductPackageDisconnectValidate");
    PackageDisconnectValidateIn = PackageDisconnectValidateInIn;
  }

  public void translateToMap() {
    if (PackageDisconnectValidateIn != null) {
      PackageDisconnectValidateIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(PackageDisconnectValidateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param PackageDisconnectValidateInIn Value of the PackageDisconnectValidateIn
 *
 */

  public void setProductPackage(ProductPackageObjectData PackageDisconnectValidateInIn) {
    PackageDisconnectValidateIn = PackageDisconnectValidateInIn;
  }

  public void translateFromMap() {
    PackageDisconnectValidateIn = ProductPackageObjectHelper.fromMap(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectData getProductPackage( ) {
    return PackageDisconnectValidateIn;
  }

}
