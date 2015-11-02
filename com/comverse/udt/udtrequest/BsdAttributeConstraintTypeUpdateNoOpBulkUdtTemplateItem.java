/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeConstraintTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintTypeObjectData noOpInIn) {
    super(id, context, "BsdAttributeConstraintTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraintType
 * @param noOpInIn BsdAttributeConstraintTypeObjectData to set
 *
 */
  public void setBsdAttributeConstraintType(BsdAttributeConstraintTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraintType passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintTypeObjectData getBsdAttributeConstraintType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintTypeObjectHelper.fromMap(inputMap, "BsdAttributeConstraintType");
  }
}
