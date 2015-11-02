/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatusReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatusReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   StatusReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusReasonObjectDataList noOpInIn) {
    super(id, context, "StatusReasonFind");
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
        mapArray[i] = StatusReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("StatusReason", noOpIn);
      }
      addInput("StatusReason", mapList);
    }
  }
/**
 *
 * Sets the  StatusReason
 * @param noOpInIn StatusReasonObjectDataList to set
 *
 */
  public void setStatusReason(StatusReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatusReason passed into the constructor
 * @return Simulated response
 *
 */
  public StatusReasonObjectDataList getStatusReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatusReasonObjectHelper.fromMapList(inputMap, "StatusReasonList");
  }
}
