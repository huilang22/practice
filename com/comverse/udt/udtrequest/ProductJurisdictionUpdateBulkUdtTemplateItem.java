/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProductJurisdictionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductJurisdictionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductJurisdictionObjectData ProductJurisdictionUpdateIn;
  protected ProductJurisdictionObjectFilter ProductJurisdictionUpdateFilter;
  protected ProductJurisdictionObjectData ProductJurisdictionUpdateGet;
/**
 *
 * Constructor to create a  ProductJurisdictionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductJurisdictionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductJurisdictionObjectData ProductJurisdictionUpdateInIn, ProductJurisdictionObjectFilter ProductJurisdictionUpdateFilterIn, ProductJurisdictionObjectData ProductJurisdictionUpdateGetIn) {
    super(id, context, "ProductJurisdictionUpdate");
    ProductJurisdictionUpdateIn = ProductJurisdictionUpdateInIn;
    ProductJurisdictionUpdateFilter = ProductJurisdictionUpdateFilterIn;
    ProductJurisdictionUpdateGet = ProductJurisdictionUpdateGetIn;
  }

  public void translateToMap() {
    if (ProductJurisdictionUpdateIn != null) {
      ProductJurisdictionUpdateIn.resetFlags(true, true);
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(ProductJurisdictionUpdateIn, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
    if (ProductJurisdictionUpdateFilter != null) {
      Integer index =  ProductJurisdictionUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductJurisdictionUpdateFilter", ProductJurisdictionObjectHelper.toMap(ProductJurisdictionUpdateFilter, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
    if (ProductJurisdictionUpdateGet != null) {
      ProductJurisdictionUpdateGet.resetFlags(true, true);
      addInput("ProductJurisdictionUpdateGet", ProductJurisdictionObjectHelper.toMap(ProductJurisdictionUpdateGet, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }


/**
 *
 * Sets the ProductJurisdiction
 * @param ProductJurisdictionUpdateInIn Value of the ProductJurisdictionUpdateIn
 *
 */

  public void setProductJurisdiction(ProductJurisdictionObjectData ProductJurisdictionUpdateInIn) {
    ProductJurisdictionUpdateIn = ProductJurisdictionUpdateInIn;
  }

/**
 *
 * Sets the ProductJurisdictionUpdateFilter
 * @param ProductJurisdictionUpdateFilterIn Value of the ProductJurisdictionUpdateFilter
 *
 */

  public void setProductJurisdictionUpdateFilter(ProductJurisdictionObjectFilter ProductJurisdictionUpdateFilterIn) {
    ProductJurisdictionUpdateFilter = ProductJurisdictionUpdateFilterIn;
  }

/**
 *
 * Sets the ProductJurisdictionUpdateGet
 * @param ProductJurisdictionUpdateGetIn Value of the ProductJurisdictionUpdateGet
 *
 */

  public void setProductJurisdictionUpdateGet(ProductJurisdictionObjectData ProductJurisdictionUpdateGetIn) {
    ProductJurisdictionUpdateGet = ProductJurisdictionUpdateGetIn;
  }

  public void translateFromMap() {
    ProductJurisdictionUpdateIn = ProductJurisdictionObjectHelper.fromMap(inputMap, "ProductJurisdiction");
    ProductJurisdictionUpdateFilter = ProductJurisdictionObjectHelper.fromMapFilter(inputMap, "ProductJurisdictionUpdateFilter");
    ProductJurisdictionUpdateGet = ProductJurisdictionObjectHelper.fromMap(inputMap, "ProductJurisdictionUpdateGet");
  }

/**
 *
 * Gets the ProductJurisdiction
 * @return Value of the ProductJurisdiction
 *
 */

  public ProductJurisdictionObjectData getProductJurisdiction( ) {
    return ProductJurisdictionUpdateIn;
  }

/**
 *
 * Gets the ProductJurisdictionUpdateFilter
 * @return Value of the ProductJurisdictionUpdateFilter
 *
 */

  public ProductJurisdictionObjectFilter getProductJurisdictionUpdateFilter( ) {
    return ProductJurisdictionUpdateFilter;
  }

/**
 *
 * Gets the ProductJurisdictionUpdateGet
 * @return Value of the ProductJurisdictionUpdateGet
 *
 */

  public ProductJurisdictionObjectData getProductJurisdictionUpdateGet( ) {
    return ProductJurisdictionUpdateGet;
  }

}
