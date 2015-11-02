/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementUnReserveBulkUdtTemplateItem.java
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
 * Class used to create a InvElementUnReserveBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementUnReserveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvUnRsrvIn;
/**
 *
 * Constructor to create a  InvElementUnReserveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementUnReserveBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvUnRsrvInIn) {
    super(id, context, "InvElementUnReserve");
    InvUnRsrvIn = InvUnRsrvInIn;
  }

  public void translateToMap() {
    if (InvUnRsrvIn != null) {
      InvUnRsrvIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvUnRsrvIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvUnRsrvInIn Value of the InvUnRsrvIn
 *
 */

  public void setInvElement(InvElementObjData InvUnRsrvInIn) {
    InvUnRsrvIn = InvUnRsrvInIn;
  }

  public void translateFromMap() {
    InvUnRsrvIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvUnRsrvIn;
  }

}
