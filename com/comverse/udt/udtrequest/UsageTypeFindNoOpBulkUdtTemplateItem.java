/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsageTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeObjectDataList noOpInIn) {
    super(id, context, "UsageTypeFind");
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
        mapArray[i] = UsageTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageType", noOpIn);
      }
      addInput("UsageType", mapList);
    }
  }
/**
 *
 * Sets the  UsageType
 * @param noOpInIn UsageTypeObjectDataList to set
 *
 */
  public void setUsageType(UsageTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageType passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeObjectDataList getUsageType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageTypeObjectHelper.fromMapList(inputMap, "UsageTypeList");
  }
}
