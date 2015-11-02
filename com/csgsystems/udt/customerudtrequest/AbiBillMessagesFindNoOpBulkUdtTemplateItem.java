/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillMessagesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AbiBillMessagesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AbiBillMessagesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AbiBillMessagesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AbiBillMessagesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AbiBillMessagesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillMessagesObjectDataList noOpInIn) {
    super(id, context, "AbiBillMessagesFind");
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
        mapArray[i] = AbiBillMessagesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AbiBillMessages", noOpIn);
      }
      addInput("AbiBillMessages", mapList);
    }
  }
/**
 *
 * Sets the  AbiBillMessages
 * @param noOpInIn AbiBillMessagesObjectDataList to set
 *
 */
  public void setAbiBillMessages(AbiBillMessagesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AbiBillMessages passed into the constructor
 * @return Simulated response
 *
 */
  public AbiBillMessagesObjectDataList getAbiBillMessages() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AbiBillMessagesObjectHelper.fromMapList(inputMap, "AbiBillMessagesList");
  }
}
