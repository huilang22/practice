/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainObjectData InvdMainCreateIn;
/**
 *
 * Constructor to create a  InvdMainCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainObjectData InvdMainCreateInIn) {
    super(id, context, "InvdMainCreate");
    InvdMainCreateIn = InvdMainCreateInIn;
  }

  public void translateToMap() {
    if (InvdMainCreateIn != null) {
      InvdMainCreateIn.resetFlags(true, true);
      addInput("InvdMain", InvdMainObjectHelper.toMap(InvdMainCreateIn, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }


/**
 *
 * Sets the InvdMain
 * @param InvdMainCreateInIn Value of the InvdMainCreateIn
 *
 */

  public void setInvdMain(InvdMainObjectData InvdMainCreateInIn) {
    InvdMainCreateIn = InvdMainCreateInIn;
  }

  public void translateFromMap() {
    InvdMainCreateIn = InvdMainObjectHelper.fromMap(inputMap, "InvdMain");
  }

/**
 *
 * Gets the InvdMain
 * @return Value of the InvdMain
 *
 */

  public InvdMainObjectData getInvdMain( ) {
    return InvdMainCreateIn;
  }

}
