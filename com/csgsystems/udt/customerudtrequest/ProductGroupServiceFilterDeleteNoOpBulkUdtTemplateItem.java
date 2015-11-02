/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupServiceFilterDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductGroupServiceFilterDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductGroupServiceFilterDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PGSFObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductGroupServiceFilterDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductGroupServiceFilterDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PGSFObjectData noOpInIn) {
    super(id, context, "ProductGroupServiceFilterDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(noOpIn, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }
/**
 *
 * Sets the  ProductGroupServiceFilter
 * @param noOpInIn PGSFObjectData to set
 *
 */
  public void setProductGroupServiceFilter(PGSFObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductGroupServiceFilter passed into the constructor
 * @return Simulated response
 *
 */
  public PGSFObjectData getProductGroupServiceFilter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PGSFObjectHelper.fromMap(inputMap, "ProductGroupServiceFilter");
  }
}
