/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   StatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusObjectDataList noOpInIn) {
    super(id, context, "StatusFind");
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
        mapArray[i] = StatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Status", noOpIn);
      }
      addInput("Status", mapList);
    }
  }
/**
 *
 * Sets the  Status
 * @param noOpInIn StatusObjectDataList to set
 *
 */
  public void setStatus(StatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Status passed into the constructor
 * @return Simulated response
 *
 */
  public StatusObjectDataList getStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatusObjectHelper.fromMapList(inputMap, "StatusList");
  }
}
