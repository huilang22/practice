/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvPlaceholderUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvPlaceholderUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvPlaceholderUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvPlaceholderObjectData noOpIn;

/**
 *
 * Constructor to create a   InvPlaceholderUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvPlaceholderUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvPlaceholderObjectData noOpInIn) {
    super(id, context, "InvPlaceholderUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(noOpIn, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }
/**
 *
 * Sets the  InvPlaceholder
 * @param noOpInIn InvPlaceholderObjectData to set
 *
 */
  public void setInvPlaceholder(InvPlaceholderObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvPlaceholder passed into the constructor
 * @return Simulated response
 *
 */
  public InvPlaceholderObjectData getInvPlaceholder() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvPlaceholderObjectHelper.fromMap(inputMap, "InvPlaceholder");
  }
}
