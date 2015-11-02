/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobGetBulkUdtTemplateItem.java
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
 * Class used to create a InvModJobGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvModJobGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvModJobObjectKeyData InvModJobGetIn;
/**
 *
 * Constructor to create a  InvModJobGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvModJobGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvModJobObjectKeyData InvModJobGetInIn) {
    super(id, context, "InvModJobGet");
    InvModJobGetIn = InvModJobGetInIn;
  }

  public void translateToMap() {
    if (InvModJobGetIn != null) {
      InvModJobGetIn.resetFlags(true, true);
      addInput("InvModJob", InvModJobObjectKeyHelper.toMap(InvModJobGetIn, new HashMap(), "InvModJobObjectKeyData").get("InvModJobObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvModJob
 * @param InvModJobGetInIn Value of the InvModJobGetIn
 *
 */

  public void setInvModJob(InvModJobObjectKeyData InvModJobGetInIn) {
    InvModJobGetIn = InvModJobGetInIn;
  }

  public void translateFromMap() {
    InvModJobGetIn = InvModJobObjectKeyHelper.fromMap(inputMap, "InvModJob");
  }

/**
 *
 * Gets the InvModJob
 * @return Value of the InvModJob
 *
 */

  public InvModJobObjectKeyData getInvModJob( ) {
    return InvModJobGetIn;
  }

}
