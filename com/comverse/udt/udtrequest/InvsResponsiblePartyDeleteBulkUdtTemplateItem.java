/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvsResponsiblePartyDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsResponsiblePartyDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsResponsiblePartyObjectKeyData IRPDeleteIn;
/**
 *
 * Constructor to create a  InvsResponsiblePartyDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsResponsiblePartyDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsResponsiblePartyObjectKeyData IRPDeleteInIn) {
    super(id, context, "InvsResponsiblePartyDelete");
    IRPDeleteIn = IRPDeleteInIn;
  }

  public void translateToMap() {
    if (IRPDeleteIn != null) {
      IRPDeleteIn.resetFlags(true, true);
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectKeyHelper.toMap(IRPDeleteIn, new HashMap(), "InvsResponsiblePartyObjectKeyData").get("InvsResponsiblePartyObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsResponsibleParty
 * @param IRPDeleteInIn Value of the IRPDeleteIn
 *
 */

  public void setInvsResponsibleParty(InvsResponsiblePartyObjectKeyData IRPDeleteInIn) {
    IRPDeleteIn = IRPDeleteInIn;
  }

  public void translateFromMap() {
    IRPDeleteIn = InvsResponsiblePartyObjectKeyHelper.fromMap(inputMap, "InvsResponsibleParty");
  }

/**
 *
 * Gets the InvsResponsibleParty
 * @return Value of the InvsResponsibleParty
 *
 */

  public InvsResponsiblePartyObjectKeyData getInvsResponsibleParty( ) {
    return IRPDeleteIn;
  }

}
