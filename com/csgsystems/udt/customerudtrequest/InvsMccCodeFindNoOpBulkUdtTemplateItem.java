/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMccCodeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsMccCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsMccCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsMccCodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsMccCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsMccCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMccCodeObjectDataList noOpInIn) {
    super(id, context, "InvsMccCodeFind");
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
        mapArray[i] = InvsMccCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsMccCode", noOpIn);
      }
      addInput("InvsMccCode", mapList);
    }
  }
/**
 *
 * Sets the  InvsMccCode
 * @param noOpInIn InvsMccCodeObjectDataList to set
 *
 */
  public void setInvsMccCode(InvsMccCodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsMccCode passed into the constructor
 * @return Simulated response
 *
 */
  public InvsMccCodeObjectDataList getInvsMccCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsMccCodeObjectHelper.fromMapList(inputMap, "InvsMccCodeList");
  }
}
