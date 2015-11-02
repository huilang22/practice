/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ExtendedDataEnumerationCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataEnumerationCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EDObjectData noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataEnumerationCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataEnumerationCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EDObjectData noOpInIn) {
    super(id, context, "ExtendedDataEnumerationCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(noOpIn, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }
/**
 *
 * Sets the  ExtendedDataEnumeration
 * @param noOpInIn EDObjectData to set
 *
 */
  public void setExtendedDataEnumeration(EDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataEnumeration passed into the constructor
 * @return Simulated response
 *
 */
  public EDObjectData getExtendedDataEnumeration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EDObjectHelper.fromMap(inputMap, "ExtendedDataEnumeration");
  }
}
