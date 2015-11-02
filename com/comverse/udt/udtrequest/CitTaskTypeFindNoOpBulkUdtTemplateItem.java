/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitTaskTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CitTaskTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskTypeObjectDataList noOpInIn) {
    super(id, context, "CitTaskTypeFind");
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
        mapArray[i] = CitTaskTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitTaskType", noOpIn);
      }
      addInput("CitTaskType", mapList);
    }
  }
/**
 *
 * Sets the  CitTaskType
 * @param noOpInIn CitTaskTypeObjectDataList to set
 *
 */
  public void setCitTaskType(CitTaskTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTaskType passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskTypeObjectDataList getCitTaskType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskTypeObjectHelper.fromMapList(inputMap, "CitTaskTypeList");
  }
}
