/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintMessageUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdConstraintMessageUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdConstraintMessageUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdConstraintMessageObjectBaseData bsdConstraintMessageUpdateIn;
/**
 *
 * Constructor to create a  BsdConstraintMessageUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdConstraintMessageUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintMessageObjectBaseData bsdConstraintMessageUpdateInIn) {
    super(id, context, "BsdConstraintMessageUpdate");
    bsdConstraintMessageUpdateIn = bsdConstraintMessageUpdateInIn;
  }

  public void translateToMap() {
    if (bsdConstraintMessageUpdateIn != null) {
      bsdConstraintMessageUpdateIn.resetFlags(true, true);
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseHelper.toMap(bsdConstraintMessageUpdateIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }


/**
 *
 * Sets the BsdConstraintMessage
 * @param bsdConstraintMessageUpdateInIn Value of the bsdConstraintMessageUpdateIn
 *
 */

  public void setBsdConstraintMessage(BsdConstraintMessageObjectBaseData bsdConstraintMessageUpdateInIn) {
    bsdConstraintMessageUpdateIn = bsdConstraintMessageUpdateInIn;
  }

  public void translateFromMap() {
    bsdConstraintMessageUpdateIn = BsdConstraintMessageObjectBaseHelper.fromMap(inputMap, "BsdConstraintMessage");
  }

/**
 *
 * Gets the BsdConstraintMessage
 * @return Value of the BsdConstraintMessage
 *
 */

  public BsdConstraintMessageObjectBaseData getBsdConstraintMessage( ) {
    return bsdConstraintMessageUpdateIn;
  }

}
