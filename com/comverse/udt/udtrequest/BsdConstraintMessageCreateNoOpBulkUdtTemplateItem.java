/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdConstraintMessageCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdConstraintMessageCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdConstraintMessageObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BsdConstraintMessageCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdConstraintMessageCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintMessageObjectBaseData noOpInIn) {
    super(id, context, "BsdConstraintMessageCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
/**
 *
 * Sets the  BsdConstraintMessage
 * @param noOpInIn BsdConstraintMessageObjectBaseData to set
 *
 */
  public void setBsdConstraintMessage(BsdConstraintMessageObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdConstraintMessage passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintMessageObjectBaseData getBsdConstraintMessage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdConstraintMessageObjectBaseHelper.fromMap(inputMap, "BsdConstraintMessage");
  }
}
