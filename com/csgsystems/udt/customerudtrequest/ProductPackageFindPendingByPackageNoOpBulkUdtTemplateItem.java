/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageFindPendingByPackageNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ProductPackageFindPendingByPackageNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductPackageFindPendingByPackageNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductPackageServiceOrderObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductPackageFindPendingByPackageNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductPackageFindPendingByPackageNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageServiceOrderObjectDataList noOpInIn) {
    super(id, context, "ProductPackageFindPendingByPackage");
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
        mapArray[i] = ProductPackageServiceOrderObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductPackage", noOpIn);
      }
      addInput("ProductPackage", mapList);
    }
  }
/**
 *
 * Sets the  ProductPackage
 * @param noOpInIn ProductPackageServiceOrderObjectDataList to set
 *
 */
  public void setProductPackage(ProductPackageServiceOrderObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductPackage passed into the constructor
 * @return Simulated response
 *
 */
  public ProductPackageServiceOrderObjectDataList getProductPackage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductPackageServiceOrderObjectHelper.fromMapList(inputMap, "ProductPackageList");
  }
}
