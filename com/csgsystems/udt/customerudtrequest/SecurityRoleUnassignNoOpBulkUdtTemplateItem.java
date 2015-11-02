/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityRoleUnassignNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SecurityRoleUnassignNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SecurityRoleUnassignNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SecurityRoleObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SecurityRoleUnassignNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SecurityRoleUnassignNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityRoleObjectDataList noOpInIn) {
    super(id, context, "SecurityRoleUnassign");
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
        mapArray[i] = SecurityRoleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SecurityRole", noOpIn);
      }
      addInput("SecurityRole", mapList);
    }
  }
/**
 *
 * Sets the  SecurityRole
 * @param noOpInIn SecurityRoleObjectDataList to set
 *
 */
  public void setSecurityRole(SecurityRoleObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SecurityRole passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityRoleObjectDataList getSecurityRole() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SecurityRoleObjectHelper.fromMapList(inputMap, "SecurityRoleList");
  }
}
