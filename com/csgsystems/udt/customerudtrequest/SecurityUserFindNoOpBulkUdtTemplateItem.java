/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityUserFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SecurityUserFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SecurityUserFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SecurityUserObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SecurityUserFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SecurityUserFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityUserObjectDataList noOpInIn) {
    super(id, context, "SecurityUserFind");
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
        mapArray[i] = SecurityUserObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SecurityUser", noOpIn);
      }
      addInput("SecurityUser", mapList);
    }
  }
/**
 *
 * Sets the  SecurityUser
 * @param noOpInIn SecurityUserObjectDataList to set
 *
 */
  public void setSecurityUser(SecurityUserObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SecurityUser passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityUserObjectDataList getSecurityUser() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SecurityUserObjectHelper.fromMapList(inputMap, "SecurityUserList");
  }
}
