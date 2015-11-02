/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationInvAssocUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationInvAssocUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationInvAssocUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationInvAssocObjectData InvsLocationInvAssocUpdateIn;
/**
 *
 * Constructor to create a  InvsLocationInvAssocUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationInvAssocUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationInvAssocObjectData InvsLocationInvAssocUpdateInIn) {
    super(id, context, "InvsLocationInvAssocUpdate");
    InvsLocationInvAssocUpdateIn = InvsLocationInvAssocUpdateInIn;
  }

  public void translateToMap() {
    if (InvsLocationInvAssocUpdateIn != null) {
      InvsLocationInvAssocUpdateIn.resetFlags(true, true);
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(InvsLocationInvAssocUpdateIn, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }


/**
 *
 * Sets the InvsLocationInvAssoc
 * @param InvsLocationInvAssocUpdateInIn Value of the InvsLocationInvAssocUpdateIn
 *
 */

  public void setInvsLocationInvAssoc(InvsLocationInvAssocObjectData InvsLocationInvAssocUpdateInIn) {
    InvsLocationInvAssocUpdateIn = InvsLocationInvAssocUpdateInIn;
  }

  public void translateFromMap() {
    InvsLocationInvAssocUpdateIn = InvsLocationInvAssocObjectHelper.fromMap(inputMap, "InvsLocationInvAssoc");
  }

/**
 *
 * Gets the InvsLocationInvAssoc
 * @return Value of the InvsLocationInvAssoc
 *
 */

  public InvsLocationInvAssocObjectData getInvsLocationInvAssoc( ) {
    return InvsLocationInvAssocUpdateIn;
  }

}
