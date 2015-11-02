/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintObjectBaseKeyData bsdRelationalConstraintGetIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintObjectBaseKeyData bsdRelationalConstraintGetInIn) {
    super(id, context, "BsdRelationalConstraintGet");
    bsdRelationalConstraintGetIn = bsdRelationalConstraintGetInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintGetIn != null) {
      bsdRelationalConstraintGetIn.resetFlags(true, true);
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseKeyHelper.toMap(bsdRelationalConstraintGetIn, new HashMap(), "BsdRelationalConstraintObjectBaseKeyData").get("BsdRelationalConstraintObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraint
 * @param bsdRelationalConstraintGetInIn Value of the bsdRelationalConstraintGetIn
 *
 */

  public void setBsdRelationalConstraint(BsdRelationalConstraintObjectBaseKeyData bsdRelationalConstraintGetInIn) {
    bsdRelationalConstraintGetIn = bsdRelationalConstraintGetInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintGetIn = BsdRelationalConstraintObjectBaseKeyHelper.fromMap(inputMap, "BsdRelationalConstraint");
  }

/**
 *
 * Gets the BsdRelationalConstraint
 * @return Value of the BsdRelationalConstraint
 *
 */

  public BsdRelationalConstraintObjectBaseKeyData getBsdRelationalConstraint( ) {
    return bsdRelationalConstraintGetIn;
  }

}
