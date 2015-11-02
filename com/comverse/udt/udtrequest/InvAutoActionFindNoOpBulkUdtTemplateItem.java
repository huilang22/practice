/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvAutoActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvAutoActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvAutoActionObjDataList noOpIn;

/**
 *
 * Constructor to create a   InvAutoActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvAutoActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvAutoActionObjDataList noOpInIn) {
    super(id, context, "InvAutoActionFind");
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
        mapArray[i] = InvAutoActionObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvAutoAction", noOpIn);
      }
      addInput("InvAutoAction", mapList);
    }
  }
/**
 *
 * Sets the  InvAutoAction
 * @param noOpInIn InvAutoActionObjDataList to set
 *
 */
  public void setInvAutoAction(InvAutoActionObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvAutoAction passed into the constructor
 * @return Simulated response
 *
 */
  public InvAutoActionObjDataList getInvAutoAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvAutoActionObjHelper.fromMapList(inputMap, "InvAutoActionList");
  }
}
