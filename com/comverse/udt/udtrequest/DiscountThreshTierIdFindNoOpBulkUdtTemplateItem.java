/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountThreshTierIdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountThreshTierIdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DTTObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DiscountThreshTierIdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountThreshTierIdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DTTObjectDataList noOpInIn) {
    super(id, context, "DiscountThreshTierIdFind");
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
        mapArray[i] = DTTObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscountThreshTierId", noOpIn);
      }
      addInput("DiscountThreshTierId", mapList);
    }
  }
/**
 *
 * Sets the  DiscountThreshTierId
 * @param noOpInIn DTTObjectDataList to set
 *
 */
  public void setDiscountThreshTierId(DTTObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountThreshTierId passed into the constructor
 * @return Simulated response
 *
 */
  public DTTObjectDataList getDiscountThreshTierId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DTTObjectHelper.fromMapList(inputMap, "DiscountThreshTierIdList");
  }
}
