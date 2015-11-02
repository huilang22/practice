/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationConstraintDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationConstraintDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationConstraintObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationConstraintDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationConstraintDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationConstraintObjectData noOpInIn) {
    super(id, context, "BsdApplicationConstraintDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }
/**
 *
 * Sets the  BsdApplicationConstraint
 * @param noOpInIn BsdApplicationConstraintObjectData to set
 *
 */
  public void setBsdApplicationConstraint(BsdApplicationConstraintObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationConstraintObjectData getBsdApplicationConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationConstraintObjectHelper.fromMap(inputMap, "BsdApplicationConstraint");
  }
}
