/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityUserGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SecurityUserGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SecurityUserGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SecurityUserObjectData noOpIn;

/**
 *
 * Constructor to create a   SecurityUserGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SecurityUserGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityUserObjectData noOpInIn) {
    super(id, context, "SecurityUserGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SecurityUser", SecurityUserObjectHelper.toMap(noOpIn, new HashMap(), "SecurityUser").get("SecurityUser"));
    }
  }
/**
 *
 * Sets the  SecurityUser
 * @param noOpInIn SecurityUserObjectData to set
 *
 */
  public void setSecurityUser(SecurityUserObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SecurityUser passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityUserObjectData getSecurityUser() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SecurityUserObjectHelper.fromMap(inputMap, "SecurityUser");
  }
}
