/*
 * Generated code DO NOT EDIT
 * Generated file: ProductJurisdictionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductJurisdictionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductJurisdictionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductJurisdictionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductJurisdictionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductJurisdictionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductJurisdictionObjectDataList noOpInIn) {
    super(id, context, "ProductJurisdictionFind");
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
        mapArray[i] = ProductJurisdictionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductJurisdiction", noOpIn);
      }
      addInput("ProductJurisdiction", mapList);
    }
  }
/**
 *
 * Sets the  ProductJurisdiction
 * @param noOpInIn ProductJurisdictionObjectDataList to set
 *
 */
  public void setProductJurisdiction(ProductJurisdictionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductJurisdiction passed into the constructor
 * @return Simulated response
 *
 */
  public ProductJurisdictionObjectDataList getProductJurisdiction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductJurisdictionObjectHelper.fromMapList(inputMap, "ProductJurisdictionList");
  }
}
