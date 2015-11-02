/*
 * Generated code DO NOT EDIT
 * Generated file: InvsResponsiblePartyUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsResponsiblePartyUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsResponsiblePartyUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsResponsiblePartyObjectData IRPUpdateIn;
/**
 *
 * Constructor to create a  InvsResponsiblePartyUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsResponsiblePartyUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsResponsiblePartyObjectData IRPUpdateInIn) {
    super(id, context, "InvsResponsiblePartyUpdate");
    IRPUpdateIn = IRPUpdateInIn;
  }

  public void translateToMap() {
    if (IRPUpdateIn != null) {
      IRPUpdateIn.resetFlags(true, true);
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(IRPUpdateIn, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }


/**
 *
 * Sets the InvsResponsibleParty
 * @param IRPUpdateInIn Value of the IRPUpdateIn
 *
 */

  public void setInvsResponsibleParty(InvsResponsiblePartyObjectData IRPUpdateInIn) {
    IRPUpdateIn = IRPUpdateInIn;
  }

  public void translateFromMap() {
    IRPUpdateIn = InvsResponsiblePartyObjectHelper.fromMap(inputMap, "InvsResponsibleParty");
  }

/**
 *
 * Gets the InvsResponsibleParty
 * @return Value of the InvsResponsibleParty
 *
 */

  public InvsResponsiblePartyObjectData getInvsResponsibleParty( ) {
    return IRPUpdateIn;
  }

}
