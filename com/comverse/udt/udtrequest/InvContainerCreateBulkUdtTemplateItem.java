/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvContainerCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvContainerCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvContainerObjectData InvContainerCreateIn;
/**
 *
 * Constructor to create a  InvContainerCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvContainerCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerObjectData InvContainerCreateInIn) {
    super(id, context, "InvContainerCreate");
    InvContainerCreateIn = InvContainerCreateInIn;
  }

  public void translateToMap() {
    if (InvContainerCreateIn != null) {
      InvContainerCreateIn.resetFlags(true, true);
      addInput("InvContainer", InvContainerObjectHelper.toMap(InvContainerCreateIn, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }


/**
 *
 * Sets the InvContainer
 * @param InvContainerCreateInIn Value of the InvContainerCreateIn
 *
 */

  public void setInvContainer(InvContainerObjectData InvContainerCreateInIn) {
    InvContainerCreateIn = InvContainerCreateInIn;
  }

  public void translateFromMap() {
    InvContainerCreateIn = InvContainerObjectHelper.fromMap(inputMap, "InvContainer");
  }

/**
 *
 * Gets the InvContainer
 * @return Value of the InvContainer
 *
 */

  public InvContainerObjectData getInvContainer( ) {
    return InvContainerCreateIn;
  }

}
