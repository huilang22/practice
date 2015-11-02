/*
 * Generated code DO NOT EDIT
 * Generated file: InvdWorkpointAssocUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvdWorkpointAssocUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdWorkpointAssocUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdWorkpointAssocObjectData InvdWorkpointAssocUpdateIn;
/**
 *
 * Constructor to create a  InvdWorkpointAssocUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdWorkpointAssocUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdWorkpointAssocObjectData InvdWorkpointAssocUpdateInIn) {
    super(id, context, "InvdWorkpointAssocUpdate");
    InvdWorkpointAssocUpdateIn = InvdWorkpointAssocUpdateInIn;
  }

  public void translateToMap() {
    if (InvdWorkpointAssocUpdateIn != null) {
      InvdWorkpointAssocUpdateIn.resetFlags(true, true);
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(InvdWorkpointAssocUpdateIn, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }


/**
 *
 * Sets the InvdWorkpointAssoc
 * @param InvdWorkpointAssocUpdateInIn Value of the InvdWorkpointAssocUpdateIn
 *
 */

  public void setInvdWorkpointAssoc(InvdWorkpointAssocObjectData InvdWorkpointAssocUpdateInIn) {
    InvdWorkpointAssocUpdateIn = InvdWorkpointAssocUpdateInIn;
  }

  public void translateFromMap() {
    InvdWorkpointAssocUpdateIn = InvdWorkpointAssocObjectHelper.fromMap(inputMap, "InvdWorkpointAssoc");
  }

/**
 *
 * Gets the InvdWorkpointAssoc
 * @return Value of the InvdWorkpointAssoc
 *
 */

  public InvdWorkpointAssocObjectData getInvdWorkpointAssoc( ) {
    return InvdWorkpointAssocUpdateIn;
  }

}
