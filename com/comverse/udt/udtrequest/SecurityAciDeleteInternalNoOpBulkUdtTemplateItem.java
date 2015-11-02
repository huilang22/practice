/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityAciDeleteInternalNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a SecurityAciDeleteInternalNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SecurityAciDeleteInternalNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SecurityAciObjectData noOpIn;

/**
 *
 * Constructor to create a   SecurityAciDeleteInternalNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SecurityAciDeleteInternalNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityAciObjectData noOpInIn) {
    super(id, context, "SecurityAciDeleteInternal");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(noOpIn, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
  }
/**
 *
 * Sets the  SecurityAci
 * @param noOpInIn SecurityAciObjectData to set
 *
 */
  public void setSecurityAci(SecurityAciObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SecurityAci passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityAciObjectData getSecurityAci() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SecurityAciObjectHelper.fromMap(inputMap, "SecurityAci");
  }
}
