/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintObjectBaseData bsdAttributeConstraintUpdateIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintObjectBaseData bsdAttributeConstraintUpdateInIn) {
    super(id, context, "BsdAttributeConstraintUpdate");
    bsdAttributeConstraintUpdateIn = bsdAttributeConstraintUpdateInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintUpdateIn != null) {
      bsdAttributeConstraintUpdateIn.resetFlags(true, true);
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseHelper.toMap(bsdAttributeConstraintUpdateIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraint
 * @param bsdAttributeConstraintUpdateInIn Value of the bsdAttributeConstraintUpdateIn
 *
 */

  public void setBsdAttributeConstraint(BsdAttributeConstraintObjectBaseData bsdAttributeConstraintUpdateInIn) {
    bsdAttributeConstraintUpdateIn = bsdAttributeConstraintUpdateInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintUpdateIn = BsdAttributeConstraintObjectBaseHelper.fromMap(inputMap, "BsdAttributeConstraint");
  }

/**
 *
 * Gets the BsdAttributeConstraint
 * @return Value of the BsdAttributeConstraint
 *
 */

  public BsdAttributeConstraintObjectBaseData getBsdAttributeConstraint( ) {
    return bsdAttributeConstraintUpdateIn;
  }

}
