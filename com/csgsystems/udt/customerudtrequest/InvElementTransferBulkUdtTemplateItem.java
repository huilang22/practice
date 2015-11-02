/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementTransferBulkUdtTemplateItem.java
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
 * Class used to create a InvElementTransferBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementTransferBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvTransfrIn;
/**
 *
 * Constructor to create a  InvElementTransferBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementTransferBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvTransfrInIn) {
    super(id, context, "InvElementTransfer");
    InvTransfrIn = InvTransfrInIn;
  }

  public void translateToMap() {
    if (InvTransfrIn != null) {
      InvTransfrIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvTransfrIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvTransfrInIn Value of the InvTransfrIn
 *
 */

  public void setInvElement(InvElementObjData InvTransfrInIn) {
    InvTransfrIn = InvTransfrInIn;
  }

  public void translateFromMap() {
    InvTransfrIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvTransfrIn;
  }

}
