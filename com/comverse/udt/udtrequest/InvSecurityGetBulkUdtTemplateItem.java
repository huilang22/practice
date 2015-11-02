/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityGetBulkUdtTemplateItem.java
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
 * Class used to create a InvSecurityGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSecurityGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSecurityObjectKeyData InvSecurityGetIn;
/**
 *
 * Constructor to create a  InvSecurityGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSecurityGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSecurityObjectKeyData InvSecurityGetInIn) {
    super(id, context, "InvSecurityGet");
    InvSecurityGetIn = InvSecurityGetInIn;
  }

  public void translateToMap() {
    if (InvSecurityGetIn != null) {
      InvSecurityGetIn.resetFlags(true, true);
      addInput("InvSecurity", InvSecurityObjectKeyHelper.toMap(InvSecurityGetIn, new HashMap(), "InvSecurityObjectKeyData").get("InvSecurityObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvSecurity
 * @param InvSecurityGetInIn Value of the InvSecurityGetIn
 *
 */

  public void setInvSecurity(InvSecurityObjectKeyData InvSecurityGetInIn) {
    InvSecurityGetIn = InvSecurityGetInIn;
  }

  public void translateFromMap() {
    InvSecurityGetIn = InvSecurityObjectKeyHelper.fromMap(inputMap, "InvSecurity");
  }

/**
 *
 * Gets the InvSecurity
 * @return Value of the InvSecurity
 *
 */

  public InvSecurityObjectKeyData getInvSecurity( ) {
    return InvSecurityGetIn;
  }

}
