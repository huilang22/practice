/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationConstraintFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationConstraintFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationConstraintObjectFilter bsdApplicationConstraintFindIn;
/**
 *
 * Constructor to create a  BsdApplicationConstraintFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationConstraintFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationConstraintObjectFilter bsdApplicationConstraintFindInIn) {
    super(id, context, "BsdApplicationConstraintFind");
    bsdApplicationConstraintFindIn = bsdApplicationConstraintFindInIn;
  }

  public void translateToMap() {
    if (bsdApplicationConstraintFindIn != null) {
      Integer index =  bsdApplicationConstraintFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(bsdApplicationConstraintFindIn, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }


/**
 *
 * Sets the BsdApplicationConstraint
 * @param bsdApplicationConstraintFindInIn Value of the bsdApplicationConstraintFindIn
 *
 */

  public void setBsdApplicationConstraint(BsdApplicationConstraintObjectFilter bsdApplicationConstraintFindInIn) {
    bsdApplicationConstraintFindIn = bsdApplicationConstraintFindInIn;
  }

  public void translateFromMap() {
    bsdApplicationConstraintFindIn = BsdApplicationConstraintObjectHelper.fromMapFilter(inputMap, "BsdApplicationConstraint");
  }

/**
 *
 * Gets the BsdApplicationConstraint
 * @return Value of the BsdApplicationConstraint
 *
 */

  public BsdApplicationConstraintObjectFilter getBsdApplicationConstraint( ) {
    return bsdApplicationConstraintFindIn;
  }

}
