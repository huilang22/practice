/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalConstraintDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintObjectBaseData noOpInIn) {
    super(id, context, "BsdRelationalConstraintDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraint
 * @param noOpInIn BsdRelationalConstraintObjectBaseData to set
 *
 */
  public void setBsdRelationalConstraint(BsdRelationalConstraintObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintObjectBaseData getBsdRelationalConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintObjectBaseHelper.fromMap(inputMap, "BsdRelationalConstraint");
  }
}
