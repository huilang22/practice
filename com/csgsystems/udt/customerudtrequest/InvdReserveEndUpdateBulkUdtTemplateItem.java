/*
 * Generated code DO NOT EDIT
 * Generated file: InvdReserveEndUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvdReserveEndUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdReserveEndUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdReserveEndObjectData InvdReserveEndUpdateIn;
/**
 *
 * Constructor to create a  InvdReserveEndUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdReserveEndUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdReserveEndObjectData InvdReserveEndUpdateInIn) {
    super(id, context, "InvdReserveEndUpdate");
    InvdReserveEndUpdateIn = InvdReserveEndUpdateInIn;
  }

  public void translateToMap() {
    if (InvdReserveEndUpdateIn != null) {
      InvdReserveEndUpdateIn.resetFlags(true, true);
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(InvdReserveEndUpdateIn, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }


/**
 *
 * Sets the InvdReserveEnd
 * @param InvdReserveEndUpdateInIn Value of the InvdReserveEndUpdateIn
 *
 */

  public void setInvdReserveEnd(InvdReserveEndObjectData InvdReserveEndUpdateInIn) {
    InvdReserveEndUpdateIn = InvdReserveEndUpdateInIn;
  }

  public void translateFromMap() {
    InvdReserveEndUpdateIn = InvdReserveEndObjectHelper.fromMap(inputMap, "InvdReserveEnd");
  }

/**
 *
 * Gets the InvdReserveEnd
 * @return Value of the InvdReserveEnd
 *
 */

  public InvdReserveEndObjectData getInvdReserveEnd( ) {
    return InvdReserveEndUpdateIn;
  }

}
