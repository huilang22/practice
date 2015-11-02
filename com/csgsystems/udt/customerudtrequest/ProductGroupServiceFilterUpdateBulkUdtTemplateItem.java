/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupServiceFilterUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProductGroupServiceFilterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGroupServiceFilterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PGSFObjectData PSGFupdate_In;
/**
 *
 * Constructor to create a  ProductGroupServiceFilterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGroupServiceFilterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PGSFObjectData PSGFupdate_InIn) {
    super(id, context, "ProductGroupServiceFilterUpdate");
    PSGFupdate_In = PSGFupdate_InIn;
  }

  public void translateToMap() {
    if (PSGFupdate_In != null) {
      PSGFupdate_In.resetFlags(true, true);
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(PSGFupdate_In, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }


/**
 *
 * Sets the ProductGroupServiceFilter
 * @param PSGFupdate_InIn Value of the PSGFupdate_In
 *
 */

  public void setProductGroupServiceFilter(PGSFObjectData PSGFupdate_InIn) {
    PSGFupdate_In = PSGFupdate_InIn;
  }

  public void translateFromMap() {
    PSGFupdate_In = PGSFObjectHelper.fromMap(inputMap, "ProductGroupServiceFilter");
  }

/**
 *
 * Gets the ProductGroupServiceFilter
 * @return Value of the ProductGroupServiceFilter
 *
 */

  public PGSFObjectData getProductGroupServiceFilter( ) {
    return PSGFupdate_In;
  }

}
