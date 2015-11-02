/*
 * Generated code DO NOT EDIT
 * Generated file: InvdWorkpointAssocCreateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvdWorkpointAssocCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdWorkpointAssocCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdWorkpointAssocObjectData InvdWorkpointAssocCreateIn;
/**
 *
 * Constructor to create a  InvdWorkpointAssocCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdWorkpointAssocCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdWorkpointAssocObjectData InvdWorkpointAssocCreateInIn) {
    super(id, context, "InvdWorkpointAssocCreate");
    InvdWorkpointAssocCreateIn = InvdWorkpointAssocCreateInIn;
  }

  public void translateToMap() {
    if (InvdWorkpointAssocCreateIn != null) {
      InvdWorkpointAssocCreateIn.resetFlags(true, true);
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(InvdWorkpointAssocCreateIn, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }


/**
 *
 * Sets the InvdWorkpointAssoc
 * @param InvdWorkpointAssocCreateInIn Value of the InvdWorkpointAssocCreateIn
 *
 */

  public void setInvdWorkpointAssoc(InvdWorkpointAssocObjectData InvdWorkpointAssocCreateInIn) {
    InvdWorkpointAssocCreateIn = InvdWorkpointAssocCreateInIn;
  }

  public void translateFromMap() {
    InvdWorkpointAssocCreateIn = InvdWorkpointAssocObjectHelper.fromMap(inputMap, "InvdWorkpointAssoc");
  }

/**
 *
 * Gets the InvdWorkpointAssoc
 * @return Value of the InvdWorkpointAssoc
 *
 */

  public InvdWorkpointAssocObjectData getInvdWorkpointAssoc( ) {
    return InvdWorkpointAssocCreateIn;
  }

}
