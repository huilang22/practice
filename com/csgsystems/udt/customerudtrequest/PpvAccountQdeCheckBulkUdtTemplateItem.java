/*
 * Generated code DO NOT EDIT
 * Generated file: PpvAccountQdeCheckBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * Class used to create a PpvAccountQdeCheckBulkUdtTemplateItem Bulk Template
 *
 */

public class PpvAccountQdeCheckBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PpvAccountObjectData __AccountIn;
/**
 *
 * Constructor to create a  PpvAccountQdeCheckBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PpvAccountQdeCheckBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvAccountObjectData __AccountInIn) {
    super(id, context, "PpvAccountQdeCheck");
    __AccountIn = __AccountInIn;
  }

  public void translateToMap() {
    if (__AccountIn != null) {
      __AccountIn.resetFlags(true, true);
      addInput("AccountIn", PpvAccountObjectHelper.toMap(__AccountIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
  }


/**
 *
 * Sets the AccountIn
 * @param __AccountInIn Value of the __AccountIn
 *
 */

  public void setAccountIn(PpvAccountObjectData __AccountInIn) {
    __AccountIn = __AccountInIn;
  }

  public void translateFromMap() {
    __AccountIn = PpvAccountObjectHelper.fromMap(inputMap, "AccountIn");
  }

/**
 *
 * Gets the AccountIn
 * @return Value of the AccountIn
 *
 */

  public PpvAccountObjectData getAccountIn( ) {
    return __AccountIn;
  }

}
