/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductLineFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductLineFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductLineObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductLineFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductLineFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductLineObjectDataList noOpInIn) {
    super(id, context, "ProductLineFind");
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
        mapArray[i] = ProductLineObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductLine", noOpIn);
      }
      addInput("ProductLine", mapList);
    }
  }
/**
 *
 * Sets the  ProductLine
 * @param noOpInIn ProductLineObjectDataList to set
 *
 */
  public void setProductLine(ProductLineObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductLine passed into the constructor
 * @return Simulated response
 *
 */
  public ProductLineObjectDataList getProductLine() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductLineObjectHelper.fromMapList(inputMap, "ProductLineList");
  }
}
