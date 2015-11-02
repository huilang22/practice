/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityCallNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.sec.data.*;

/**
 *
 * NoOp class used to simulate a SecurityCallNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SecurityCallNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SecurityPortalObjectData noOpIn;

/**
 *
 * Constructor to create a   SecurityCallNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SecurityCallNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityPortalObjectData noOpInIn) {
    super(id, context, "SecurityCall");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SecurityPortal", SecurityPortalObjectHelper.toMap(noOpIn, new HashMap(), "SecurityPortal").get("SecurityPortal"));
    }
  }
/**
 *
 * Sets the  SecurityPortal
 * @param noOpInIn SecurityPortalObjectData to set
 *
 */
  public void setSecurityPortal(SecurityPortalObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SecurityPortal passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityPortalObjectData getSecurityPortal() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SecurityPortalObjectHelper.fromMap(inputMap, "SecurityPortal");
  }
}
