/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcItemExtendedDataUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemExtendedDataUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemExtendedDataObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcItemExtendedDataUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemExtendedDataUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemExtendedDataObjectData noOpInIn) {
    super(id, context, "CtcItemExtendedDataUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }
/**
 *
 * Sets the  CtcItemExtendedData
 * @param noOpInIn CtcItemExtendedDataObjectData to set
 *
 */
  public void setCtcItemExtendedData(CtcItemExtendedDataObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemExtendedDataObjectData getCtcItemExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemExtendedDataObjectHelper.fromMap(inputMap, "CtcItemExtendedData");
  }
}
