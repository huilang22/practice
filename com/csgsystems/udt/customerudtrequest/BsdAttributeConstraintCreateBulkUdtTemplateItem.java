/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintObjectBaseData bsdAttributeConstraintCreateIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintObjectBaseData bsdAttributeConstraintCreateInIn) {
    super(id, context, "BsdAttributeConstraintCreate");
    bsdAttributeConstraintCreateIn = bsdAttributeConstraintCreateInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintCreateIn != null) {
      bsdAttributeConstraintCreateIn.resetFlags(true, true);
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseHelper.toMap(bsdAttributeConstraintCreateIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraint
 * @param bsdAttributeConstraintCreateInIn Value of the bsdAttributeConstraintCreateIn
 *
 */

  public void setBsdAttributeConstraint(BsdAttributeConstraintObjectBaseData bsdAttributeConstraintCreateInIn) {
    bsdAttributeConstraintCreateIn = bsdAttributeConstraintCreateInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintCreateIn = BsdAttributeConstraintObjectBaseHelper.fromMap(inputMap, "BsdAttributeConstraint");
  }

/**
 *
 * Gets the BsdAttributeConstraint
 * @return Value of the BsdAttributeConstraint
 *
 */

  public BsdAttributeConstraintObjectBaseData getBsdAttributeConstraint( ) {
    return bsdAttributeConstraintCreateIn;
  }

}
