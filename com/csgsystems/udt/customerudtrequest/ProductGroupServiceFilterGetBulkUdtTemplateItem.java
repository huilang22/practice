/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupServiceFilterGetBulkUdtTemplateItem.java
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
 * Class used to create a ProductGroupServiceFilterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGroupServiceFilterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PGSFObjectKeyData PGSFget_In;
/**
 *
 * Constructor to create a  ProductGroupServiceFilterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGroupServiceFilterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PGSFObjectKeyData PGSFget_InIn) {
    super(id, context, "ProductGroupServiceFilterGet");
    PGSFget_In = PGSFget_InIn;
  }

  public void translateToMap() {
    if (PGSFget_In != null) {
      PGSFget_In.resetFlags(true, true);
      addInput("ProductGroupServiceFilter", PGSFObjectKeyHelper.toMap(PGSFget_In, new HashMap(), "PGSFObjectKeyData").get("PGSFObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductGroupServiceFilter
 * @param PGSFget_InIn Value of the PGSFget_In
 *
 */

  public void setProductGroupServiceFilter(PGSFObjectKeyData PGSFget_InIn) {
    PGSFget_In = PGSFget_InIn;
  }

  public void translateFromMap() {
    PGSFget_In = PGSFObjectKeyHelper.fromMap(inputMap, "ProductGroupServiceFilter");
  }

/**
 *
 * Gets the ProductGroupServiceFilter
 * @return Value of the ProductGroupServiceFilter
 *
 */

  public PGSFObjectKeyData getProductGroupServiceFilter( ) {
    return PGSFget_In;
  }

}
