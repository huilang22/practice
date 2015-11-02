/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsResponsiblePartyCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsResponsiblePartyCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsResponsiblePartyObjectData IRPCreateIn;
/**
 *
 * Constructor to create a  InvsResponsiblePartyCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsResponsiblePartyCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsResponsiblePartyObjectData IRPCreateInIn) {
    super(id, context, "InvsResponsiblePartyCreate");
    IRPCreateIn = IRPCreateInIn;
  }

  public void translateToMap() {
    if (IRPCreateIn != null) {
      IRPCreateIn.resetFlags(true, true);
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(IRPCreateIn, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }


/**
 *
 * Sets the InvsResponsibleParty
 * @param IRPCreateInIn Value of the IRPCreateIn
 *
 */

  public void setInvsResponsibleParty(InvsResponsiblePartyObjectData IRPCreateInIn) {
    IRPCreateIn = IRPCreateInIn;
  }

  public void translateFromMap() {
    IRPCreateIn = InvsResponsiblePartyObjectHelper.fromMap(inputMap, "InvsResponsibleParty");
  }

/**
 *
 * Gets the InvsResponsibleParty
 * @return Value of the InvsResponsibleParty
 *
 */

  public InvsResponsiblePartyObjectData getInvsResponsibleParty( ) {
    return IRPCreateIn;
  }

}
