/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvSimJobCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSimJobCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSimJobObjectData InvSimJobCreateIn;
/**
 *
 * Constructor to create a  InvSimJobCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSimJobCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimJobObjectData InvSimJobCreateInIn) {
    super(id, context, "InvSimJobCreate");
    InvSimJobCreateIn = InvSimJobCreateInIn;
  }

  public void translateToMap() {
    if (InvSimJobCreateIn != null) {
      InvSimJobCreateIn.resetFlags(true, true);
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(InvSimJobCreateIn, new HashMap(), "InvSimJob").get("InvSimJob"));
    }
  }


/**
 *
 * Sets the InvSimJob
 * @param InvSimJobCreateInIn Value of the InvSimJobCreateIn
 *
 */

  public void setInvSimJob(InvSimJobObjectData InvSimJobCreateInIn) {
    InvSimJobCreateIn = InvSimJobCreateInIn;
  }

  public void translateFromMap() {
    InvSimJobCreateIn = InvSimJobObjectHelper.fromMap(inputMap, "InvSimJob");
  }

/**
 *
 * Gets the InvSimJob
 * @return Value of the InvSimJob
 *
 */

  public InvSimJobObjectData getInvSimJob( ) {
    return InvSimJobCreateIn;
  }

}
