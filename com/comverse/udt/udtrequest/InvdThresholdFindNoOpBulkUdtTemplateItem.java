/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdThresholdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdThresholdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdThresholdObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvdThresholdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdThresholdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdThresholdObjectDataList noOpInIn) {
    super(id, context, "InvdThresholdFind");
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
        mapArray[i] = InvdThresholdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdThreshold", noOpIn);
      }
      addInput("InvdThreshold", mapList);
    }
  }
/**
 *
 * Sets the  InvdThreshold
 * @param noOpInIn InvdThresholdObjectDataList to set
 *
 */
  public void setInvdThreshold(InvdThresholdObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdThreshold passed into the constructor
 * @return Simulated response
 *
 */
  public InvdThresholdObjectDataList getInvdThreshold() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdThresholdObjectHelper.fromMapList(inputMap, "InvdThresholdList");
  }
}
