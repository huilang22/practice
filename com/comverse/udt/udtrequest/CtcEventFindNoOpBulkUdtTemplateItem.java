/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcEventFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcEventFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcEventFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcEventObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcEventFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcEventFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcEventObjectDataList noOpInIn) {
    super(id, context, "CtcEventFind");
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
        mapArray[i] = CtcEventObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcEvent", noOpIn);
      }
      addInput("CtcEvent", mapList);
    }
  }
/**
 *
 * Sets the  CtcEvent
 * @param noOpInIn CtcEventObjectDataList to set
 *
 */
  public void setCtcEvent(CtcEventObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcEvent passed into the constructor
 * @return Simulated response
 *
 */
  public CtcEventObjectDataList getCtcEvent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcEventObjectHelper.fromMapList(inputMap, "CtcEventList");
  }
}
