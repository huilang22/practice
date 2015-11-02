/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityResourceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SecurityResourceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SecurityResourceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SecurityResourceObjectData noOpIn;

/**
 *
 * Constructor to create a   SecurityResourceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SecurityResourceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityResourceObjectData noOpInIn) {
    super(id, context, "SecurityResourceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(noOpIn, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }
/**
 *
 * Sets the  SecurityResource
 * @param noOpInIn SecurityResourceObjectData to set
 *
 */
  public void setSecurityResource(SecurityResourceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SecurityResource passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityResourceObjectData getSecurityResource() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SecurityResourceObjectHelper.fromMap(inputMap, "SecurityResource");
  }
}
