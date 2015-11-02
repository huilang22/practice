/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvJobUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobObjectData InvJobUpdateIn;
/**
 *
 * Constructor to create a  InvJobUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobObjectData InvJobUpdateInIn) {
    super(id, context, "InvJobUpdate");
    InvJobUpdateIn = InvJobUpdateInIn;
  }

  public void translateToMap() {
    if (InvJobUpdateIn != null) {
      InvJobUpdateIn.resetFlags(true, true);
      addInput("InvJob", InvJobObjectHelper.toMap(InvJobUpdateIn, new HashMap(), "InvJob").get("InvJob"));
    }
  }


/**
 *
 * Sets the InvJob
 * @param InvJobUpdateInIn Value of the InvJobUpdateIn
 *
 */

  public void setInvJob(InvJobObjectData InvJobUpdateInIn) {
    InvJobUpdateIn = InvJobUpdateInIn;
  }

  public void translateFromMap() {
    InvJobUpdateIn = InvJobObjectHelper.fromMap(inputMap, "InvJob");
  }

/**
 *
 * Gets the InvJob
 * @return Value of the InvJob
 *
 */

  public InvJobObjectData getInvJob( ) {
    return InvJobUpdateIn;
  }

}
