/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvModJobCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvModJobCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvModJobObjectData InvModJobCreateIn;
/**
 *
 * Constructor to create a  InvModJobCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvModJobCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvModJobObjectData InvModJobCreateInIn) {
    super(id, context, "InvModJobCreate");
    InvModJobCreateIn = InvModJobCreateInIn;
  }

  public void translateToMap() {
    if (InvModJobCreateIn != null) {
      InvModJobCreateIn.resetFlags(true, true);
      addInput("InvModJob", InvModJobObjectHelper.toMap(InvModJobCreateIn, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }


/**
 *
 * Sets the InvModJob
 * @param InvModJobCreateInIn Value of the InvModJobCreateIn
 *
 */

  public void setInvModJob(InvModJobObjectData InvModJobCreateInIn) {
    InvModJobCreateIn = InvModJobCreateInIn;
  }

  public void translateFromMap() {
    InvModJobCreateIn = InvModJobObjectHelper.fromMap(inputMap, "InvModJob");
  }

/**
 *
 * Gets the InvModJob
 * @return Value of the InvModJob
 *
 */

  public InvModJobObjectData getInvModJob( ) {
    return InvModJobCreateIn;
  }

}
