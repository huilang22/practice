/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyGroupMemberFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DependencyGroupMemberFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DependencyGroupMemberFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DependencyGroupMemberObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DependencyGroupMemberFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DependencyGroupMemberFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyGroupMemberObjectDataList noOpInIn) {
    super(id, context, "DependencyGroupMemberFind");
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
        mapArray[i] = DependencyGroupMemberObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DependencyGroupMember", noOpIn);
      }
      addInput("DependencyGroupMember", mapList);
    }
  }
/**
 *
 * Sets the  DependencyGroupMember
 * @param noOpInIn DependencyGroupMemberObjectDataList to set
 *
 */
  public void setDependencyGroupMember(DependencyGroupMemberObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DependencyGroupMember passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyGroupMemberObjectDataList getDependencyGroupMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DependencyGroupMemberObjectHelper.fromMapList(inputMap, "DependencyGroupMemberList");
  }
}
