/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimCardConfigFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimCardConfigFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimCardConfigObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsSimCardConfigFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimCardConfigFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigObjectDataList noOpInIn) {
    super(id, context, "InvsSimCardConfigFind");
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
        mapArray[i] = InvsSimCardConfigObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimCardConfig", noOpIn);
      }
      addInput("InvsSimCardConfig", mapList);
    }
  }
/**
 *
 * Sets the  InvsSimCardConfig
 * @param noOpInIn InvsSimCardConfigObjectDataList to set
 *
 */
  public void setInvsSimCardConfig(InvsSimCardConfigObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimCardConfig passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimCardConfigObjectDataList getInvsSimCardConfig() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimCardConfigObjectHelper.fromMapList(inputMap, "InvsSimCardConfigList");
  }
}
