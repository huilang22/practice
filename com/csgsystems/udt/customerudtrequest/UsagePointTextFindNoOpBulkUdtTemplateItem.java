/*
 * Generated code DO NOT EDIT
 * Generated file: UsagePointTextFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UsagePointTextFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsagePointTextFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsagePointTextObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsagePointTextFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsagePointTextFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsagePointTextObjectDataList noOpInIn) {
    super(id, context, "UsagePointTextFind");
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
        mapArray[i] = UsagePointTextObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsagePointText", noOpIn);
      }
      addInput("UsagePointText", mapList);
    }
  }
/**
 *
 * Sets the  UsagePointText
 * @param noOpInIn UsagePointTextObjectDataList to set
 *
 */
  public void setUsagePointText(UsagePointTextObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsagePointText passed into the constructor
 * @return Simulated response
 *
 */
  public UsagePointTextObjectDataList getUsagePointText() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsagePointTextObjectHelper.fromMapList(inputMap, "UsagePointTextList");
  }
}
