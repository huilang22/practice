/*
 * Generated code DO NOT EDIT
 * Generated file: InvsResponsiblePartyUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsResponsiblePartyUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsResponsiblePartyUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsResponsiblePartyObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsResponsiblePartyUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsResponsiblePartyUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsResponsiblePartyObjectData noOpInIn) {
    super(id, context, "InvsResponsiblePartyUpdate");
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
