/*
 * Generated code DO NOT EDIT
 * Generated file: BsdLocaleUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdLocaleUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdLocaleUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdLocaleObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdLocaleUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdLocaleUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdLocaleObjectData noOpInIn) {
    super(id, context, "BsdLocaleUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(noOpIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }
/**
 *
 * Sets the  BsdLocale
 * @param noOpInIn BsdLocaleObjectData to set
 *
 */
  public void setBsdLocale(BsdLocaleObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdLocale passed into the constructor
 * @return Simulated response
 *
 */
  public BsdLocaleObjectData getBsdLocale() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdLocaleObjectHelper.fromMap(inputMap, "BsdLocale");
  }
}
