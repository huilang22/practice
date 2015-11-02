/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductGroupObjectDataList noOpInIn) {
    super(id, context, "ProductGroupFind");
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
        mapArray[i] = ProductGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductGroup", noOpIn);
      }
      addInput("ProductGroup", mapList);
    }
  }
/**
 *
 * Sets the  ProductGroup
 * @param noOpInIn ProductGroupObjectDataList to set
 *
 */
  public void setProductGroup(ProductGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductGroup passed into the constructor
 * @return Simulated response
 *
 */
  public ProductGroupObjectDataList getProductGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductGroupObjectHelper.fromMapList(inputMap, "ProductGroupList");
  }
}
