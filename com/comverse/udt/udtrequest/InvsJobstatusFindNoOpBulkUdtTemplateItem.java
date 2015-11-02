/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstatusFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsJobstatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsJobstatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsJobstatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsJobstatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsJobstatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobstatusObjectDataList noOpInIn) {
    super(id, context, "InvsJobstatusFind");
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
        mapArray[i] = InvsJobstatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsJobstatus", noOpIn);
      }
      addInput("InvsJobstatus", mapList);
    }
  }
/**
 *
 * Sets the  InvsJobstatus
 * @param noOpInIn InvsJobstatusObjectDataList to set
 *
 */
  public void setInvsJobstatus(InvsJobstatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsJobstatus passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobstatusObjectDataList getInvsJobstatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsJobstatusObjectHelper.fromMapList(inputMap, "InvsJobstatusList");
  }
}
