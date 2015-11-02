/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateKeyDeleteListBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a ProductRateKeyDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateKeyDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateKeyObjectFilter ProductRateKeyFilter;
  protected Date PRKLCeaseDate;
/**
 *
 * Constructor to create a  ProductRateKeyDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateKeyDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateKeyObjectFilter ProductRateKeyFilterIn, Date PRKLCeaseDateIn) {
    super(id, context, "ProductRateKeyDeleteList");
    ProductRateKeyFilter = ProductRateKeyFilterIn;
    PRKLCeaseDate = PRKLCeaseDateIn;
  }

  public void translateToMap() {
    if (ProductRateKeyFilter != null) {
      Integer index =  ProductRateKeyFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductRateKeyFilter", ProductRateKeyObjectHelper.toMap(ProductRateKeyFilter, new HashMap(), "Void").get("Void"));
    }
    if (PRKLCeaseDate != null) {
      addInput("InactiveDate", PRKLCeaseDate);
    }
  }


/**
 *
 * Sets the ProductRateKeyFilter
 * @param ProductRateKeyFilterIn Value of the ProductRateKeyFilter
 *
 */

  public void setProductRateKeyFilter(ProductRateKeyObjectFilter ProductRateKeyFilterIn) {
    ProductRateKeyFilter = ProductRateKeyFilterIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param PRKLCeaseDateIn Value of the PRKLCeaseDate
 *
 */

  public void setInactiveDate(Date PRKLCeaseDateIn) {
    PRKLCeaseDate = PRKLCeaseDateIn;
  }

  public void translateFromMap() {
    ProductRateKeyFilter = ProductRateKeyObjectHelper.fromMapFilter(inputMap, "ProductRateKeyFilter");
    PRKLCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the ProductRateKeyFilter
 * @return Value of the ProductRateKeyFilter
 *
 */

  public ProductRateKeyObjectFilter getProductRateKeyFilter( ) {
    return ProductRateKeyFilter;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return PRKLCeaseDate;
  }

}
