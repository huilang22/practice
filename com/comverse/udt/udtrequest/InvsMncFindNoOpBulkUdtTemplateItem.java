/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsMncFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsMncFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsMncObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsMncFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsMncFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMncObjectDataList noOpInIn) {
    super(id, context, "InvsMncFind");
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
        mapArray[i] = InvsMncObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsMnc", noOpIn);
      }
      addInput("InvsMnc", mapList);
    }
  }
/**
 *
 * Sets the  InvsMnc
 * @param noOpInIn InvsMncObjectDataList to set
 *
 */
  public void setInvsMnc(InvsMncObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsMnc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsMncObjectDataList getInvsMnc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsMncObjectHelper.fromMapList(inputMap, "InvsMncList");
  }
}
