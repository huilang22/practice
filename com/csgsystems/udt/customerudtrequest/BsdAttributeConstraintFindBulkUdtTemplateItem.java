/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintObjectFilter bsdAttributeConstraintFindIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintObjectFilter bsdAttributeConstraintFindInIn) {
    super(id, context, "BsdAttributeConstraintFind");
    bsdAttributeConstraintFindIn = bsdAttributeConstraintFindInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintFindIn != null) {
      Integer index =  bsdAttributeConstraintFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectHelper.toMap(bsdAttributeConstraintFindIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraint
 * @param bsdAttributeConstraintFindInIn Value of the bsdAttributeConstraintFindIn
 *
 */

  public void setBsdAttributeConstraint(BsdAttributeConstraintObjectFilter bsdAttributeConstraintFindInIn) {
    bsdAttributeConstraintFindIn = bsdAttributeConstraintFindInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintFindIn = BsdAttributeConstraintObjectHelper.fromMapFilter(inputMap, "BsdAttributeConstraint");
  }

/**
 *
 * Gets the BsdAttributeConstraint
 * @return Value of the BsdAttributeConstraint
 *
 */

  public BsdAttributeConstraintObjectFilter getBsdAttributeConstraint( ) {
    return bsdAttributeConstraintFindIn;
  }

}
