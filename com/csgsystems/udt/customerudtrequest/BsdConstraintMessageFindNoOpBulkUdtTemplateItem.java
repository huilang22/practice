/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintMessageFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdConstraintMessageFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdConstraintMessageFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdConstraintMessageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdConstraintMessageFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdConstraintMessageFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintMessageObjectDataList noOpInIn) {
    super(id, context, "BsdConstraintMessageFind");
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
        mapArray[i] = BsdConstraintMessageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdConstraintMessage", noOpIn);
      }
      addInput("BsdConstraintMessage", mapList);
    }
  }
/**
 *
 * Sets the  BsdConstraintMessage
 * @param noOpInIn BsdConstraintMessageObjectDataList to set
 *
 */
  public void setBsdConstraintMessage(BsdConstraintMessageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdConstraintMessage passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintMessageObjectDataList getBsdConstraintMessage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdConstraintMessageObjectHelper.fromMapList(inputMap, "BsdConstraintMessageList");
  }
}
