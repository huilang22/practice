/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageOverridesFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ProductPackageOverridesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductPackageOverridesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductPackageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductPackageOverridesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductPackageOverridesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectDataList noOpInIn) {
    super(id, context, "ProductPackageOverridesFind");
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
        mapArray[i] = ProductPackageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductPackage", noOpIn);
      }
      addInput("ProductPackage", mapList);
    }
  }
/**
 *
 * Sets the  ProductPackage
 * @param noOpInIn ProductPackageObjectDataList to set
 *
 */
  public void setProductPackage(ProductPackageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductPackage passed into the constructor
 * @return Simulated response
 *
 */
  public ProductPackageObjectDataList getProductPackage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductPackageObjectHelper.fromMapList(inputMap, "ProductPackageList");
  }
}
