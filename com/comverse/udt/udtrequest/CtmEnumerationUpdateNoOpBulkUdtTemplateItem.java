/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationUpdateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a CtmEnumerationUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmEnumerationUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmEnumerationObjectData noOpIn;

/**
 *
 * Constructor to create a   CtmEnumerationUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmEnumerationUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmEnumerationObjectData noOpInIn) {
    super(id, context, "CtmEnumerationUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(noOpIn, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }
/**
 *
 * Sets the  CtmEnumeration
 * @param noOpInIn CtmEnumerationObjectData to set
 *
 */
  public void setCtmEnumeration(CtmEnumerationObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmEnumeration passed into the constructor
 * @return Simulated response
 *
 */
  public CtmEnumerationObjectData getCtmEnumeration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmEnumerationObjectHelper.fromMap(inputMap, "CtmEnumeration");
  }
}
