/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementViewUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvElementViewUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementViewUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvViewUpdateIn;
/**
 *
 * Constructor to create a  InvElementViewUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementViewUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvViewUpdateInIn) {
    super(id, context, "InvElementViewUpdate");
    InvViewUpdateIn = InvViewUpdateInIn;
  }

  public void translateToMap() {
    if (InvViewUpdateIn != null) {
      InvViewUpdateIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvViewUpdateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvViewUpdateInIn Value of the InvViewUpdateIn
 *
 */

  public void setInvElement(InvElementObjData InvViewUpdateInIn) {
    InvViewUpdateIn = InvViewUpdateInIn;
  }

  public void translateFromMap() {
    InvViewUpdateIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvViewUpdateIn;
  }

}
