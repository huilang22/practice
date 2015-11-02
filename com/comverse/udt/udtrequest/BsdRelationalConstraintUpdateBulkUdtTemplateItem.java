/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintObjectBaseData bsdRelationalConstraintUpdateIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintObjectBaseData bsdRelationalConstraintUpdateInIn) {
    super(id, context, "BsdRelationalConstraintUpdate");
    bsdRelationalConstraintUpdateIn = bsdRelationalConstraintUpdateInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintUpdateIn != null) {
      bsdRelationalConstraintUpdateIn.resetFlags(true, true);
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseHelper.toMap(bsdRelationalConstraintUpdateIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraint
 * @param bsdRelationalConstraintUpdateInIn Value of the bsdRelationalConstraintUpdateIn
 *
 */

  public void setBsdRelationalConstraint(BsdRelationalConstraintObjectBaseData bsdRelationalConstraintUpdateInIn) {
    bsdRelationalConstraintUpdateIn = bsdRelationalConstraintUpdateInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintUpdateIn = BsdRelationalConstraintObjectBaseHelper.fromMap(inputMap, "BsdRelationalConstraint");
  }

/**
 *
 * Gets the BsdRelationalConstraint
 * @return Value of the BsdRelationalConstraint
 *
 */

  public BsdRelationalConstraintObjectBaseData getBsdRelationalConstraint( ) {
    return bsdRelationalConstraintUpdateIn;
  }

}
