/*
 * Generated code DO NOT EDIT
 * Generated file: CtmEnumerationUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtmEnumerationUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmEnumerationUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmEnumerationObjectData CtmEnumerationUpdateIn;
/**
 *
 * Constructor to create a  CtmEnumerationUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmEnumerationUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmEnumerationObjectData CtmEnumerationUpdateInIn) {
    super(id, context, "CtmEnumerationUpdate");
    CtmEnumerationUpdateIn = CtmEnumerationUpdateInIn;
  }

  public void translateToMap() {
    if (CtmEnumerationUpdateIn != null) {
      CtmEnumerationUpdateIn.resetFlags(true, true);
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(CtmEnumerationUpdateIn, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }


/**
 *
 * Sets the CtmEnumeration
 * @param CtmEnumerationUpdateInIn Value of the CtmEnumerationUpdateIn
 *
 */

  public void setCtmEnumeration(CtmEnumerationObjectData CtmEnumerationUpdateInIn) {
    CtmEnumerationUpdateIn = CtmEnumerationUpdateInIn;
  }

  public void translateFromMap() {
    CtmEnumerationUpdateIn = CtmEnumerationObjectHelper.fromMap(inputMap, "CtmEnumeration");
  }

/**
 *
 * Gets the CtmEnumeration
 * @return Value of the CtmEnumeration
 *
 */

  public CtmEnumerationObjectData getCtmEnumeration( ) {
    return CtmEnumerationUpdateIn;
  }

}
