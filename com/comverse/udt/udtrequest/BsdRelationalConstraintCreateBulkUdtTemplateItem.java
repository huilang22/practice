/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintObjectBaseData bsdRelationalConstraintCreateIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintObjectBaseData bsdRelationalConstraintCreateInIn) {
    super(id, context, "BsdRelationalConstraintCreate");
    bsdRelationalConstraintCreateIn = bsdRelationalConstraintCreateInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintCreateIn != null) {
      bsdRelationalConstraintCreateIn.resetFlags(true, true);
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseHelper.toMap(bsdRelationalConstraintCreateIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraint
 * @param bsdRelationalConstraintCreateInIn Value of the bsdRelationalConstraintCreateIn
 *
 */

  public void setBsdRelationalConstraint(BsdRelationalConstraintObjectBaseData bsdRelationalConstraintCreateInIn) {
    bsdRelationalConstraintCreateIn = bsdRelationalConstraintCreateInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintCreateIn = BsdRelationalConstraintObjectBaseHelper.fromMap(inputMap, "BsdRelationalConstraint");
  }

/**
 *
 * Gets the BsdRelationalConstraint
 * @return Value of the BsdRelationalConstraint
 *
 */

  public BsdRelationalConstraintObjectBaseData getBsdRelationalConstraint( ) {
    return bsdRelationalConstraintCreateIn;
  }

}
