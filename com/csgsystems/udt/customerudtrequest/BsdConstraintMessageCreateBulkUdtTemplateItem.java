/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintMessageCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdConstraintMessageCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdConstraintMessageCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdConstraintMessageObjectBaseData bsdConstraintMessageCreateIn;
/**
 *
 * Constructor to create a  BsdConstraintMessageCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdConstraintMessageCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintMessageObjectBaseData bsdConstraintMessageCreateInIn) {
    super(id, context, "BsdConstraintMessageCreate");
    bsdConstraintMessageCreateIn = bsdConstraintMessageCreateInIn;
  }

  public void translateToMap() {
    if (bsdConstraintMessageCreateIn != null) {
      bsdConstraintMessageCreateIn.resetFlags(true, true);
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseHelper.toMap(bsdConstraintMessageCreateIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }


/**
 *
 * Sets the BsdConstraintMessage
 * @param bsdConstraintMessageCreateInIn Value of the bsdConstraintMessageCreateIn
 *
 */

  public void setBsdConstraintMessage(BsdConstraintMessageObjectBaseData bsdConstraintMessageCreateInIn) {
    bsdConstraintMessageCreateIn = bsdConstraintMessageCreateInIn;
  }

  public void translateFromMap() {
    bsdConstraintMessageCreateIn = BsdConstraintMessageObjectBaseHelper.fromMap(inputMap, "BsdConstraintMessage");
  }

/**
 *
 * Gets the BsdConstraintMessage
 * @return Value of the BsdConstraintMessage
 *
 */

  public BsdConstraintMessageObjectBaseData getBsdConstraintMessage( ) {
    return bsdConstraintMessageCreateIn;
  }

}
