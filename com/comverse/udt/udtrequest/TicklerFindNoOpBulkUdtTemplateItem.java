/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TicklerFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TicklerFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TicklerObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TicklerFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TicklerFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TicklerObjectDataList noOpInIn) {
    super(id, context, "TicklerFind");
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
        mapArray[i] = TicklerObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Tickler", noOpIn);
      }
      addInput("Tickler", mapList);
    }
  }
/**
 *
 * Sets the  Tickler
 * @param noOpInIn TicklerObjectDataList to set
 *
 */
  public void setTickler(TicklerObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Tickler passed into the constructor
 * @return Simulated response
 *
 */
  public TicklerObjectDataList getTickler() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TicklerObjectHelper.fromMapList(inputMap, "TicklerList");
  }
}
