/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a BsdRelationalConstraintFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintObjectFilter bsdRelationalConstraintFindIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintObjectFilter bsdRelationalConstraintFindInIn) {
    super(id, context, "BsdRelationalConstraintFind");
    bsdRelationalConstraintFindIn = bsdRelationalConstraintFindInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintFindIn != null) {
      Integer index =  bsdRelationalConstraintFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectHelper.toMap(bsdRelationalConstraintFindIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraint
 * @param bsdRelationalConstraintFindInIn Value of the bsdRelationalConstraintFindIn
 *
 */

  public void setBsdRelationalConstraint(BsdRelationalConstraintObjectFilter bsdRelationalConstraintFindInIn) {
    bsdRelationalConstraintFindIn = bsdRelationalConstraintFindInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintFindIn = BsdRelationalConstraintObjectHelper.fromMapFilter(inputMap, "BsdRelationalConstraint");
  }

/**
 *
 * Gets the BsdRelationalConstraint
 * @return Value of the BsdRelationalConstraint
 *
 */

  public BsdRelationalConstraintObjectFilter getBsdRelationalConstraint( ) {
    return bsdRelationalConstraintFindIn;
  }

}
