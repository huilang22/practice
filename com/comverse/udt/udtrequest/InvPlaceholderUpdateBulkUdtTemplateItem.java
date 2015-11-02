/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvPlaceholderUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a InvPlaceholderUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvPlaceholderUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvPlaceholderObjectData updateIn;
/**
 *
 * Constructor to create a  InvPlaceholderUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvPlaceholderUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvPlaceholderObjectData updateInIn) {
    super(id, context, "InvPlaceholderUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(updateIn, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }


/**
 *
 * Sets the InvPlaceholder
 * @param updateInIn Value of the updateIn
 *
 */

  public void setInvPlaceholder(InvPlaceholderObjectData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = InvPlaceholderObjectHelper.fromMap(inputMap, "InvPlaceholder");
  }

/**
 *
 * Gets the InvPlaceholder
 * @return Value of the InvPlaceholder
 *
 */

  public InvPlaceholderObjectData getInvPlaceholder( ) {
    return updateIn;
  }

}
