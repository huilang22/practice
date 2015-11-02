/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupMembersFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupMembersFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupMembersFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupMembersObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HqGroupMembersFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupMembersFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupMembersObjectDataList noOpInIn) {
    super(id, context, "HqGroupMembersFind");
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
        mapArray[i] = HqGroupMembersObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroupMembers", noOpIn);
      }
      addInput("HqGroupMembers", mapList);
    }
  }
/**
 *
 * Sets the  HqGroupMembers
 * @param noOpInIn HqGroupMembersObjectDataList to set
 *
 */
  public void setHqGroupMembers(HqGroupMembersObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupMembers passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupMembersObjectDataList getHqGroupMembers() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupMembersObjectHelper.fromMapList(inputMap, "HqGroupMembersList");
  }
}
