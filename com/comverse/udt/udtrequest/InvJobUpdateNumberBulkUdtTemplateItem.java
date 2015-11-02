/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobUpdateNumberBulkUdtTemplateItem.java
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
 * Class used to create a InvJobUpdateNumberBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobUpdateNumberBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobObjectData InvJobUpdateNumberIn;
/**
 *
 * Constructor to create a  InvJobUpdateNumberBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobUpdateNumberBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobObjectData InvJobUpdateNumberInIn) {
    super(id, context, "InvJobUpdateNumber");
    InvJobUpdateNumberIn = InvJobUpdateNumberInIn;
  }

  public void translateToMap() {
    if (InvJobUpdateNumberIn != null) {
      InvJobUpdateNumberIn.resetFlags(true, true);
      addInput("InvJob", InvJobObjectHelper.toMap(InvJobUpdateNumberIn, new HashMap(), "InvJob").get("InvJob"));
    }
  }


/**
 *
 * Sets the InvJob
 * @param InvJobUpdateNumberInIn Value of the InvJobUpdateNumberIn
 *
 */

  public void setInvJob(InvJobObjectData InvJobUpdateNumberInIn) {
    InvJobUpdateNumberIn = InvJobUpdateNumberInIn;
  }

  public void translateFromMap() {
    InvJobUpdateNumberIn = InvJobObjectHelper.fromMap(inputMap, "InvJob");
  }

/**
 *
 * Gets the InvJob
 * @return Value of the InvJob
 *
 */

  public InvJobObjectData getInvJob( ) {
    return InvJobUpdateNumberIn;
  }

}
