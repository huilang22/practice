/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentTransCreateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a AxrtPaymentTransCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AxrtPaymentTransCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AxrtPaymentTransObjectData AxrtPaymentTransCreateIn;
/**
 *
 * Constructor to create a  AxrtPaymentTransCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AxrtPaymentTransCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentTransObjectData AxrtPaymentTransCreateInIn) {
    super(id, context, "AxrtPaymentTransCreate");
    AxrtPaymentTransCreateIn = AxrtPaymentTransCreateInIn;
  }

  public void translateToMap() {
    if (AxrtPaymentTransCreateIn != null) {
      AxrtPaymentTransCreateIn.resetFlags(true, true);
      addInput("AxrtPaymentTrans", AxrtPaymentTransObjectHelper.toMap(AxrtPaymentTransCreateIn, new HashMap(), "AxrtPaymentTrans").get("AxrtPaymentTrans"));
    }
  }


/**
 *
 * Sets the AxrtPaymentTrans
 * @param AxrtPaymentTransCreateInIn Value of the AxrtPaymentTransCreateIn
 *
 */

  public void setAxrtPaymentTrans(AxrtPaymentTransObjectData AxrtPaymentTransCreateInIn) {
    AxrtPaymentTransCreateIn = AxrtPaymentTransCreateInIn;
  }

  public void translateFromMap() {
    AxrtPaymentTransCreateIn = AxrtPaymentTransObjectHelper.fromMap(inputMap, "AxrtPaymentTrans");
  }

/**
 *
 * Gets the AxrtPaymentTrans
 * @return Value of the AxrtPaymentTrans
 *
 */

  public AxrtPaymentTransObjectData getAxrtPaymentTrans( ) {
    return AxrtPaymentTransCreateIn;
  }

}
