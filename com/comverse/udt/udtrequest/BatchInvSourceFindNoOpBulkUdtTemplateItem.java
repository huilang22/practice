/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchInvSourceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchInvSourceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BISObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchInvSourceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchInvSourceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BISObjectDataList noOpInIn) {
    super(id, context, "BatchInvSourceFind");
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
        mapArray[i] = BISObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchInvSource", noOpIn);
      }
      addInput("BatchInvSource", mapList);
    }
  }
/**
 *
 * Sets the  BatchInvSource
 * @param noOpInIn BISObjectDataList to set
 *
 */
  public void setBatchInvSource(BISObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchInvSource passed into the constructor
 * @return Simulated response
 *
 */
  public BISObjectDataList getBatchInvSource() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BISObjectHelper.fromMapList(inputMap, "BatchInvSourceList");
  }
}
