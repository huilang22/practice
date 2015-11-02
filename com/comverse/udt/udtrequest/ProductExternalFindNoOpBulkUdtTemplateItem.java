/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductExternalFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductExternalFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductExternalFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductExternalFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductExternalFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectDataList noOpInIn) {
    super(id, context, "ProductExternalFind");
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
        mapArray[i] = ProductObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Product", noOpIn);
      }
      addInput("Product", mapList);
    }
  }
/**
 *
 * Sets the  Product
 * @param noOpInIn ProductObjectDataList to set
 *
 */
  public void setProduct(ProductObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Product passed into the constructor
 * @return Simulated response
 *
 */
  public ProductObjectDataList getProduct() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductObjectHelper.fromMapList(inputMap, "ProductList");
  }
}
