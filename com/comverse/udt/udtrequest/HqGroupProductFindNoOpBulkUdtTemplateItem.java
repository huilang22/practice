/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupProductFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupProductFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupProductObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HqGroupProductFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupProductFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupProductObjectDataList noOpInIn) {
    super(id, context, "HqGroupProductFind");
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
        mapArray[i] = HqGroupProductObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroupProduct", noOpIn);
      }
      addInput("HqGroupProduct", mapList);
    }
  }
/**
 *
 * Sets the  HqGroupProduct
 * @param noOpInIn HqGroupProductObjectDataList to set
 *
 */
  public void setHqGroupProduct(HqGroupProductObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupProduct passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupProductObjectDataList getHqGroupProduct() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupProductObjectHelper.fromMapList(inputMap, "HqGroupProductList");
  }
}
