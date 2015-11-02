/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRelationalConstraintGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationRelationalConstraintGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationRelationalConstraintGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationRelationalConstraintObjectKeyData bsdApplicationRelationalConstraintGetIn;
/**
 *
 * Constructor to create a  BsdApplicationRelationalConstraintGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationRelationalConstraintGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationRelationalConstraintObjectKeyData bsdApplicationRelationalConstraintGetInIn) {
    super(id, context, "BsdApplicationRelationalConstraintGet");
    bsdApplicationRelationalConstraintGetIn = bsdApplicationRelationalConstraintGetInIn;
  }

  public void translateToMap() {
    if (bsdApplicationRelationalConstraintGetIn != null) {
      bsdApplicationRelationalConstraintGetIn.resetFlags(true, true);
      addInput("BsdApplicationRelationalConstraint", BsdApplicationRelationalConstraintObjectKeyHelper.toMap(bsdApplicationRelationalConstraintGetIn, new HashMap(), "BsdApplicationRelationalConstraintObjectKeyData").get("BsdApplicationRelationalConstraintObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdApplicationRelationalConstraint
 * @param bsdApplicationRelationalConstraintGetInIn Value of the bsdApplicationRelationalConstraintGetIn
 *
 */

  public void setBsdApplicationRelationalConstraint(BsdApplicationRelationalConstraintObjectKeyData bsdApplicationRelationalConstraintGetInIn) {
    bsdApplicationRelationalConstraintGetIn = bsdApplicationRelationalConstraintGetInIn;
  }

  public void translateFromMap() {
    bsdApplicationRelationalConstraintGetIn = BsdApplicationRelationalConstraintObjectKeyHelper.fromMap(inputMap, "BsdApplicationRelationalConstraint");
  }

/**
 *
 * Gets the BsdApplicationRelationalConstraint
 * @return Value of the BsdApplicationRelationalConstraint
 *
 */

  public BsdApplicationRelationalConstraintObjectKeyData getBsdApplicationRelationalConstraint( ) {
    return bsdApplicationRelationalConstraintGetIn;
  }

}
