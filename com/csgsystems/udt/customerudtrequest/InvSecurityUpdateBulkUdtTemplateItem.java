/*
 * Generated code DO NOT EDIT
 * Generated file: InvSecurityUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvSecurityUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSecurityUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSecurityObjectData InvSecurityUpdateIn;
/**
 *
 * Constructor to create a  InvSecurityUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSecurityUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSecurityObjectData InvSecurityUpdateInIn) {
    super(id, context, "InvSecurityUpdate");
    InvSecurityUpdateIn = InvSecurityUpdateInIn;
  }

  public void translateToMap() {
    if (InvSecurityUpdateIn != null) {
      InvSecurityUpdateIn.resetFlags(true, true);
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(InvSecurityUpdateIn, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }


/**
 *
 * Sets the InvSecurity
 * @param InvSecurityUpdateInIn Value of the InvSecurityUpdateIn
 *
 */

  public void setInvSecurity(InvSecurityObjectData InvSecurityUpdateInIn) {
    InvSecurityUpdateIn = InvSecurityUpdateInIn;
  }

  public void translateFromMap() {
    InvSecurityUpdateIn = InvSecurityObjectHelper.fromMap(inputMap, "InvSecurity");
  }

/**
 *
 * Gets the InvSecurity
 * @return Value of the InvSecurity
 *
 */

  public InvSecurityObjectData getInvSecurity( ) {
    return InvSecurityUpdateIn;
  }

}
