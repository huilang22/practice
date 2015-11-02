/*
 * Generated code DO NOT EDIT
 * Generated file: CtmEnumerationGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a CtmEnumerationGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmEnumerationGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmEnumerationObjectKeyData CtmEnumerationGetIn;
/**
 *
 * Constructor to create a  CtmEnumerationGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmEnumerationGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmEnumerationObjectKeyData CtmEnumerationGetInIn) {
    super(id, context, "CtmEnumerationGet");
    CtmEnumerationGetIn = CtmEnumerationGetInIn;
  }

  public void translateToMap() {
    if (CtmEnumerationGetIn != null) {
      CtmEnumerationGetIn.resetFlags(true, true);
      addInput("CtmEnumeration", CtmEnumerationObjectKeyHelper.toMap(CtmEnumerationGetIn, new HashMap(), "CtmEnumerationObjectKeyData").get("CtmEnumerationObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtmEnumeration
 * @param CtmEnumerationGetInIn Value of the CtmEnumerationGetIn
 *
 */

  public void setCtmEnumeration(CtmEnumerationObjectKeyData CtmEnumerationGetInIn) {
    CtmEnumerationGetIn = CtmEnumerationGetInIn;
  }

  public void translateFromMap() {
    CtmEnumerationGetIn = CtmEnumerationObjectKeyHelper.fromMap(inputMap, "CtmEnumeration");
  }

/**
 *
 * Gets the CtmEnumeration
 * @return Value of the CtmEnumeration
 *
 */

  public CtmEnumerationObjectKeyData getCtmEnumeration( ) {
    return CtmEnumerationGetIn;
  }

}
