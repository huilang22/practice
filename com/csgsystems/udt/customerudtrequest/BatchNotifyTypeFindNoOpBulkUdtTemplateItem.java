/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyTypeFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a BatchNotifyTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchNotifyTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchNotifyTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchNotifyTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchNotifyTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyTypeObjectDataList noOpInIn) {
    super(id, context, "BatchNotifyTypeFind");
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
        mapArray[i] = BatchNotifyTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchNotifyType", noOpIn);
      }
      addInput("BatchNotifyType", mapList);
    }
  }
/**
 *
 * Sets the  BatchNotifyType
 * @param noOpInIn BatchNotifyTypeObjectDataList to set
 *
 */
  public void setBatchNotifyType(BatchNotifyTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchNotifyType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchNotifyTypeObjectDataList getBatchNotifyType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchNotifyTypeObjectHelper.fromMapList(inputMap, "BatchNotifyTypeList");
  }
}
