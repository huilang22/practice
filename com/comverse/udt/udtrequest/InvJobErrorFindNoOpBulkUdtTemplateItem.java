/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobErrorFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvJobErrorFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvJobErrorFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvJobErrorObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvJobErrorFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvJobErrorFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobErrorObjectDataList noOpInIn) {
    super(id, context, "InvJobErrorFind");
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
        mapArray[i] = InvJobErrorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvJobError", noOpIn);
      }
      addInput("InvJobError", mapList);
    }
  }
/**
 *
 * Sets the  InvJobError
 * @param noOpInIn InvJobErrorObjectDataList to set
 *
 */
  public void setInvJobError(InvJobErrorObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvJobError passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobErrorObjectDataList getInvJobError() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvJobErrorObjectHelper.fromMapList(inputMap, "InvJobErrorList");
  }
}
