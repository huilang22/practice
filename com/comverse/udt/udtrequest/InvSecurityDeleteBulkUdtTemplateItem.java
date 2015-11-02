/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvSecurityDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSecurityDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSecurityObjectKeyData InvSecurityDeleteIn;
/**
 *
 * Constructor to create a  InvSecurityDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSecurityDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSecurityObjectKeyData InvSecurityDeleteInIn) {
    super(id, context, "InvSecurityDelete");
    InvSecurityDeleteIn = InvSecurityDeleteInIn;
  }

  public void translateToMap() {
    if (InvSecurityDeleteIn != null) {
      InvSecurityDeleteIn.resetFlags(true, true);
      addInput("InvSecurity", InvSecurityObjectKeyHelper.toMap(InvSecurityDeleteIn, new HashMap(), "InvSecurityObjectKeyData").get("InvSecurityObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvSecurity
 * @param InvSecurityDeleteInIn Value of the InvSecurityDeleteIn
 *
 */

  public void setInvSecurity(InvSecurityObjectKeyData InvSecurityDeleteInIn) {
    InvSecurityDeleteIn = InvSecurityDeleteInIn;
  }

  public void translateFromMap() {
    InvSecurityDeleteIn = InvSecurityObjectKeyHelper.fromMap(inputMap, "InvSecurity");
  }

/**
 *
 * Gets the InvSecurity
 * @return Value of the InvSecurity
 *
 */

  public InvSecurityObjectKeyData getInvSecurity( ) {
    return InvSecurityDeleteIn;
  }

}
