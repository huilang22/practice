/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a ProductRateOverrideDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateOverrideDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateOverrideObjectFilter ProductRateOverrideFilter;
  protected Date PRODLCeaseDate;
/**
 *
 * Constructor to create a  ProductRateOverrideDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateOverrideDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateOverrideObjectFilter ProductRateOverrideFilterIn, Date PRODLCeaseDateIn) {
    super(id, context, "ProductRateOverrideDeleteList");
    ProductRateOverrideFilter = ProductRateOverrideFilterIn;
    PRODLCeaseDate = PRODLCeaseDateIn;
  }

  public void translateToMap() {
    if (ProductRateOverrideFilter != null) {
      Integer index =  ProductRateOverrideFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductRateOverrideFilter", ProductRateOverrideObjectHelper.toMap(ProductRateOverrideFilter, new HashMap(), "Void").get("Void"));
    }
    if (PRODLCeaseDate != null) {
      addInput("InactiveDate", PRODLCeaseDate);
    }
  }


/**
 *
 * Sets the ProductRateOverrideFilter
 * @param ProductRateOverrideFilterIn Value of the ProductRateOverrideFilter
 *
 */

  public void setProductRateOverrideFilter(ProductRateOverrideObjectFilter ProductRateOverrideFilterIn) {
    ProductRateOverrideFilter = ProductRateOverrideFilterIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param PRODLCeaseDateIn Value of the PRODLCeaseDate
 *
 */

  public void setInactiveDate(Date PRODLCeaseDateIn) {
    PRODLCeaseDate = PRODLCeaseDateIn;
  }

  public void translateFromMap() {
    ProductRateOverrideFilter = ProductRateOverrideObjectHelper.fromMapFilter(inputMap, "ProductRateOverrideFilter");
    PRODLCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the ProductRateOverrideFilter
 * @return Value of the ProductRateOverrideFilter
 *
 */

  public ProductRateOverrideObjectFilter getProductRateOverrideFilter( ) {
    return ProductRateOverrideFilter;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return PRODLCeaseDate;
  }

}
