/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateOverrideFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductRateOverrideFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductRateOverrideFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductRateOverrideObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductRateOverrideFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductRateOverrideFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateOverrideObjectDataList noOpInIn) {
    super(id, context, "ProductRateOverrideFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ProductRateOverrideObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductRateOverride", noOpIn);
      }
      addInput("ProductRateOverride", mapList);
    }
  }
/**
 *
 * Sets the  ProductRateOverride
 * @param noOpInIn ProductRateOverrideObjectDataList to set
 *
 */
  public void setProductRateOverride(ProductRateOverrideObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductRateOverride passed into the constructor
 * @return Simulated response
 *
 */
  public ProductRateOverrideObjectDataList getProductRateOverride() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductRateOverrideObjectHelper.fromMapList(inputMap, "ProductRateOverrideList");
  }
}
