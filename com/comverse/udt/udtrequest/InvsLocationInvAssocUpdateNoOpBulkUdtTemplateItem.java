/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationInvAssocUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationInvAssocUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationInvAssocObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLocationInvAssocUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationInvAssocUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationInvAssocObjectData noOpInIn) {
    super(id, context, "InvsLocationInvAssocUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }
/**
 *
 * Sets the  InvsLocationInvAssoc
 * @param noOpInIn InvsLocationInvAssocObjectData to set
 *
 */
  public void setInvsLocationInvAssoc(InvsLocationInvAssocObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationInvAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationInvAssocObjectData getInvsLocationInvAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationInvAssocObjectHelper.fromMap(inputMap, "InvsLocationInvAssoc");
  }
}
