/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityAciDeleteInternalBulkUdtTemplateItem.java
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
 * Class used to create a SecurityAciDeleteInternalBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityAciDeleteInternalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityAciObjectData AciDeleteIn;
/**
 *
 * Constructor to create a  SecurityAciDeleteInternalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityAciDeleteInternalBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityAciObjectData AciDeleteInIn) {
    super(id, context, "SecurityAciDeleteInternal");
    AciDeleteIn = AciDeleteInIn;
  }

  public void translateToMap() {
    if (AciDeleteIn != null) {
      AciDeleteIn.resetFlags(true, true);
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(AciDeleteIn, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
  }


/**
 *
 * Sets the SecurityAci
 * @param AciDeleteInIn Value of the AciDeleteIn
 *
 */

  public void setSecurityAci(SecurityAciObjectData AciDeleteInIn) {
    AciDeleteIn = AciDeleteInIn;
  }

  public void translateFromMap() {
    AciDeleteIn = SecurityAciObjectHelper.fromMap(inputMap, "SecurityAci");
  }

/**
 *
 * Gets the SecurityAci
 * @return Value of the SecurityAci
 *
 */

  public SecurityAciObjectData getSecurityAci( ) {
    return AciDeleteIn;
  }

}
