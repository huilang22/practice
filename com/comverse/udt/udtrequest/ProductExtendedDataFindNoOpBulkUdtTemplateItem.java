/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductExtendedDataFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductEDObjectDataList noOpInIn) {
    super(id, context, "ProductExtendedDataFind");
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
        mapArray[i] = ProductEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductExtendedData", noOpIn);
      }
      addInput("ProductExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  ProductExtendedData
 * @param noOpInIn ProductEDObjectDataList to set
 *
 */
  public void setProductExtendedData(ProductEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductEDObjectDataList getProductExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductEDObjectHelper.fromMapList(inputMap, "ProductExtendedDataList");
  }
}
