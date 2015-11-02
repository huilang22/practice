/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectKeyData PackageDeleteIn;
  protected Date PPDCeaseDate;
/**
 *
 * Constructor to create a  ProductPackageDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectKeyData PackageDeleteInIn, Date PPDCeaseDateIn) {
    super(id, context, "ProductPackageDelete");
    PackageDeleteIn = PackageDeleteInIn;
    PPDCeaseDate = PPDCeaseDateIn;
  }

  public void translateToMap() {
    if (PackageDeleteIn != null) {
      PackageDeleteIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(PackageDeleteIn, new HashMap(), "ProductPackageObjectKeyData").get("ProductPackageObjectKeyData"));
    }
    if (PPDCeaseDate != null) {
      addInput("InactiveDate", PPDCeaseDate);
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param PackageDeleteInIn Value of the PackageDeleteIn
 *
 */

  public void setProductPackage(ProductPackageObjectKeyData PackageDeleteInIn) {
    PackageDeleteIn = PackageDeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param PPDCeaseDateIn Value of the PPDCeaseDate
 *
 */

  public void setInactiveDate(Date PPDCeaseDateIn) {
    PPDCeaseDate = PPDCeaseDateIn;
  }

  public void translateFromMap() {
    PackageDeleteIn = ProductPackageObjectKeyHelper.fromMap(inputMap, "ProductPackage");
    PPDCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectKeyData getProductPackage( ) {
    return PackageDeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return PPDCeaseDate;
  }

}
