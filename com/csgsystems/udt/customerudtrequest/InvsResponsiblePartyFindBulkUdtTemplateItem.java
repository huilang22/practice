/*
 * Generated code DO NOT EDIT
 * Generated file: InvsResponsiblePartyFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsResponsiblePartyFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsResponsiblePartyFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsResponsiblePartyObjectFilter IRPFindIn;
/**
 *
 * Constructor to create a  InvsResponsiblePartyFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsResponsiblePartyFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsResponsiblePartyObjectFilter IRPFindInIn) {
    super(id, context, "InvsResponsiblePartyFind");
    IRPFindIn = IRPFindInIn;
  }

  public void translateToMap() {
    if (IRPFindIn != null) {
      Integer index =  IRPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(IRPFindIn, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }


/**
 *
 * Sets the InvsResponsibleParty
 * @param IRPFindInIn Value of the IRPFindIn
 *
 */

  public void setInvsResponsibleParty(InvsResponsiblePartyObjectFilter IRPFindInIn) {
    IRPFindIn = IRPFindInIn;
  }

  public void translateFromMap() {
    IRPFindIn = InvsResponsiblePartyObjectHelper.fromMapFilter(inputMap, "InvsResponsibleParty");
  }

/**
 *
 * Gets the InvsResponsibleParty
 * @return Value of the InvsResponsibleParty
 *
 */

  public InvsResponsiblePartyObjectFilter getInvsResponsibleParty( ) {
    return IRPFindIn;
  }

}
