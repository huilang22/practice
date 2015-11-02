/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductFindByServiceOrderNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductFindByServiceOrderNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductFindByServiceOrderNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductObjectBaseDataList noOpIn;

/**
 *
 * Constructor to create a   ProductFindByServiceOrderNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductFindByServiceOrderNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectBaseDataList noOpInIn) {
    super(id, context, "ProductFindByServiceOrder");
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
        mapArray[i] = ProductObjectBaseHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Product", noOpIn);
      }
      addInput("Product", mapList);
    }
  }
/**
 *
 * Sets the  Product
 * @param noOpInIn ProductObjectBaseDataList to set
 *
 */
  public void setProduct(ProductObjectBaseDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Product passed into the constructor
 * @return Simulated response
 *
 */
  public ProductObjectBaseDataList getProduct() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductObjectBaseHelper.fromMapList(inputMap, "ProductList");
  }
}
