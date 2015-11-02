/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementTransferReserveBulkUdtTemplateItem.java
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
 * Class used to create a InvElementTransferReserveBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementTransferReserveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvTransferResvIn;
/**
 *
 * Constructor to create a  InvElementTransferReserveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementTransferReserveBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvTransferResvInIn) {
    super(id, context, "InvElementTransferReserve");
    InvTransferResvIn = InvTransferResvInIn;
  }

  public void translateToMap() {
    if (InvTransferResvIn != null) {
      InvTransferResvIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvTransferResvIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvTransferResvInIn Value of the InvTransferResvIn
 *
 */

  public void setInvElement(InvElementObjData InvTransferResvInIn) {
    InvTransferResvIn = InvTransferResvInIn;
  }

  public void translateFromMap() {
    InvTransferResvIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvTransferResvIn;
  }

}
