/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsBlacklistFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsBlacklistFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsBlacklistObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsBlacklistFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsBlacklistFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsBlacklistObjectDataList noOpInIn) {
    super(id, context, "InvsBlacklistFind");
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
        mapArray[i] = InvsBlacklistObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsBlacklist", noOpIn);
      }
      addInput("InvsBlacklist", mapList);
    }
  }
/**
 *
 * Sets the  InvsBlacklist
 * @param noOpInIn InvsBlacklistObjectDataList to set
 *
 */
  public void setInvsBlacklist(InvsBlacklistObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsBlacklist passed into the constructor
 * @return Simulated response
 *
 */
  public InvsBlacklistObjectDataList getInvsBlacklist() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsBlacklistObjectHelper.fromMapList(inputMap, "InvsBlacklistList");
  }
}
