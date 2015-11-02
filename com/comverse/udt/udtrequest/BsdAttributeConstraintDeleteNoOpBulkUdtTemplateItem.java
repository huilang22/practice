/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeConstraintDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintObjectBaseData noOpInIn) {
    super(id, context, "BsdAttributeConstraintDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraint
 * @param noOpInIn BsdAttributeConstraintObjectBaseData to set
 *
 */
  public void setBsdAttributeConstraint(BsdAttributeConstraintObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintObjectBaseData getBsdAttributeConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintObjectBaseHelper.fromMap(inputMap, "BsdAttributeConstraint");
  }
}
