/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobVectorBulkUdtTemplateItem.java
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
 * Class used to create a InvModJobVectorBulkUdtTemplateItem Bulk Template
 *
 */

public class InvModJobVectorBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvModJobObjectData InvModJobVectorIn;
/**
 *
 * Constructor to create a  InvModJobVectorBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvModJobVectorBulkUdtTemplateItem(String id, BSDMSessionContext context, InvModJobObjectData InvModJobVectorInIn) {
    super(id, context, "InvModJobVector");
    InvModJobVectorIn = InvModJobVectorInIn;
  }

  public void translateToMap() {
    if (InvModJobVectorIn != null) {
      InvModJobVectorIn.resetFlags(true, true);
      addInput("InvModJob", InvModJobObjectHelper.toMap(InvModJobVectorIn, new HashMap(), "InvModJobVectorOutputData").get("InvModJobVectorOutputData"));
    }
  }


/**
 *
 * Sets the InvModJob
 * @param InvModJobVectorInIn Value of the InvModJobVectorIn
 *
 */

  public void setInvModJob(InvModJobObjectData InvModJobVectorInIn) {
    InvModJobVectorIn = InvModJobVectorInIn;
  }

  public void translateFromMap() {
    InvModJobVectorIn = InvModJobObjectHelper.fromMap(inputMap, "InvModJob");
  }

/**
 *
 * Gets the InvModJob
 * @return Value of the InvModJob
 *
 */

  public InvModJobObjectData getInvModJob( ) {
    return InvModJobVectorIn;
  }

}
