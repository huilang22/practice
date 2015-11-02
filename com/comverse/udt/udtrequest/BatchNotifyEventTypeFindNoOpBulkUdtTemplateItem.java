/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchNotifyEventTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchNotifyEventTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchNotifyEventTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchNotifyEventTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchNotifyEventTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyEventTypeObjectDataList noOpInIn) {
    super(id, context, "BatchNotifyEventTypeFind");
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
        mapArray[i] = BatchNotifyEventTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchNotifyEventType", noOpIn);
      }
      addInput("BatchNotifyEventType", mapList);
    }
  }
/**
 *
 * Sets the  BatchNotifyEventType
 * @param noOpInIn BatchNotifyEventTypeObjectDataList to set
 *
 */
  public void setBatchNotifyEventType(BatchNotifyEventTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchNotifyEventType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchNotifyEventTypeObjectDataList getBatchNotifyEventType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchNotifyEventTypeObjectHelper.fromMapList(inputMap, "BatchNotifyEventTypeList");
  }
}
