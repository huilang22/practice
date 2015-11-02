/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsResponsiblePartyCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsResponsiblePartyCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsResponsiblePartyObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsResponsiblePartyCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsResponsiblePartyCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsResponsiblePartyObjectData noOpInIn) {
    super(id, context, "InvsResponsiblePartyCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(noOpIn, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }
/**
 *
 * Sets the  InvsResponsibleParty
 * @param noOpInIn InvsResponsiblePartyObjectData to set
 *
 */
  public void setInvsResponsibleParty(InvsResponsiblePartyObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsResponsibleParty passed into the constructor
 * @return Simulated response
 *
 */
  public InvsResponsiblePartyObjectData getInvsResponsibleParty() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsResponsiblePartyObjectHelper.fromMap(inputMap, "InvsResponsibleParty");
  }
}
