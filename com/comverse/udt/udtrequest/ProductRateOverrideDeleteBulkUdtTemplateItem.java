/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ProductRateOverrideDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateOverrideDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateOverrideObjectKeyData PRODeleteIn;
  protected Date PRODCeaseDate;
/**
 *
 * Constructor to create a  ProductRateOverrideDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateOverrideDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateOverrideObjectKeyData PRODeleteInIn, Date PRODCeaseDateIn) {
    super(id, context, "ProductRateOverrideDelete");
    PRODeleteIn = PRODeleteInIn;
    PRODCeaseDate = PRODCeaseDateIn;
  }

  public void translateToMap() {
    if (PRODeleteIn != null) {
      PRODeleteIn.resetFlags(true, true);
      addInput("ProductRateOverride", ProductRateOverrideObjectKeyHelper.toMap(PRODeleteIn, new HashMap(), "ProductRateOverrideObjectKeyData").get("ProductRateOverrideObjectKeyData"));
    }
    if (PRODCeaseDate != null) {
      addInput("InactiveDate", PRODCeaseDate);
    }
  }


/**
 *
 * Sets the ProductRateOverride
 * @param PRODeleteInIn Value of the PRODeleteIn
 *
 */

  public void setProductRateOverride(ProductRateOverrideObjectKeyData PRODeleteInIn) {
    PRODeleteIn = PRODeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param PRODCeaseDateIn Value of the PRODCeaseDate
 *
 */

  public void setInactiveDate(Date PRODCeaseDateIn) {
    PRODCeaseDate = PRODCeaseDateIn;
  }

  public void translateFromMap() {
    PRODeleteIn = ProductRateOverrideObjectKeyHelper.fromMap(inputMap, "ProductRateOverride");
    PRODCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the ProductRateOverride
 * @return Value of the ProductRateOverride
 *
 */

  public ProductRateOverrideObjectKeyData getProductRateOverride( ) {
    return PRODeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return PRODCeaseDate;
  }

}
