/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintObjectBaseKeyData bsdRelationalConstraintDeleteIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintObjectBaseKeyData bsdRelationalConstraintDeleteInIn) {
    super(id, context, "BsdRelationalConstraintDelete");
    bsdRelationalConstraintDeleteIn = bsdRelationalConstraintDeleteInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintDeleteIn != null) {
      bsdRelationalConstraintDeleteIn.resetFlags(true, true);
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseKeyHelper.toMap(bsdRelationalConstraintDeleteIn, new HashMap(), "BsdRelationalConstraintObjectBaseKeyData").get("BsdRelationalConstraintObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraint
 * @param bsdRelationalConstraintDeleteInIn Value of the bsdRelationalConstraintDeleteIn
 *
 */

  public void setBsdRelationalConstraint(BsdRelationalConstraintObjectBaseKeyData bsdRelationalConstraintDeleteInIn) {
    bsdRelationalConstraintDeleteIn = bsdRelationalConstraintDeleteInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintDeleteIn = BsdRelationalConstraintObjectBaseKeyHelper.fromMap(inputMap, "BsdRelationalConstraint");
  }

/**
 *
 * Gets the BsdRelationalConstraint
 * @return Value of the BsdRelationalConstraint
 *
 */

  public BsdRelationalConstraintObjectBaseKeyData getBsdRelationalConstraint( ) {
    return bsdRelationalConstraintDeleteIn;
  }

}
