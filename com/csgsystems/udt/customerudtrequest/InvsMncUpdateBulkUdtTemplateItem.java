/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMncUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsMncUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsMncUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsMncObjectData InvsMncUpdateIn;
/**
 *
 * Constructor to create a  InvsMncUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsMncUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMncObjectData InvsMncUpdateInIn) {
    super(id, context, "InvsMncUpdate");
    InvsMncUpdateIn = InvsMncUpdateInIn;
  }

  public void translateToMap() {
    if (InvsMncUpdateIn != null) {
      InvsMncUpdateIn.resetFlags(true, true);
      addInput("InvsMnc", InvsMncObjectHelper.toMap(InvsMncUpdateIn, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }


/**
 *
 * Sets the InvsMnc
 * @param InvsMncUpdateInIn Value of the InvsMncUpdateIn
 *
 */

  public void setInvsMnc(InvsMncObjectData InvsMncUpdateInIn) {
    InvsMncUpdateIn = InvsMncUpdateInIn;
  }

  public void translateFromMap() {
    InvsMncUpdateIn = InvsMncObjectHelper.fromMap(inputMap, "InvsMnc");
  }

/**
 *
 * Gets the InvsMnc
 * @return Value of the InvsMnc
 *
 */

  public InvsMncObjectData getInvsMnc( ) {
    return InvsMncUpdateIn;
  }

}
