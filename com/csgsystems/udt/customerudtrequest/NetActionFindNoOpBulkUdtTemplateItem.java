/*
 * Generated code DO NOT EDIT
 * Generated file: NetActionFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a NetActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NetActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NetActionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NetActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NetActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NetActionObjectDataList noOpInIn) {
    super(id, context, "NetActionFind");
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
        mapArray[i] = NetActionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NetAction", noOpIn);
      }
      addInput("NetAction", mapList);
    }
  }
/**
 *
 * Sets the  NetAction
 * @param noOpInIn NetActionObjectDataList to set
 *
 */
  public void setNetAction(NetActionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NetAction passed into the constructor
 * @return Simulated response
 *
 */
  public NetActionObjectDataList getNetAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NetActionObjectHelper.fromMapList(inputMap, "NetActionList");
  }
}
