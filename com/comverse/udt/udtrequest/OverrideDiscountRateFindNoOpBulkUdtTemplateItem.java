/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OverrideDiscountRateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OverrideDiscountRateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RDOverrideObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OverrideDiscountRateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OverrideDiscountRateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RDOverrideObjectDataList noOpInIn) {
    super(id, context, "OverrideDiscountRateFind");
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
        mapArray[i] = RDOverrideObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OverrideDiscountRate", noOpIn);
      }
      addInput("OverrideDiscountRate", mapList);
    }
  }
/**
 *
 * Sets the  OverrideDiscountRate
 * @param noOpInIn RDOverrideObjectDataList to set
 *
 */
  public void setOverrideDiscountRate(RDOverrideObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OverrideDiscountRate passed into the constructor
 * @return Simulated response
 *
 */
  public RDOverrideObjectDataList getOverrideDiscountRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RDOverrideObjectHelper.fromMapList(inputMap, "OverrideDiscountRateList");
  }
}
