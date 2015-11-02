/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityAciCreateInternalNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SecurityAciCreateInternalNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SecurityAciCreateInternalNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SecurityAciObjectData noOpIn;

/**
 *
 * Constructor to create a   SecurityAciCreateInternalNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SecurityAciCreateInternalNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityAciObjectData noOpInIn) {
    super(id, context, "SecurityAciCreateInternal");
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
