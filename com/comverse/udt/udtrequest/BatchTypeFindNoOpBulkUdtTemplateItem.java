/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeObjectDataList noOpInIn) {
    super(id, context, "BatchTypeFind");
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
        mapArray[i] = BatchTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchType", noOpIn);
      }
      addInput("BatchType", mapList);
    }
  }
/**
 *
 * Sets the  BatchType
 * @param noOpInIn BatchTypeObjectDataList to set
 *
 */
  public void setBatchType(BatchTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeObjectDataList getBatchType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchTypeObjectHelper.fromMapList(inputMap, "BatchTypeList");
  }
}
