/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatusTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatusTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   StatusTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusTypeObjectDataList noOpInIn) {
    super(id, context, "StatusTypeFind");
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
        mapArray[i] = StatusTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("StatusType", noOpIn);
      }
      addInput("StatusType", mapList);
    }
  }
/**
 *
 * Sets the  StatusType
 * @param noOpInIn StatusTypeObjectDataList to set
 *
 */
  public void setStatusType(StatusTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatusType passed into the constructor
 * @return Simulated response
 *
 */
  public StatusTypeObjectDataList getStatusType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatusTypeObjectHelper.fromMapList(inputMap, "StatusTypeList");
  }
}
