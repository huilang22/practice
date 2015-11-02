/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintObjectBaseKeyData bsdAttributeConstraintDeleteIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintObjectBaseKeyData bsdAttributeConstraintDeleteInIn) {
    super(id, context, "BsdAttributeConstraintDelete");
    bsdAttributeConstraintDeleteIn = bsdAttributeConstraintDeleteInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintDeleteIn != null) {
      bsdAttributeConstraintDeleteIn.resetFlags(true, true);
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseKeyHelper.toMap(bsdAttributeConstraintDeleteIn, new HashMap(), "BsdAttributeConstraintObjectBaseKeyData").get("BsdAttributeConstraintObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraint
 * @param bsdAttributeConstraintDeleteInIn Value of the bsdAttributeConstraintDeleteIn
 *
 */

  public void setBsdAttributeConstraint(BsdAttributeConstraintObjectBaseKeyData bsdAttributeConstraintDeleteInIn) {
    bsdAttributeConstraintDeleteIn = bsdAttributeConstraintDeleteInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintDeleteIn = BsdAttributeConstraintObjectBaseKeyHelper.fromMap(inputMap, "BsdAttributeConstraint");
  }

/**
 *
 * Gets the BsdAttributeConstraint
 * @return Value of the BsdAttributeConstraint
 *
 */

  public BsdAttributeConstraintObjectBaseKeyData getBsdAttributeConstraint( ) {
    return bsdAttributeConstraintDeleteIn;
  }

}
