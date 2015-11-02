/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalConstraintTypeSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintTypeSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintTypeObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintTypeSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintTypeSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintTypeObjectKeyData noOpInIn) {
    super(id, context, "BsdRelationalConstraintTypeSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraintType
 * @param noOpInIn BsdRelationalConstraintTypeObjectKeyData to set
 *
 */
  public void setBsdRelationalConstraintType(BsdRelationalConstraintTypeObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraintType passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintTypeObjectKeyData getBsdRelationalConstraintType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintTypeObjectKeyHelper.fromMap(inputMap, "BsdRelationalConstraintType");
  }
}
