/*
 * Generated code DO NOT EDIT
 * Generated file: InvsResponsiblePartyGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsResponsiblePartyGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsResponsiblePartyGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsResponsiblePartyObjectKeyData IRPGetIn;
/**
 *
 * Constructor to create a  InvsResponsiblePartyGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsResponsiblePartyGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsResponsiblePartyObjectKeyData IRPGetInIn) {
    super(id, context, "InvsResponsiblePartyGet");
    IRPGetIn = IRPGetInIn;
  }

  public void translateToMap() {
    if (IRPGetIn != null) {
      IRPGetIn.resetFlags(true, true);
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectKeyHelper.toMap(IRPGetIn, new HashMap(), "InvsResponsiblePartyObjectKeyData").get("InvsResponsiblePartyObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsResponsibleParty
 * @param IRPGetInIn Value of the IRPGetIn
 *
 */

  public void setInvsResponsibleParty(InvsResponsiblePartyObjectKeyData IRPGetInIn) {
    IRPGetIn = IRPGetInIn;
  }

  public void translateFromMap() {
    IRPGetIn = InvsResponsiblePartyObjectKeyHelper.fromMap(inputMap, "InvsResponsibleParty");
  }

/**
 *
 * Gets the InvsResponsibleParty
 * @return Value of the InvsResponsibleParty
 *
 */

  public InvsResponsiblePartyObjectKeyData getInvsResponsibleParty( ) {
    return IRPGetIn;
  }

}
