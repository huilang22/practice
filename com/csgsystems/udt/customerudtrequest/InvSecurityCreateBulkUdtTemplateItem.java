/*
 * Generated code DO NOT EDIT
 * Generated file: InvSecurityCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvSecurityCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSecurityCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSecurityObjectData InvSecCreateIn;
/**
 *
 * Constructor to create a  InvSecurityCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSecurityCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSecurityObjectData InvSecCreateInIn) {
    super(id, context, "InvSecurityCreate");
    InvSecCreateIn = InvSecCreateInIn;
  }

  public void translateToMap() {
    if (InvSecCreateIn != null) {
      InvSecCreateIn.resetFlags(true, true);
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(InvSecCreateIn, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }


/**
 *
 * Sets the InvSecurity
 * @param InvSecCreateInIn Value of the InvSecCreateIn
 *
 */

  public void setInvSecurity(InvSecurityObjectData InvSecCreateInIn) {
    InvSecCreateIn = InvSecCreateInIn;
  }

  public void translateFromMap() {
    InvSecCreateIn = InvSecurityObjectHelper.fromMap(inputMap, "InvSecurity");
  }

/**
 *
 * Gets the InvSecurity
 * @return Value of the InvSecurity
 *
 */

  public InvSecurityObjectData getInvSecurity( ) {
    return InvSecCreateIn;
  }

}
