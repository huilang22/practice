/*
 * Generated code DO NOT EDIT
 * Generated file: InvdWorkpointAssocFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdWorkpointAssocFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdWorkpointAssocFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdWorkpointAssocObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvdWorkpointAssocFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdWorkpointAssocFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdWorkpointAssocObjectDataList noOpInIn) {
    super(id, context, "InvdWorkpointAssocFind");
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
        mapArray[i] = InvdWorkpointAssocObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdWorkpointAssoc", noOpIn);
      }
      addInput("InvdWorkpointAssoc", mapList);
    }
  }
/**
 *
 * Sets the  InvdWorkpointAssoc
 * @param noOpInIn InvdWorkpointAssocObjectDataList to set
 *
 */
  public void setInvdWorkpointAssoc(InvdWorkpointAssocObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdWorkpointAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvdWorkpointAssocObjectDataList getInvdWorkpointAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdWorkpointAssocObjectHelper.fromMapList(inputMap, "InvdWorkpointAssocList");
  }
}
