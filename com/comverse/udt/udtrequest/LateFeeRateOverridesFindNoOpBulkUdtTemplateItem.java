/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LateFeeRateOverridesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LateFeeRateOverridesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LateFeeRateOverridesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   LateFeeRateOverridesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LateFeeRateOverridesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LateFeeRateOverridesObjectDataList noOpInIn) {
    super(id, context, "LateFeeRateOverridesFind");
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
        mapArray[i] = LateFeeRateOverridesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LateFeeRateOverrides", noOpIn);
      }
      addInput("LateFeeRateOverrides", mapList);
    }
  }
/**
 *
 * Sets the  LateFeeRateOverrides
 * @param noOpInIn LateFeeRateOverridesObjectDataList to set
 *
 */
  public void setLateFeeRateOverrides(LateFeeRateOverridesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LateFeeRateOverrides passed into the constructor
 * @return Simulated response
 *
 */
  public LateFeeRateOverridesObjectDataList getLateFeeRateOverrides() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LateFeeRateOverridesObjectHelper.fromMapList(inputMap, "LateFeeRateOverridesList");
  }
}
