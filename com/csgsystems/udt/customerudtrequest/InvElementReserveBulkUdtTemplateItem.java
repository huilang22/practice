/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementReserveBulkUdtTemplateItem.java
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
 * Class used to create a InvElementReserveBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementReserveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvRsrvIn;
/**
 *
 * Constructor to create a  InvElementReserveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementReserveBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvRsrvInIn) {
    super(id, context, "InvElementReserve");
    InvRsrvIn = InvRsrvInIn;
  }

  public void translateToMap() {
    if (InvRsrvIn != null) {
      InvRsrvIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvRsrvIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvRsrvInIn Value of the InvRsrvIn
 *
 */

  public void setInvElement(InvElementObjData InvRsrvInIn) {
    InvRsrvIn = InvRsrvInIn;
  }

  public void translateFromMap() {
    InvRsrvIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvRsrvIn;
  }

}
