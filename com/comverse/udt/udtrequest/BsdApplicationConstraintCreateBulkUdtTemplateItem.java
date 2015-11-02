/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationConstraintCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationConstraintCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationConstraintObjectData bsdApplicationConstraintCreateIn;
/**
 *
 * Constructor to create a  BsdApplicationConstraintCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationConstraintCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationConstraintObjectData bsdApplicationConstraintCreateInIn) {
    super(id, context, "BsdApplicationConstraintCreate");
    bsdApplicationConstraintCreateIn = bsdApplicationConstraintCreateInIn;
  }

  public void translateToMap() {
    if (bsdApplicationConstraintCreateIn != null) {
      bsdApplicationConstraintCreateIn.resetFlags(true, true);
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(bsdApplicationConstraintCreateIn, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }


/**
 *
 * Sets the BsdApplicationConstraint
 * @param bsdApplicationConstraintCreateInIn Value of the bsdApplicationConstraintCreateIn
 *
 */

  public void setBsdApplicationConstraint(BsdApplicationConstraintObjectData bsdApplicationConstraintCreateInIn) {
    bsdApplicationConstraintCreateIn = bsdApplicationConstraintCreateInIn;
  }

  public void translateFromMap() {
    bsdApplicationConstraintCreateIn = BsdApplicationConstraintObjectHelper.fromMap(inputMap, "BsdApplicationConstraint");
  }

/**
 *
 * Gets the BsdApplicationConstraint
 * @return Value of the BsdApplicationConstraint
 *
 */

  public BsdApplicationConstraintObjectData getBsdApplicationConstraint( ) {
    return bsdApplicationConstraintCreateIn;
  }

}
