/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvContainerUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvContainerUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvContainerObjectData InvContainerUpdateIn;
/**
 *
 * Constructor to create a  InvContainerUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvContainerUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerObjectData InvContainerUpdateInIn) {
    super(id, context, "InvContainerUpdate");
    InvContainerUpdateIn = InvContainerUpdateInIn;
  }

  public void translateToMap() {
    if (InvContainerUpdateIn != null) {
      InvContainerUpdateIn.resetFlags(true, true);
      addInput("InvContainer", InvContainerObjectHelper.toMap(InvContainerUpdateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvContainer
 * @param InvContainerUpdateInIn Value of the InvContainerUpdateIn
 *
 */

  public void setInvContainer(InvContainerObjectData InvContainerUpdateInIn) {
    InvContainerUpdateIn = InvContainerUpdateInIn;
  }

  public void translateFromMap() {
    InvContainerUpdateIn = InvContainerObjectHelper.fromMap(inputMap, "InvContainer");
  }

/**
 *
 * Gets the InvContainer
 * @return Value of the InvContainer
 *
 */

  public InvContainerObjectData getInvContainer( ) {
    return InvContainerUpdateIn;
  }

}
