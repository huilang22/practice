/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdActionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdActionObjectDataList noOpInIn) {
    super(id, context, "BsdActionFind");
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
        mapArray[i] = BsdActionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAction", noOpIn);
      }
      addInput("BsdAction", mapList);
    }
  }
/**
 *
 * Sets the  BsdAction
 * @param noOpInIn BsdActionObjectDataList to set
 *
 */
  public void setBsdAction(BsdActionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAction passed into the constructor
 * @return Simulated response
 *
 */
  public BsdActionObjectDataList getBsdAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdActionObjectHelper.fromMapList(inputMap, "BsdActionList");
  }
}
