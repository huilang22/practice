/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeConstraintSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintObjectBaseKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintObjectBaseKeyData noOpInIn) {
    super(id, context, "BsdAttributeConstraintSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraint
 * @param noOpInIn BsdAttributeConstraintObjectBaseKeyData to set
 *
 */
  public void setBsdAttributeConstraint(BsdAttributeConstraintObjectBaseKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintObjectBaseKeyData getBsdAttributeConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintObjectBaseKeyHelper.fromMap(inputMap, "BsdAttributeConstraint");
  }
}
