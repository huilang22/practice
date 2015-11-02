/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdConstraintMessageGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdConstraintMessageGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdConstraintMessageObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdConstraintMessageGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdConstraintMessageGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintMessageObjectData noOpInIn) {
    super(id, context, "BsdConstraintMessageGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectHelper.toMap(noOpIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
/**
 *
 * Sets the  BsdConstraintMessage
 * @param noOpInIn BsdConstraintMessageObjectData to set
 *
 */
  public void setBsdConstraintMessage(BsdConstraintMessageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdConstraintMessage passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintMessageObjectData getBsdConstraintMessage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdConstraintMessageObjectHelper.fromMap(inputMap, "BsdConstraintMessage");
  }
}
