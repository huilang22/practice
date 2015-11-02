/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTemplateTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchTemplateTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchTemplateTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchTemplateTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchTemplateTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchTemplateTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTemplateTypeObjectDataList noOpInIn) {
    super(id, context, "BatchTemplateTypeFind");
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
        mapArray[i] = BatchTemplateTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchTemplateType", noOpIn);
      }
      addInput("BatchTemplateType", mapList);
    }
  }
/**
 *
 * Sets the  BatchTemplateType
 * @param noOpInIn BatchTemplateTypeObjectDataList to set
 *
 */
  public void setBatchTemplateType(BatchTemplateTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchTemplateType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTemplateTypeObjectDataList getBatchTemplateType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchTemplateTypeObjectHelper.fromMapList(inputMap, "BatchTemplateTypeList");
  }
}
