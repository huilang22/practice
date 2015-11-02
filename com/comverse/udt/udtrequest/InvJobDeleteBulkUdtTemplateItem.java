/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvJobDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobObjectData InvJobDeleteIn;
/**
 *
 * Constructor to create a  InvJobDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobObjectData InvJobDeleteInIn) {
    super(id, context, "InvJobDelete");
    InvJobDeleteIn = InvJobDeleteInIn;
  }

  public void translateToMap() {
    if (InvJobDeleteIn != null) {
      InvJobDeleteIn.resetFlags(true, true);
      addInput("InvJob", InvJobObjectHelper.toMap(InvJobDeleteIn, new HashMap(), "InvJob").get("InvJob"));
    }
  }


/**
 *
 * Sets the InvJob
 * @param InvJobDeleteInIn Value of the InvJobDeleteIn
 *
 */

  public void setInvJob(InvJobObjectData InvJobDeleteInIn) {
    InvJobDeleteIn = InvJobDeleteInIn;
  }

  public void translateFromMap() {
    InvJobDeleteIn = InvJobObjectHelper.fromMap(inputMap, "InvJob");
  }

/**
 *
 * Gets the InvJob
 * @return Value of the InvJob
 *
 */

  public InvJobObjectData getInvJob( ) {
    return InvJobDeleteIn;
  }

}
