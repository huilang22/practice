/*
 * Generated code DO NOT EDIT
 * Generated file: ProductChargeMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductChargeMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductChargeMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductChargeMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductChargeMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductChargeMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductChargeMapObjectDataList noOpInIn) {
    super(id, context, "ProductChargeMapFind");
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
        mapArray[i] = ProductChargeMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductChargeMap", noOpIn);
      }
      addInput("ProductChargeMap", mapList);
    }
  }
/**
 *
 * Sets the  ProductChargeMap
 * @param noOpInIn ProductChargeMapObjectDataList to set
 *
 */
  public void setProductChargeMap(ProductChargeMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductChargeMap passed into the constructor
 * @return Simulated response
 *
 */
  public ProductChargeMapObjectDataList getProductChargeMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductChargeMapObjectHelper.fromMapList(inputMap, "ProductChargeMapList");
  }
}
