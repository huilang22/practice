/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvSecurityGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvSecurityGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvSecurityObjectData noOpIn;

/**
 *
 * Constructor to create a   InvSecurityGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvSecurityGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSecurityObjectData noOpInIn) {
    super(id, context, "InvSecurityGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(noOpIn, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }
/**
 *
 * Sets the  InvSecurity
 * @param noOpInIn InvSecurityObjectData to set
 *
 */
  public void setInvSecurity(InvSecurityObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvSecurity passed into the constructor
 * @return Simulated response
 *
 */
  public InvSecurityObjectData getInvSecurity() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvSecurityObjectHelper.fromMap(inputMap, "InvSecurity");
  }
}
