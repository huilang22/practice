/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstateFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsJobstateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsJobstateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsJobstateObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsJobstateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsJobstateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobstateObjectDataList noOpInIn) {
    super(id, context, "InvsJobstateFind");
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
        mapArray[i] = InvsJobstateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsJobstate", noOpIn);
      }
      addInput("InvsJobstate", mapList);
    }
  }
/**
 *
 * Sets the  InvsJobstate
 * @param noOpInIn InvsJobstateObjectDataList to set
 *
 */
  public void setInvsJobstate(InvsJobstateObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsJobstate passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobstateObjectDataList getInvsJobstate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsJobstateObjectHelper.fromMapList(inputMap, "InvsJobstateList");
  }
}
