/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchCategoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchCategoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchCategoryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchCategoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchCategoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchCategoryObjectDataList noOpInIn) {
    super(id, context, "BatchCategoryFind");
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
        mapArray[i] = BatchCategoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchCategory", noOpIn);
      }
      addInput("BatchCategory", mapList);
    }
  }
/**
 *
 * Sets the  BatchCategory
 * @param noOpInIn BatchCategoryObjectDataList to set
 *
 */
  public void setBatchCategory(BatchCategoryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchCategory passed into the constructor
 * @return Simulated response
 *
 */
  public BatchCategoryObjectDataList getBatchCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchCategoryObjectHelper.fromMapList(inputMap, "BatchCategoryList");
  }
}
