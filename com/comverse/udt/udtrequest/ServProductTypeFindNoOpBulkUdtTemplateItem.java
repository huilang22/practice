/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServProductTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a ServProductTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServProductTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductElementObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServProductTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServProductTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementObjectDataList noOpInIn) {
    super(id, context, "ServProductTypeFind");
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
        mapArray[i] = ProductElementObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductElement", noOpIn);
      }
      addInput("ProductElement", mapList);
    }
  }
/**
 *
 * Sets the  ProductElement
 * @param noOpInIn ProductElementObjectDataList to set
 *
 */
  public void setProductElement(ProductElementObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductElement passed into the constructor
 * @return Simulated response
 *
 */
  public ProductElementObjectDataList getProductElement() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductElementObjectHelper.fromMapList(inputMap, "ProductElementList");
  }
}
