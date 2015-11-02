/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AdjTransGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjTransGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ATGObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AdjTransGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjTransGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ATGObjectDataList noOpInIn) {
    super(id, context, "AdjTransGroupFind");
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
        mapArray[i] = ATGObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdjTransGroup", noOpIn);
      }
      addInput("AdjTransGroup", mapList);
    }
  }
/**
 *
 * Sets the  AdjTransGroup
 * @param noOpInIn ATGObjectDataList to set
 *
 */
  public void setAdjTransGroup(ATGObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjTransGroup passed into the constructor
 * @return Simulated response
 *
 */
  public ATGObjectDataList getAdjTransGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ATGObjectHelper.fromMapList(inputMap, "AdjTransGroupList");
  }
}
