/*
 * Generated code DO NOT EDIT
 * Generated file: BsdLocaleSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdLocaleSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdLocaleSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdLocaleObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdLocaleSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdLocaleSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdLocaleObjectKeyData noOpInIn) {
    super(id, context, "BsdLocaleSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdLocale", BsdLocaleObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }
/**
 *
 * Sets the  BsdLocale
 * @param noOpInIn BsdLocaleObjectKeyData to set
 *
 */
  public void setBsdLocale(BsdLocaleObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdLocale passed into the constructor
 * @return Simulated response
 *
 */
  public BsdLocaleObjectKeyData getBsdLocale() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdLocaleObjectKeyHelper.fromMap(inputMap, "BsdLocale");
  }
}
