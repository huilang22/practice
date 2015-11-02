/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsThresholdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsThresholdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsThresholdObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsThresholdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsThresholdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsThresholdObjectDataList noOpInIn) {
    super(id, context, "InvsThresholdFind");
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
        mapArray[i] = InvsThresholdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsThreshold", noOpIn);
      }
      addInput("InvsThreshold", mapList);
    }
  }
/**
 *
 * Sets the  InvsThreshold
 * @param noOpInIn InvsThresholdObjectDataList to set
 *
 */
  public void setInvsThreshold(InvsThresholdObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsThreshold passed into the constructor
 * @return Simulated response
 *
 */
  public InvsThresholdObjectDataList getInvsThreshold() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsThresholdObjectHelper.fromMapList(inputMap, "InvsThresholdList");
  }
}
