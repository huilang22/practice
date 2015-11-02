/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductGroupServiceFilterCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductGroupServiceFilterCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PGSFObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductGroupServiceFilterCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductGroupServiceFilterCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PGSFObjectData noOpInIn) {
    super(id, context, "ProductGroupServiceFilterCreate");
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
