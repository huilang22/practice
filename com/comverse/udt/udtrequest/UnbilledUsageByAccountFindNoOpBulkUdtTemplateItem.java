/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageByAccountFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnbilledUsageByAccountFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnbilledUsageByAccountFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnbilledUsageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UnbilledUsageByAccountFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnbilledUsageByAccountFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectDataList noOpInIn) {
    super(id, context, "UnbilledUsageByAccountFind");
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
        mapArray[i] = UnbilledUsageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnbilledUsage", noOpIn);
      }
      addInput("UnbilledUsage", mapList);
    }
  }
/**
 *
 * Sets the  UnbilledUsage
 * @param noOpInIn UnbilledUsageObjectDataList to set
 *
 */
  public void setUnbilledUsage(UnbilledUsageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnbilledUsage passed into the constructor
 * @return Simulated response
 *
 */
  public UnbilledUsageObjectDataList getUnbilledUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnbilledUsageObjectHelper.fromMapList(inputMap, "UnbilledUsageList");
  }
}
