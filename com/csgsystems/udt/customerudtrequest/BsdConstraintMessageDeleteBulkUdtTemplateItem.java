/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintMessageDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdConstraintMessageDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdConstraintMessageDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdConstraintMessageObjectBaseKeyData bsdConstraintMessageDeleteIn;
/**
 *
 * Constructor to create a  BsdConstraintMessageDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdConstraintMessageDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintMessageObjectBaseKeyData bsdConstraintMessageDeleteInIn) {
    super(id, context, "BsdConstraintMessageDelete");
    bsdConstraintMessageDeleteIn = bsdConstraintMessageDeleteInIn;
  }

  public void translateToMap() {
    if (bsdConstraintMessageDeleteIn != null) {
      bsdConstraintMessageDeleteIn.resetFlags(true, true);
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseKeyHelper.toMap(bsdConstraintMessageDeleteIn, new HashMap(), "BsdConstraintMessageObjectBaseKeyData").get("BsdConstraintMessageObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdConstraintMessage
 * @param bsdConstraintMessageDeleteInIn Value of the bsdConstraintMessageDeleteIn
 *
 */

  public void setBsdConstraintMessage(BsdConstraintMessageObjectBaseKeyData bsdConstraintMessageDeleteInIn) {
    bsdConstraintMessageDeleteIn = bsdConstraintMessageDeleteInIn;
  }

  public void translateFromMap() {
    bsdConstraintMessageDeleteIn = BsdConstraintMessageObjectBaseKeyHelper.fromMap(inputMap, "BsdConstraintMessage");
  }

/**
 *
 * Gets the BsdConstraintMessage
 * @return Value of the BsdConstraintMessage
 *
 */

  public BsdConstraintMessageObjectBaseKeyData getBsdConstraintMessage( ) {
    return bsdConstraintMessageDeleteIn;
  }

}
