/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupServiceFilterFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ProductGroupServiceFilterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGroupServiceFilterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PGSFObjectFilter PSGFfind_In;
/**
 *
 * Constructor to create a  ProductGroupServiceFilterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGroupServiceFilterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PGSFObjectFilter PSGFfind_InIn) {
    super(id, context, "ProductGroupServiceFilterFind");
    PSGFfind_In = PSGFfind_InIn;
  }

  public void translateToMap() {
    if (PSGFfind_In != null) {
      Integer index =  PSGFfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(PSGFfind_In, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }


/**
 *
 * Sets the ProductGroupServiceFilter
 * @param PSGFfind_InIn Value of the PSGFfind_In
 *
 */

  public void setProductGroupServiceFilter(PGSFObjectFilter PSGFfind_InIn) {
    PSGFfind_In = PSGFfind_InIn;
  }

  public void translateFromMap() {
    PSGFfind_In = PGSFObjectHelper.fromMapFilter(inputMap, "ProductGroupServiceFilter");
  }

/**
 *
 * Gets the ProductGroupServiceFilter
 * @return Value of the ProductGroupServiceFilter
 *
 */

  public PGSFObjectFilter getProductGroupServiceFilter( ) {
    return PSGFfind_In;
  }

}
