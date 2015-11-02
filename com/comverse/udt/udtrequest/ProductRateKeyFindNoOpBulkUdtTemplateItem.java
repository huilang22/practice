/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ProductRateKeyFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductRateKeyFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductRateKeyObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductRateKeyFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductRateKeyFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateKeyObjectDataList noOpInIn) {
    super(id, context, "ProductRateKeyFind");
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
        mapArray[i] = ProductRateKeyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductRateKey", noOpIn);
      }
      addInput("ProductRateKey", mapList);
    }
  }
/**
 *
 * Sets the  ProductRateKey
 * @param noOpInIn ProductRateKeyObjectDataList to set
 *
 */
  public void setProductRateKey(ProductRateKeyObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductRateKey passed into the constructor
 * @return Simulated response
 *
 */
  public ProductRateKeyObjectDataList getProductRateKey() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductRateKeyObjectHelper.fromMapList(inputMap, "ProductRateKeyList");
  }
}
