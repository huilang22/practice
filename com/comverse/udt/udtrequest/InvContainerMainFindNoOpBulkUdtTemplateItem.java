/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerMainFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvContainerMainFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvContainerMainFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvContainerMainObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvContainerMainFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvContainerMainFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerMainObjectDataList noOpInIn) {
    super(id, context, "InvContainerMainFind");
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
        mapArray[i] = InvContainerMainObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvContainerMain", noOpIn);
      }
      addInput("InvContainerMain", mapList);
    }
  }
/**
 *
 * Sets the  InvContainerMain
 * @param noOpInIn InvContainerMainObjectDataList to set
 *
 */
  public void setInvContainerMain(InvContainerMainObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvContainerMain passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerMainObjectDataList getInvContainerMain() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvContainerMainObjectHelper.fromMapList(inputMap, "InvContainerMainList");
  }
}
