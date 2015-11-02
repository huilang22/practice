/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocGetNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a InvdWorkpointAssocGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdWorkpointAssocGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdWorkpointAssocObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdWorkpointAssocGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdWorkpointAssocGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdWorkpointAssocObjectData noOpInIn) {
    super(id, context, "InvdWorkpointAssocGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }
/**
 *
 * Sets the  InvdWorkpointAssoc
 * @param noOpInIn InvdWorkpointAssocObjectData to set
 *
 */
  public void setInvdWorkpointAssoc(InvdWorkpointAssocObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdWorkpointAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvdWorkpointAssocObjectData getInvdWorkpointAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdWorkpointAssocObjectHelper.fromMap(inputMap, "InvdWorkpointAssoc");
  }
}
